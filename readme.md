# Interview Practice - Java \(Spring Boot, Maven\)

## Project overview
This repository contains small, focused Java examples for interview practice: algorithmic problems, data-structure demos, concurrency, Stream API usage, and common design pattern implementations. A minimal Spring Boot entry point is included.

## Build \& run
1. Prerequisites:
    - Java JDK 11\+.
    - Maven.
    - IntelliJ IDEA (project developed on Windows).

2. Build:
    - `mvn clean package`

3. Run:
    - From IDE: run `com.practice.PracticeApplication` or any class with a `main` method.
    - From command line (jar): `java -jar target/<artifact>-<version>.jar`
    - To run individual examples: open the class in the IDE and run its `main` method.

## Project layout (important files / packages) with one-line explanations
- `src/main/java/com/practice/PracticeApplication.java` — [`PracticeApplication.java`](src/main/java/com/practice/PracticeApplication.java) \- Spring Boot entry point that boots the application.

- Core algorithm examples (`src/main/java/com/practice/core/`):
    - String algorithms (`src/main/java/com/practice/core/stringOpsProblem/`):
        - [`Anagram.java`](src/main/java/com/practice/core/stringOpsProblem/Anagram.java) \- checks if two strings are anagrams using frequency or sorting.
        - [`LongestSubStringLengthWithoutDuplicate.java`](src/main/java/com/practice/core/stringOpsProblem/LongestSubStringLengthWithoutDuplicate.java) \- sliding‑window to compute longest substring without repeating characters.
        - [`RemoveDuplicate.java`](src/main/java/com/practice/core/stringOpsProblem/RemoveDuplicate.java) \- removes duplicate characters from a string using set/two‑pointer approaches.
        - [`ReverseString.java`](src/main/java/com/practice/core/stringOpsProblem/ReverseString.java) \- demonstrates iterative and/or recursive string reversal.
        - [`StringCoreExamples.java`](src/main/java/com/practice/core/stringOpsProblem/StringCoreExamples.java) \- runnable demo that exercises the string utilities.
    - Two‑pointer algorithms (`src/main/java/com/practice/core/twoPointerProblem/`):
        - [`ColorSort.java`](src/main/java/com/practice/core/twoPointerProblem/ColorSort.java) \- Dutch National Flag implementation to sort colors in one pass.
        - [`MaxWaterInContainer.java`](src/main/java/com/practice/core/twoPointerProblem/MaxWaterInContainer.java) \- two‑pointer solution to find maximum water container area.
        - [`Pair.java`](src/main/java/com/practice/core/twoPointerProblem/Pair.java) \- simple generic pair utility used by examples.
        - [`ThreeSum.java`](src/main/java/com/practice/core/twoPointerProblem/ThreeSum.java) \- finds triplets that sum to zero using sorting and two pointers.

- Data structures (`src/main/java/com/practice/dataStructure/`):
    - [`BlockingQueueExample.java`](src/main/java/com/practice/dataStructure/BlockingQueueExample.java) \- producer/consumer demo using `BlockingQueue` for safe handoff.
    - [`PriorityQueueExample.java`](src/main/java/com/practice/dataStructure/PriorityQueueExample.java) \- demonstrates `PriorityQueue` ordering and custom comparators.

- Design patterns (`src/main/java/com/practice/designPattern/`):
    - Behavioural:
        - Iterator: [`IteratorDemo.java`](src/main/java/com/practice/designPattern/behavioural/iteratorPattern/IteratorDemo.java), [`Container.java`](src/main/java/com/practice/designPattern/behavioural/iteratorPattern/Container.java) \- custom iterator example showing traversal abstraction.
        - Observer: [`ObserverPatternExample.java`](src/main/java/com/practice/designPattern/behavioural/observerPattern/ObserverPatternExample.java) \- publisher/subscriber example demonstrating notify/subscribe.
        - Strategy: [`StrategyDemo.java`](src/main/java/com/practice/designPattern/behavioural/strategyPattern/StrategyDemo.java), [`PaymentStrategy.java`](src/main/java/com/practice/designPattern/behavioural/strategyPattern/PaymentStrategy.java) \- runtime selection of payment strategies without changing client code.
    - Creational:
        - Builder: [`BuilderPatternExample.java`](src/main/java/com/practice/designPattern/creational/builderPattern/BuilderPatternExample.java) \- fluent builder usage for constructing complex objects.
        - Factory: [`FactoryDesignPatternExample.java`](src/main/java/com/practice/designPattern/creational/factoryPattern/FactoryDesignPatternExample.java) \- simple factory producing `Vehicle` implementations.
        - Prototype: [`PrototypePatternExample.java`](src/main/java/com/practice/designPattern/creational/prototypePattern/PrototypePatternExample.java) \- demonstrates cloning via prototype interface.
        - Singleton: [`SingletonPattern.java`](src/main/java/com/practice/designPattern/creational/singletonPattern/SingletonPattern.java) \- singleton implementation examples and usage.
    - Structural:
        - Adapter: [`AdapterPatternExample.java`](src/main/java/com/practice/designPattern/structural/adapterPattern/AdapterPatternExample.java) \- adapts an `OldInterface` to new client expectations.
        - Proxy: [`ProxyPatternExample.java`](src/main/java/com/practice/designPattern/structural/proxyPattern/ProxyPatternExample.java) \- proxy layer demonstrating access control or delegation.

- DTOs and misc:
    - [`Employee.java`](src/main/java/com/practice/dto/Employee.java) \- sample data transfer object used in demos.
    - [`FirstIndexOfSubArray.java`](src/main/java/com/practice/random/FirstIndexOfSubArray.java) \- finds first occurrence index of a subarray in an array.
    - [`StreamPractice.java`](src/main/java/com/practice/stream/StreamPractice.java) \- examples of Stream API operations: map, filter, collect, grouping.
    - Threading:
        - [`ThreadExample.java`](src/main/java/com/practice/thread/ThreadExample.java) \- basic thread creation and coordination examples.
        - [`CompletableFuteureExample.java`](src/main/java/com/practice/thread/CompletableFuteureExample.java) \- `CompletableFuture` chaining and async composition.
    - Utilities:
        - [`Constants.java`](src/main/java/com/practice/utils/Constants.java) \- shared constant values used across examples.
    - Misc:
        - [`ImmutableExample.java`](src/main/java/com/practice/core/ImmutableExample.java) \- demonstrates building immutable objects and safe sharing.

## Key concepts demonstrated
- Sliding window: [`LongestSubStringLengthWithoutDuplicate.java`](src/main/java/com/practice/core/stringOpsProblem/LongestSubStringLengthWithoutDuplicate.java) \- efficient O\(n\) window expansion/contraction.
- Two‑pointer technique: [`MaxWaterInContainer.java`](src/main/java/com/practice/core/twoPointerProblem/MaxWaterInContainer.java), [`ThreeSum.java`](src/main/java/com/practice/core/twoPointerProblem/ThreeSum.java) \- sorting plus two pointers to reduce search complexity.
- Concurrency: [`BlockingQueueExample.java`](src/main/java/com/practice/dataStructure/BlockingQueueExample.java), [`CompletableFuteureExample.java`](src/main/java/com/practice/thread/CompletableFuteureExample.java) \- producer/consumer and async composition patterns.
- Design patterns: see files under `src/main/java/com/practice/designPattern/` for small, self‑contained demos.

## Quick run tips
- Run any example in IntelliJ: open the file (for example `src/main/java/com/practice/core/stringOpsProblem/StringCoreExamples.java`) and click Run.
- Run a single class from Maven: `mvn -Dexec.mainClass="com.practice.core.stringOpsProblem.StringCoreExamples" exec:java`
- Run Spring Boot app: `mvn spring-boot:run` or run `src/main/java/com/practice/PracticeApplication.java` from IDE.

## Suggestions for extending repository
- Add unit tests under `src/test/java` (JUnit 5).
- Add example inputs/outputs and complexity notes near algorithm classes.
- Convert selected demos into reusable libraries with tests.

## License / Contributing
- Intended for personal practice. Contributions welcome: add clear examples, comments, and unit tests.
