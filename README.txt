# Java Interview Basics with Examples

This repository contains a series of **Java interview questions** along with **runnable examples**. The examples cover Java concepts from **Java 8 to Java 21**, including **threads, lambdas, streams, functional interfaces, CompletableFuture, ReentrantLock, Semaphore, virtual threads, structured concurrency, modules, records, switch patterns**, and more.

Each example is accompanied by comments and explanations, making it easy to learn and understand core Java concepts for interviews or practical usage.

--

## Table of Contents

- [Q01: Lambda Basics](#q01-lambda-basics)
- [Q02: Method References](#q02-method-references)
- [Q03: Functional Interfaces](#q03-functional-interfaces)
- [Q04: Streams - Filter and Map](#q04-streams---filter-and-map)
- [Q05: Streams - Reduce](#q05-stream-reduce)
- [Q06: Collectors - Grouping](#q06-collectors---grouping)
- [Q07: Optional Basics](#q07-optional-basics)
- [Q08: Optional - orElse and orElseGet](#q08-optional---orelse-and-orelseget)
- [Q09: Parallel Streams](#q09-parallel-streams)
- [Q10: CompletableFuture Basics](#q10-completablefuture-basics)
- [Q11: CompletableFuture - Chaining](#q11-completablefuture---chaining)
- [Q12: CompletableFuture - Exception Handling](#q12-completablefuture---exception-handling)
- [More Advanced Examples](#more-advanced-examples)

---

## Q01: Lambda Basics

**Objective:** Understand the syntax and usage of lambda expressions in Java.

```java
Runnable r = () -> System.out.println("Hello from Lambda!");
r.run();
Explanation: Demonstrates a simple lambda expression implementing the Runnable interface.

Q02: Method References
Objective: Use method references as a shorthand for lambda expressions.

java
Copy code
Runnable r = MyClass::printMessage;
r.run();
Explanation: Replaces a lambda with a method reference for cleaner code.

Q03: Functional Interfaces
Objective: Learn about functional interfaces and using lambdas to implement them.

java
Copy code
@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}
MyFunctionalInterface myFunc = () -> System.out.println("Executing functional interface!");
myFunc.execute();
Q04: Streams - Filter and Map
java
Copy code
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<String> filteredNames = names.stream()
                                  .filter(n -> n.startsWith("A"))
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());
Explanation: Filters and transforms elements using Stream operations.

Q05: Streams - Reduce
java
Copy code
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
sum.ifPresent(System.out::println);
Explanation: Combines elements of a stream into a single result.

Q06: Collectors - Grouping
java
Copy code
List<String> words = Arrays.asList("apple", "banana", "apricot");
Map<Character, List<String>> groupedWords = words.stream()
    .collect(Collectors.groupingBy(word -> word.charAt(0)));
Explanation: Groups elements based on a key.

Q07: Optional Basics
java
Copy code
Optional<String> name = Optional.ofNullable("John");
name.ifPresent(System.out::println);
Explanation: Safely handles potential null values.

Q08: Optional - orElse and orElseGet
java
Copy code
Optional<String> name = Optional.empty();
String defaultName = name.orElse("Default Name");
String generatedName = name.orElseGet(() -> "Generated Name");
Explanation: Provides default values when Optional is empty.

Q09: Parallel Streams
java
Copy code
numbers.parallelStream()
       .forEach(n -> System.out.println(Thread.currentThread().getName() + ": " + n));
Explanation: Processes elements concurrently.

Q10: CompletableFuture Basics
java
Copy code
CompletableFuture<Void> future = CompletableFuture.runAsync(() ->
    System.out.println("Asynchronous task executed!")
);
future.join();
Q11: CompletableFuture - Chaining
java
Copy code
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5)
    .thenApplyAsync(x -> x * 2)
    .thenApplyAsync(x -> x + 3);
future.thenAccept(System.out::println).join();
Q12: CompletableFuture - Exception Handling
java
Copy code
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
    throw new RuntimeException("Exception occurred!");
}).exceptionally(ex -> {
    System.out.println("Handled: " + ex.getMessage());
    return -1;
});
future.join();
More Advanced Examples
The repository also includes advanced Java 8–21 examples covering:

ReentrantLock: Thread-safe locks with fairness and conditions.

Semaphore & Binary Semaphore: Controlling concurrent access to resources.

Virtual Threads (Project Loom): Lightweight threads in Java 21.

Structured Concurrency: Managing multiple tasks safely and cleanly.

Records: Immutable data carriers (Java 16+).

Switch Pattern Matching: Enhanced switch features in recent JDKs.

Sequenced Collections: Collections that maintain insertion order.

How to Run the Examples
Clone the Repository:

bash
Copy code
git clone https://github.com/haroonob/java-interview-basic-with-example.git
cd java-interview-basic-with-example
Compile and Run a Specific Example:

bash
Copy code
javac Q01_LambdaBasics.java
java Q01_LambdaBasics
Java 21 Preview Features: For examples using Structured Concurrency or Virtual Threads, add:

bash
Copy code
javac --enable-preview --release 21 Q48_StructuredConcurrencyComment.java
java --enable-preview Q48_StructuredConcurrencyComment
Conclusion
This repository is a comprehensive collection of Java interview questions and practical examples. It covers both core Java and modern features up to Java 21, including concurrent programming, streams, lambdas, and modules.

Use these examples to practice coding, understand concepts, and prepare for Java interviews.
