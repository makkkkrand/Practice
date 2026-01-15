#!/bin/bash

# Unified Menu-driven Git push script with repo validation and creation

FOLDER_NAME=$(basename "$(pwd)")
REPO_URL=$1
BRANCH_NAME=${2:-master}
MERGE_STRATEGY=${3:-merge}

# --- Repository URL selection ---
if [ -z "$REPO_URL" ]; then
  echo "Choose repository option:"
  echo "1) Enter custom repository URL"
  echo "2) Use default (https://github.com/${GITHUB_USERNAME:-<your-username>}/$FOLDER_NAME.git)"
  read -p "Enter choice [1-2]: " repo_choice

  if [ "$repo_choice" == "1" ]; then
    read -p "Enter repository URL: " REPO_URL
  else
    REPO_URL="https://github.com/${GITHUB_USERNAME:-<your-username>}/$FOLDER_NAME.git"
    echo "Using default repo: $REPO_URL"
  fi
fi

# Strip trailing slashes
REPO_URL=$(echo "$REPO_URL" | sed 's:/*$::')
REPO_NAME=$(basename "$REPO_URL" .git)

# --- Validate repo existence ---
if ! git ls-remote $REPO_URL &>/dev/null; then
  echo "Repository $REPO_NAME not found on GitHub."
  read -p "Do you want to create it now? (yes/no): " create_choice
  if [ "$create_choice" == "yes" ]; then
    if [ -n "$GITHUB_TOKEN" ] && [ -n "$GITHUB_USERNAME" ]; then
      echo "Creating repository $REPO_NAME under $GITHUB_USERNAME..."
      curl -H "Authorization: token $GITHUB_TOKEN" \
           -d "{\"name\":\"$REPO_NAME\"}" \
           https://api.github.com/user/repos
    else
      echo "Error: GITHUB_TOKEN and GITHUB_USERNAME must be set to create repos."
      exit 1
    fi
  else
    echo "Aborting push since repo does not exist."
    exit 1
  fi
fi

# --- Branch selection menu ---
echo "Choose branch:"
echo "1) master (default)"
echo "2) main"
echo "3) custom"
read -p "Enter choice [1-3]: " branch_choice

case $branch_choice in
  1) BRANCH_NAME="master" ;;
  2) BRANCH_NAME="main" ;;
  3) read -p "Enter branch name: " BRANCH_NAME ;;
  *) BRANCH_NAME="master" ;;
esac

# --- Strategy selection menu ---
echo "Choose push strategy:"
echo "1) merge (default, keeps both histories)"
echo "2) force (overwrite remote)"
read -p "Enter choice [1-2]: " strategy_choice

case $strategy_choice in
  1) MERGE_STRATEGY="merge" ;;
  2) MERGE_STRATEGY="force" ;;
  *) MERGE_STRATEGY="merge" ;;
esac

# --- Token injection if available ---
if [ -n "$GITHUB_TOKEN" ] && [ -n "$GITHUB_USERNAME" ]; then
  echo "Using GitHub token for authentication..."
  REPO_URL="https://${GITHUB_USERNAME}:${GITHUB_TOKEN}@github.com/${GITHUB_USERNAME}/$REPO_NAME.git"
fi

# --- Git workflow ---
if [ ! -d ".git" ]; then
  echo "Initializing git..."
  git init
fi

git add .
git commit -m "Automated commit from script"

git branch -M $BRANCH_NAME

if ! git remote | grep -q origin; then
  git remote add origin $REPO_URL
else
  git remote set-url origin $REPO_URL
fi

if [ "$MERGE_STRATEGY" == "merge" ]; then
  echo "Merging with remote using --allow-unrelated-histories..."
  git pull origin $BRANCH_NAME --allow-unrelated-histories || true
  git push -u origin $BRANCH_NAME
elif [ "$MERGE_STRATEGY" == "force" ]; then
  echo "⚠️ Force push selected!"
  read -p "Are you sure you want to overwrite remote history? (yes/no): " confirm_force
  if [ "$confirm_force" == "yes" ]; then
    git push -u origin $BRANCH_NAME --force
  else
    echo "Force push aborted."
  fi
fi