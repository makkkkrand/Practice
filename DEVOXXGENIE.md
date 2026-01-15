# DEVOXXGENIE.md

## Project Guidelines

### Build Commands

- **Build:** `./gradlew build`
- **Test:** `./gradlew test`
- **Single Test:** `./gradlew test --tests ClassName.methodName`
- **Clean:** `./gradlew clean`
- **Run:** `./gradlew run`

### Code Style

- **Formatting:** Use IDE or checkstyle for formatting
- **Naming:**
  - Use camelCase for variables, methods, and fields
  - Use PascalCase for classes and interfaces
  - Use SCREAMING_SNAKE_CASE for constants
- **Documentation:** Use JavaDoc for documentation
- **Imports:** Organize imports and avoid wildcard imports
- **Exception Handling:** Prefer specific exceptions and document throws



### Project Tree

```
Practice/
  src/
    main/
      java/
        com/
          practice/
            aop/
            dto/
              Client.java
              Vehicle.java
              Employee.java
              TwoWheeler.java
              FourWheeler.java
              SingletonClass.java
            core/
              ArrayExample.java
              twoPointerProblem/
                Pair.java
                ThreeSum.java
                ColorSort.java
                MaxWaterInContainer.java
              StringCoreExamples.java
            utils/
              Constants.java
            stream/
              StreamPractice.java
            thread/
              ThreadExample.java
              CompletableFuteureExample.java
            dataStructure/
              BlockingQueueExample.java
              PriorityQueueExample.java
            designPattern/
              ImmutableExample.java
              SingletonPattern.java
              FactoryDesignPatternExample.java
            PracticeApplication.java
      resources/
        static/
        templates/
        application.properties
    test/
      java/
        com/
          practice/
            PracticeApplicationTests.java
  .mvn/
    wrapper/
      maven-wrapper.properties
  HELP.md
  pom.xml
  .settings/
  DEVOXXGENIE.md

```
