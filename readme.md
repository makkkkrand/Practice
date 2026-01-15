\# Interview Practice - Java \(Spring Boot, Maven\)

## Project overview
This repository contains small, focused Java examples for interview practice: algorithmic problems (string and two-pointer), data-structure demos, concurrency, stream API usage, and common design pattern implementations. A minimal Spring Boot entry point is included for completeness.

\## Build & run
1. Prerequisites:
    - Java JDK 11+.
    - Maven.
    - IntelliJ IDEA (project developed on Windows).

2. Build:
    - `mvn clean package`

3. Run:
    - From IDE: run `com.practice.PracticeApplication` or any class with a `main` method.
    - From command line (jar): `java -jar target/<artifact>-<version>.jar`
    - To run individual examples: open the class in the IDE and run its `main` method.

\## Project layout (important files / packages)
- `src/main/java/com/practice/PracticeApplication.java`  
  Spring Boot application entry point \(minimal\).

- `src/main/java/com/practice/core/`  
  Core algorithm examples.
    - `stringOpsProblem/`:
        - `Anagram.java` — check if two strings are anagrams (frequency counting or sorting).
        - `LongestSubStringLengthWithoutDuplicate.java` — sliding\-window to find longest substring with unique characters.
        - `RemoveDuplicate.java` — remove duplicate characters from a string \(approaches using set or two-pointer\).
        - `ReverseString.java` — reverse string implementations (iterative and/or recursive).
        - `StringCoreExamples.java` — runner demonstrating the string utilities.
    - `twoPointerProblem/`:
        - `ColorSort.java` — Dutch National Flag problem implementation (three\-way partitioning).
        - `MaxWaterInContainer.java` — two-pointer approach to compute max area between lines.
        - `Pair.java` — simple pair utility used by some examples.
        - `ThreeSum.java` — find triplets that sum to zero (two-pointer after sorting).

- `src/main/java/com/practice/dataStructure/`
    - `BlockingQueueExample.java` — producer/consumer demo using `BlockingQueue`.
    - `PriorityQueueExample.java` — usage of Java `PriorityQueue` for ordering.

- `src/main/java/com/practice/designPattern/`
    - `behavioural/iteratorPattern/`
        - `IteratorDemo.java`, `Container.java`, `Iterator.java`, `NameRepository.java` — simple custom iterator example showing traversal abstraction.
    - `behavioural/observerPattern/`
        - `ObserverPatternExample.java`, `Observer.java`, `ConcreteObserver.java`, `Register.java`, `ConcreteRegister.java`, `Publish.java` — classic observer/publisher pattern \(register observers and notify on change\).
    - `behavioural/strategyPattern/`
        - `PaymentStrategy.java`, `CreditCardPayment.java`, `UpiPayment.java`, `PaymentContext.java`, `StrategyDemo.java` — strategy pattern for payment methods.
    - `creational/`
        - `builderPattern/` — `BuilderPattern.java`, `BuilderPatternExample.java` — fluent builder usage.
        - `factoryPattern/` — `FactoryDesignPatternExample.java`, `Vehicle.java`, `TwoWheeler.java`, `FourWheeler.java`, `Client.java` — factory method/simple factory.
        - `prototypePattern/` — `PrototypePatternExample.java`, `PrototypeInterface.java`, `ConcretePrototype.java` — object cloning demonstration.
        - `singletonPattern/` — `SingletonPattern.java`, `SingletonClass.java` — singleton implementations.
    - `structural/adapterPattern/` — adapter example bridging `OldInterface` to new clients.
    - `structural/proxyPattern/` — proxy examples plus request/response DTOs.

- `src/main/java/com/practice/dto/`
    - `Employee.java` — sample DTO used in examples/tests.

- `src/main/java/com/practice/random/`
    - `FirstIndexOfSubArray.java` — example problem for subarray search.

- `src/main/java/com/practice/stream/`
    - `StreamPractice.java` — demonstrations of Stream API \(map/filter/collect/grouping\).

- `src/main/java/com/practice/thread/`
    - `ThreadExample.java` — thread creation and coordination.
    - `CompletableFuteureExample.java` — `CompletableFuture` usage \(async composition\).

- `src/main/java/com/practice/utils/`
    - `Constants.java` — reused constants.

\## Key concepts & how the examples demonstrate them
- Sliding window (strings): `LongestSubStringLengthWithoutDuplicate.java` uses two indices (left/right) and a character index map to expand/contract the window in O\(n\) time.
- Two\-pointer technique: `MaxWaterInContainer.java` and `ThreeSum.java` show sorting + two pointers to reduce complexity from O\(n^2\) naive to O\(n^2\) optimized for pair searches.
- Concurrency primitives: `BlockingQueueExample.java` demonstrates safe producer/consumer patterns, while `CompletableFuteureExample.java` shows chaining async tasks with `thenApply` / `thenAccept`.
- Design patterns: each pattern package contains a minimal, self-contained example illustrating intent, participants, and typical usage. For example, `StrategyDemo.java` shows runtime selection of `PaymentStrategy` without changing client code.

\## How to run specific examples quickly
- In IntelliJ IDEA: open the class (for example `src/main/java/com/practice/core/stringOpsProblem/StringCoreExamples.java`) and run its `main` method.
- From command line (single class execution):
    - Compile and run via Maven exec plugin (add plugin or run `mvn -q -Dexec.mainClass="com.practice.core.stringOpsProblem.StringCoreExamples" exec:java`).
- For Spring Boot app: run `PracticeApplication` from the IDE or use `mvn spring-boot:run`.

\## Suggestions for extending repository
- Add unit tests under `src/test/java` for each algorithm class (use JUnit 5).
- Add README snippets for each package showing example inputs/outputs.
- Add boundary tests and complexity notes in algorithm classes.

\## Notes
- Files with `Example` or `Demo` in the name are runnable samples with `main`.
- The code is intentionally small and didactic; refactor and add tests when converting examples into production code.

\## License / Contributing
- Intended for personal practice. Contributions welcome: add clear examples, comments, and unit tests.
