# Java Interview Basics with Examples

This repository contains a series of **Java interview questions** along with **runnable examples**.  
The examples cover Java concepts from **Java 8 to Java 21**, including:

- Lambdas & Method References
- Streams & Optionals
- CompletableFuture & Concurrency APIs
- ReentrantLock & Semaphore
- Virtual Threads (Project Loom)
- Structured Concurrency
- Records, Modules, Switch Patterns
- Sequenced Collections

Each example is explained with **description, use case, and solution**, making it easy to learn and prepare for Java interviews or apply in real projects.

---

## Table of Contents

- [Q01: Lambda Basics](#q01-lambda-basics)
- [Q02: Method References](#q02-method-references)
- [Q03: Functional Interfaces](#q03-functional-interfaces)
- [Q04: Streams - Filter and Map](#q04-streams---filter-and-map)
- [Q05: Streams - Reduce](#q05-streams---reduce)
- [Q06: Collectors - Grouping](#q06-collectors---grouping)
- [Q07: Optional Basics](#q07-optional-basics)
- [Q08: Optional - orElse and orElseGet](#q08-optional---orelse-and-orelseget)
- [Q09: Parallel Streams](#q09-parallel-streams)
- [Q10: CompletableFuture Basics](#q10-completablefuture-basics)
- [Q11: CompletableFuture - Chaining](#q11-completablefuture---chaining)
- [Q12: CompletableFuture - Exception Handling](#q12-completablefuture---exception-handling)
- [Advanced Examples](#advanced-examples)

---

## Q01: Lambda Basics

**Description:**  
Lambda expressions provide a concise way to implement functional interfaces.

**Use Case:**  
Used in collections, event listeners, concurrency, and functional-style APIs.

**Solution:**
```java
Runnable r = () -> System.out.println("Hello from Lambda!");
r.run();
```

---

## Q02: Method References

**Description:**  
Method references simplify lambdas by reusing existing methods.

**Use Case:**  
Cleaner syntax when method logic is already implemented.

**Solution:**
```java
class MyClass {
    static void printMessage() {
        System.out.println("Hello from Method Reference!");
    }
}

Runnable r = MyClass::printMessage;
r.run();
```

---

## Q03: Functional Interfaces

**Description:**  
A functional interface has a single abstract method, making it compatible with lambdas.

**Use Case:**  
Core to Java functional programming (`Predicate`, `Consumer`, etc.).

**Solution:**
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}

MyFunctionalInterface myFunc = () -> System.out.println("Executing functional interface!");
myFunc.execute();
```

---

## Q04: Streams - Filter and Map

**Description:**  
Streams process collections declaratively.

**Use Case:**  
Filtering and transforming lists.

**Solution:**
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<String> filtered = names.stream()
                             .filter(n -> n.startsWith("A"))
                             .map(String::toUpperCase)
                             .toList();
System.out.println(filtered); // [ALICE]
```

---

## Q05: Streams - Reduce

**Description:**  
Reduce combines elements into a single result.

**Use Case:**  
Summation, aggregation, concatenation.

**Solution:**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
sum.ifPresent(System.out::println); // 15
```

---

## Q06: Collectors - Grouping

**Description:**  
Collectors group elements by a key.

**Use Case:**  
Building maps of categorized data.

**Solution:**
```java
List<String> words = Arrays.asList("apple", "banana", "apricot");
Map<Character, List<String>> grouped = words.stream()
        .collect(Collectors.groupingBy(w -> w.charAt(0)));
System.out.println(grouped); // {a=[apple, apricot], b=[banana]}
```

---

## Q07: Optional Basics

**Description:**  
Optional prevents null pointer exceptions.

**Use Case:**  
Return values that may be missing.

**Solution:**
```java
Optional<String> name = Optional.ofNullable("John");
name.ifPresent(System.out::println); // John
```

---

## Q08: Optional - orElse and orElseGet

**Description:**  
Provides default values if empty.

**Use Case:**  
Safe fallbacks for missing data.

**Solution:**
```java
Optional<String> name = Optional.empty();
String defaultName = name.orElse("Default Name");
String generated = name.orElseGet(() -> "Generated Name");
System.out.println(defaultName); // Default Name
System.out.println(generated);   // Generated Name
```

---

## Q09: Parallel Streams

**Description:**  
Parallel streams split work across threads.

**Use Case:**  
Large data processing with parallelism.

**Solution:**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream()
       .forEach(n -> System.out.println(Thread.currentThread().getName() + ": " + n));
```

---

## Q10: CompletableFuture Basics

**Description:**  
CompletableFuture runs async tasks.

**Use Case:**  
Background operations without blocking.

**Solution:**
```java
CompletableFuture<Void> future =
    CompletableFuture.runAsync(() -> System.out.println("Async task executed!"));
future.join();
```

---

## Q11: CompletableFuture - Chaining

**Description:**  
Compose multiple async steps.

**Use Case:**  
Pipelines of dependent async tasks.

**Solution:**
```java
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5)
    .thenApply(x -> x * 2)
    .thenApply(x -> x + 3);

future.thenAccept(System.out::println).join(); // 13
```

---

## Q12: CompletableFuture - Exception Handling

**Description:**  
Handle exceptions gracefully in async flows.

**Use Case:**  
Resilient async processing.

**Solution:**
```java
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
    throw new RuntimeException("Error!");
}).exceptionally(ex -> {
    System.out.println("Handled: " + ex.getMessage());
    return -1;
});
System.out.println(future.join()); // -1
```

---

## Advanced Examples

- **ReentrantLock:** Fine-grained lock control with fairness policies.
- **Semaphore / Binary Semaphore:** Limit concurrent access to resources.
- **Virtual Threads (Java 21):** Lightweight concurrency model (Project Loom).
- **Structured Concurrency (Java 21 preview):** Manage multiple async tasks as a unit.
- **Records (Java 16+):** Immutable data carriers with compact syntax.
- **Switch Pattern Matching (Java 17+):** Cleaner, safer switch expressions.
- **Sequenced Collections (Java 21):** Collections maintaining insertion order.

---

## How to Run the Examples

1. **Clone the repository:**
```bash
git clone https://github.com/haroonob/java-interview-basic-with-example.git
cd java-interview-basic-with-example
```

2. **Compile and run an example:**
```bash
javac Q01_LambdaBasics.java
java Q01_LambdaBasics
```

3. **Run Java 21 preview features (Structured Concurrency, Virtual Threads):**
```bash
javac --enable-preview --release 21 Q48_StructuredConcurrencyComment.java
java --enable-preview Q48_StructuredConcurrencyComment
```

---

## Conclusion

This repository is a **practical guide for Java interviews and learning modern Java**.  
It covers essential concepts from **Java 8–21**, including **functional programming, streams, concurrency, and new JDK features**.

Use these examples to **practice coding, strengthen concepts, and prepare confidently** for interviews.
