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

# Java Interview Basics - Q01 to Q20

## Questions Q01–Q20

### Q01: Lambda Basics

**Description:**  
This example demonstrates the use of **lambda expressions** in Java 8 or later to filter and print even numbers. Lambdas allow concise, functional-style operations on collections without verbose loops or separate classes.

**Use Case:**  
Filtering or transforming lists, applying operations on streams, or event handling in GUI or backend systems.

**Solution:**
- Convert the collection into a stream using `.stream()`.
- Filter even numbers using a lambda (`n -> n % 2 == 0`).
- Print elements with `.forEach(System.out::println)`.

**Best Practices:**
- Use lambdas for short, simple operations.
- Prefer method references for readability.
- Avoid side effects inside lambdas.

**References:**
- [Oracle Lambda Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
- [Baeldung Lambda Tutorial](https://www.baeldung.com/java-8-lambda-expressions)

---

### Q02: Method References

**Description:**  
Shows method references as shorthand for lambdas. Improves code readability by pointing to an existing method directly.

**Use Case:**  
Simplifying code when an existing method matches the functional interface signature, e.g., printing collection elements.

**Solution:**
- Use `.forEach(System.out::println)` to print elements.

**Best Practices:**
- Use method references when possible.
- Ensure method signature matches the expected interface.
- Avoid method references in complex expressions.

**References:**
- [Oracle Method References](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)
- [Baeldung Method References](https://www.baeldung.com/java-8-method-references)

---

### Q03: Functional Interfaces

**Description:**  
Functional interfaces have a single abstract method and can be implemented using lambdas or method references.

**Use Case:**  
Used as target types for lambdas, e.g., `Runnable`, `Callable`, or custom interfaces.

**Solution:**
- Define a functional interface with `@FunctionalInterface`.
- Implement it using a lambda expression.

**Best Practices:**
- Keep interfaces single-responsibility.
- Avoid multiple abstract methods.
- Use `@FunctionalInterface` annotation.

**References:**
- [Oracle Functional Interfaces](https://docs.oracle.com/javase/tutorial/java/javaOO/functionalinterfaces.html)
- [Baeldung Functional Interfaces](https://www.baeldung.com/java-8-functional-interfaces)

---

### Q04: Streams Filter and Map

**Description:**  
Demonstrates filtering and mapping elements in a stream. Provides a declarative way to process sequences.

**Use Case:**  
Filter elements and apply transformations efficiently in collections.

**Solution:**
- `.filter(n -> n % 2 == 0)` to select even numbers.
- `.map(n -> n * n)` to square numbers.
- Collect with `.collect(Collectors.toList())`.

**Best Practices:**
- Avoid side effects in stream operations.
- Use method references where appropriate.
- Chains of operations should be readable.

**References:**
- [Oracle Streams](https://docs.oracle.com/javase/tutorial/collections/streams/)
- [Baeldung Streams](https://www.baeldung.com/java-8-streams)

---

### Q05: Stream Reduce

**Description:**  
Demonstrates aggregating stream elements with `.reduce()`. Returns an `Optional` for combined results.

**Use Case:**  
Summing numbers, finding maximum/minimum, concatenating strings.

**Solution:**
- `.reduce((a, b) -> a + b)` to sum numbers.
- Handle result using `Optional.ifPresent()`.

**Best Practices:**
- Ensure accumulator is associative.
- Provide identity value when appropriate.
- Avoid side effects in reduction.

**References:**
- [Oracle Stream.reduce](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#reduce-T-java.util.function.BinaryOperator-)
- [Baeldung Reduce Tutorial](https://www.baeldung.com/java-8-stream-reduce)

---

### Q06: Collectors Grouping

**Description:**  
Uses `Collectors.groupingBy` to group stream elements by a classifier function.

**Use Case:**  
Group elements by category or property, e.g., employees by department.

**Solution:**
- `.collect(Collectors.groupingBy(e -> e.property))` to create grouped map.

**Best Practices:**
- Ensure classifier is consistent.
- Use downstream collectors for advanced grouping.
- Watch memory usage on large datasets.

**References:**
- [Oracle Collectors](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#groupingBy-java.util.function.Function-)
- [Baeldung Collectors](https://www.baeldung.com/java-8-collectors)

---

### Q07: Optional Basics

**Description:**  
Demonstrates the use of `Optional` to avoid `NullPointerException`. Represents presence or absence of a value.

**Use Case:**  
Return types of methods, safe handling of nulls.

**Solution:**
- `Optional.ofNullable(value)` to create optional.
- Use `ifPresent()`, `orElse()`, `orElseGet()` to safely retrieve values.

**Best Practices:**
- Use Optional for return types, not fields.
- Avoid `.get()` directly.
- Minimize performance impact in hot paths.

**References:**
- [Oracle Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- [Baeldung Optional](https://www.baeldung.com/java-8-optional)

---

### Q08: Optional orElse / orElseGet

**Description:**  
Demonstrates `orElse()` and `orElseGet()` to provide default values when optional is empty.

**Use Case:**  
Provide fallback values for missing configuration or default user data.

**Solution:**
- `.orElse(defaultValue)` for immediate defaults.
- `.orElseGet(() -> generateDefault())` for lazy defaults.

**Best Practices:**
- Use `orElseGet` for expensive defaults.
- Avoid `orElse(null)`.
- Keep Optional usage consistent.

**References:**
- [Oracle Optional.orElse](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#orElse-T-)
- [Oracle Optional.orElseGet](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#orElseGet-java.util.function.Supplier-)

---

### Q09: Parallel Streams

**Description:**  
Demonstrates parallel processing using `.parallelStream()`. Processes elements concurrently.

**Use Case:**  
Speed up processing on large datasets by utilizing multiple CPU cores.

**Solution:**
- Convert collection with `.parallelStream()`.
- Use `.forEach()` or `.reduce()` for parallel execution.

**Best Practices:**
- Avoid shared mutable state in parallel streams.
- Use for CPU-bound operations.
- Consider overhead for small datasets.

**References:**
- [Oracle Parallel Streams](https://docs.oracle.com/javase/tutorial/collections/streams/#parallel)
- [Baeldung Parallel Streams](https://www.baeldung.com/java-8-parallel-streams)

---

### Q10: CompletableFuture Basics

**Description:**  
Demonstrates asynchronous task execution using `CompletableFuture`. Allows non-blocking programming.

**Use Case:**  
Running independent tasks concurrently, like API calls or computations.

**Solution:**
- `CompletableFuture.runAsync(() -> task)` for async tasks.
- `.join()` waits for completion if needed.

**Best Practices:**
- Handle exceptions properly.
- Avoid blocking main thread unnecessarily.
- Use chaining for dependent tasks.

**References:**
- [Oracle CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
- [Baeldung CompletableFuture](https://www.baeldung.com/java-completablefuture)

---

### Q11: CompletableFuture Chaining

**Description:**  
Demonstrates chaining of `CompletableFuture` tasks using `thenApplyAsync` and `thenAccept`.

**Use Case:**  
Perform sequential transformations on asynchronous tasks.

**Solution:**
- `CompletableFuture.supplyAsync()` to start.
- Use `thenApplyAsync()` to transform results.
- `thenAccept()` to consume final output.

**Best Practices:**
- Chain dependent operations to maintain clarity.
- Handle exceptions at each stage if necessary.
- Avoid deep nesting; keep flat chains.

**References:**
- [Oracle CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
- [Baeldung CompletableFuture Chaining](https://www.baeldung.com/java-completablefuture)

---

### Q12: CompletableFuture Exception Handling

**Description:**  
Shows how to handle exceptions in asynchronous tasks using `exceptionally`.

**Use Case:**  
Manage errors gracefully in concurrent tasks without blocking.

**Solution:**
- `exceptionally(ex -> fallbackValue)` handles exceptions and returns default.

**Best Practices:**
- Always handle exceptions in async code.
- Avoid swallowing exceptions silently.
- Log exceptions for debugging.

**References:**
- [Oracle CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
- [Baeldung Async Exception Handling](https://www.baeldung.com/java-completablefuture-exception)

---

### Q13: ReentrantLock

**Description:**  
Demonstrates thread-safe locks with `ReentrantLock`. Provides finer control than `synchronized`.

**Use Case:**  
Control concurrent access to shared resources in multithreaded environments.

**Solution:**
- Create `ReentrantLock` object.
- Use `lock()` before accessing shared resource and `unlock()` after.

**Best Practices:**
- Always unlock in `finally` block.
- Avoid holding lock longer than needed.
- Use `tryLock()` for timeout-sensitive code.

**References:**
- [Oracle ReentrantLock](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantLock.html)
- [Baeldung ReentrantLock](https://www.baeldung.com/java-reentrant-lock)

---

### Q14: Semaphore

**Description:**  
Controls concurrent access using `Semaphore` to limit number of threads.

**Use Case:**  
Limit concurrent connections or threads accessing a resource.

**Solution:**
- Initialize `Semaphore` with permits.
- `acquire()` before access, `release()` after.

**Best Practices:**
- Always release permits in `finally`.
- Avoid deadlocks by acquiring in consistent order.
- Monitor permits for debugging.

**References:**
- [Oracle Semaphore](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Semaphore.html)
- [Baeldung Semaphore](https://www.baeldung.com/java-semaphore)

---

### Q15: Binary Semaphore

**Description:**  
A special `Semaphore` with 1 permit, effectively acting as a lock.

**Use Case:**  
Control access to a single resource among multiple threads.

**Solution:**
- Use `Semaphore(1)` and `acquire()/release()` for exclusive access.

**Best Practices:**
- Ensure release happens in `finally`.
- Avoid multiple acquires without release.
- Use for single-resource protection only.

**References:**
- [Baeldung Binary Semaphore](https://www.baeldung.com/java-semaphore)

---

### Q16: Virtual Threads

**Description:**  
Java 21 feature: lightweight threads managed by JVM, allowing millions of concurrent threads.

**Use Case:**  
Massive concurrency without memory overhead of platform threads.

**Solution:**
- `Thread.ofVirtual().start()` creates a virtual thread.
- Use like normal thread but lightweight.

**Best Practices:**
- Avoid blocking operations in virtual threads.
- Use structured concurrency for better lifecycle management.
- Monitor thread creation for performance.

**References:**
- [Project Loom Docs](https://openjdk.org/projects/loom/)
- [Baeldung Virtual Threads](https://www.baeldung.com/java-loom-virtual-threads)

---

### Q17: Structured Concurrency

**Description:**  
Java 21 feature: manage multiple tasks as a unit, simplifying thread lifecycles.

**Use Case:**  
Run multiple tasks and wait for all to complete with easier exception handling.

**Solution:**
- Use `StructuredTaskScope` to create scope.
- Fork tasks and join all at once.

**Best Practices:**
- Handle exceptions in scope.
- Prefer structured scopes over manual threads.
- Avoid leaking threads outside scope.

**References:**
- [Project Loom Structured Concurrency](https://openjdk.org/projects/loom/)

---

--

### Q18: Records

**Description:**  
Java 16 feature: concise syntax for immutable data carriers.

**Use Case:**  
Data classes with getters, `equals()`, `hashCode()` auto-generated.

**Solution:**
- `public record Person(String name, int age) { }` defines immutable record.

**Best Practices:**
- Use for immutable data.
- Avoid mutable fields.
- Prefer records over verbose POJOs when appropriate.

**References:**
- [Oracle Records](https://docs.oracle.com/en/java/javase/16/language/records.html)

---

### Q19: Switch Pattern Matching

**Description:**  
Enhanced `switch` for type-safe and expressive matching (Java 17+).

**Use Case:**  
Simplify complex conditional logic based on type or pattern.

**Solution:**
- Use `switch` with `case Type t ->` to match type and extract value.

**Best Practices:**
- Always cover all possible cases or use `default`.
- Use pattern matching for readability.
- Avoid mixing old-style switch with pattern matching.

**References:**
- [Oracle Pattern Matching](https://docs.oracle.com/en/java/javase/17/language/pattern-matching-switch-expressions.html)

---

### Q20: Sequenced Collections

**Description:**  
Collections maintaining insertion order: `LinkedHashMap`, `LinkedHashSet`.

**Use Case:**  
Preserve order while iterating collections, e.g., ordered configurations or logs.

**Solution:**
- Use `LinkedHashMap` or `LinkedHashSet` to maintain insertion order.

**Best Practices:**
- Prefer sequenced collections when order matters.
- Avoid if order not required for performance.
- Use unmodifiable wrappers if immutability is needed.

**References:**
- [Oracle Collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
- 
# Java Interview Basics - Q21 to Q40

## Questions Q21–Q40

### Q21: Thread.sleep vs wait/notify

**Description:**  
Demonstrates differences between `Thread.sleep()` and `wait()/notify()` for thread coordination.

**Use Case:**  
Pausing threads vs inter-thread communication in concurrent programming.

**Solution:**
- `Thread.sleep(ms)` pauses current thread.
- `wait()` releases lock and waits for `notify()`.
- Use in synchronized blocks for coordination.

**Best Practices:**
- Always call `wait()` inside synchronized blocks.
- Avoid long sleeps in critical sections.
- Handle `InterruptedException`.

**References:**
- [Oracle Thread Docs](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
- [Baeldung wait vs sleep](https://www.baeldung.com/java-wait-notify)

---

### Q22: Atomic Variables

**Description:**  
Demonstrates atomic operations using `AtomicInteger`, `AtomicReference` for thread-safe modifications without locks.

**Use Case:**  
Counters, flags, or shared variables in multithreaded programs.

**Solution:**
- Use `AtomicInteger.incrementAndGet()` for atomic increment.
- No explicit synchronization required.

**Best Practices:**
- Prefer atomic classes for simple counters.
- Use locks for complex operations.
- Avoid mixing atomic and non-atomic variables.

**References:**
- [Oracle Atomic Variables](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)

---

### Q23: CompletableFuture.allOf / anyOf

**Description:**  
Shows combining multiple async tasks and waiting for all or any completion.

**Use Case:**  
Concurrent API calls, batch computations, asynchronous pipelines.

**Solution:**
- `CompletableFuture.allOf(futures...)` waits for all.
- `CompletableFuture.anyOf(futures...)` waits for the first completion.

**Best Practices:**
- Handle exceptions for each future.
- Use `join()` carefully in main thread.
- Avoid blocking unnecessarily.

**References:**
- [Oracle CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)

---

### Q24: CountDownLatch

**Description:**  
Synchronizes one or more threads until a countdown reaches zero.

**Use Case:**  
Waiting for multiple services to initialize or tasks to complete before proceeding.

**Solution:**
- Initialize `CountDownLatch(count)`.
- Each thread calls `countDown()`.
- Main thread calls `await()`.

**Best Practices:**
- Ensure `countDown()` is always called.
- Avoid waiting indefinitely.
- Prefer `try...finally` for latch countdown.

**References:**
- [Oracle CountDownLatch](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CountDownLatch.html)

---

### Q25: CyclicBarrier

**Description:**  
Allows a group of threads to wait at a barrier point until all reach it.

**Use Case:**  
Coordinating threads to start processing simultaneously.

**Solution:**
- Create `CyclicBarrier(parties)`.
- Threads call `await()` at the barrier.
- Optional runnable executes when all reach barrier.

**Best Practices:**
- Handle `BrokenBarrierException`.
- Reuse barrier if needed.
- Avoid deadlocks with proper thread management.

**References:**
- [Oracle CyclicBarrier](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CyclicBarrier.html)

---

### Q26: ForkJoinPool

**Description:**  
High-performance framework for recursive task decomposition and parallel execution.

**Use Case:**  
Divide-and-conquer algorithms, parallel processing of arrays or trees.

**Solution:**
- Extend `RecursiveTask` or `RecursiveAction`.
- Submit to `ForkJoinPool.commonPool()`.
- Fork sub-tasks and join results.

**Best Practices:**
- Use for CPU-intensive tasks.
- Avoid blocking in forked tasks.
- Use common pool for most cases.

**References:**
- [Oracle ForkJoinPool](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinPool.html)
- [Baeldung ForkJoinPool](https://www.baeldung.com/java-fork-join)

---

### Q27: ThreadLocal

**Description:**  
Stores thread-specific values accessible only within that thread.

**Use Case:**  
Thread-specific state like user session, database connection, or formatter.

**Solution:**
- Create `ThreadLocal<T>` variable.
- Use `set()` to assign value, `get()` to retrieve.

**Best Practices:**
- Always remove values using `remove()` to avoid memory leaks.
- Use for isolated state only.
- Avoid overusing ThreadLocal in shared code.

**References:**
- [Oracle ThreadLocal](https://docs.oracle.com/javase/8/docs/api/java/lang/ThreadLocal.html)

---

### Q28: Optional.map / flatMap

**Description:**  
Transforms contained values in Optional using `map()` and `flatMap()`.

**Use Case:**  
Safe chaining of operations without null checks.

**Solution:**
- `optional.map(value -> transform(value))`.
- `optional.flatMap(value -> anotherOptional)` for nested optionals.

**Best Practices:**
- Avoid nested optionals with `flatMap`.
- Use map for simple transformations.
- Combine with `orElse` for safe defaults.

**References:**
- [Oracle Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

---

### Q29: Comparator.comparing / thenComparing

**Description:**  
Creates comparators for sorting objects by multiple attributes.

**Use Case:**  
Sorting collections of objects by name, age, or priority.

**Solution:**
- `Comparator.comparing(Class::getProperty).thenComparing(Class::getOtherProperty)`.
- Use in `Collections.sort()` or streams.

**Best Practices:**
- Use method references for clarity.
- Avoid reversing comparators unnecessarily.
- Chain comparators thoughtfully.

**References:**
- [Oracle Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

---

### Q30: Optional.filter

**Description:**  
Conditionally keeps the value in Optional if predicate passes.

**Use Case:**  
Validate values without null checks, e.g., positive numbers only.

**Solution:**
- `optional.filter(value -> predicate(value))`
- Returns empty Optional if predicate fails.

**Best Practices:**
- Use filters for simple validation.
- Avoid complex logic inside filter lambdas.
- Chain safely with map or flatMap.

**References:**
- [Oracle Optional.filter](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

---

### Q31: Stream distinct

**Description:**  
Removes duplicates from a stream.

**Use Case:**  
Eliminate repeated elements from lists or arrays.

**Solution:**
- `stream.distinct().collect(Collectors.toList())`.

**Best Practices:**
- Ensure proper `equals` and `hashCode` in custom objects.
- Prefer distinct on small collections for efficiency.
- Avoid using distinct if order is irrelevant; use `Set`.

**References:**
- [Oracle Stream.distinct](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#distinct--)

---

### Q32: Stream limit / skip

**Description:**  
Controls number of elements processed in a stream.

**Use Case:**  
Pagination, selecting top-N elements from a collection.

**Solution:**
- `stream.skip(n).limit(m)` to extract subset.

**Best Practices:**
- Skip before limit for performance.
- Use only on ordered streams if order matters.
- Avoid excessive skipping in large datasets.

**References:**
- [Oracle Stream limit/skip](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

---

### Q33: Stream collect(Collectors.joining)

**Description:**  
Concatenates string elements from a stream into a single string.

**Use Case:**  
Combine names, IDs, or messages into a single string.

**Solution:**
- `stream.collect(Collectors.joining(", "))` for comma-separated string.

**Best Practices:**
- Use proper delimiter to avoid formatting issues.
- Avoid joining very large streams to prevent memory problems.

**References:**
- [Oracle Collectors.joining](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#joining-java.lang.CharSequence-)

---

### Q34: Optional.or / orElseThrow

**Description:**  
Provides alternative Optional or throws exception when empty.

**Use Case:**  
Supply backup value or enforce presence with exception.

**Solution:**
- `optional.or(() -> Optional.of(default))`.
- `optional.orElseThrow(() -> new Exception())`.

**Best Practices:**
- Prefer `orElseThrow` in critical code.
- Avoid silent defaults for essential values.
- Keep exception messages informative.

**References:**
- [Oracle Optional.orElseThrow](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

---

### Q35: Stream peek

**Description:**  
Allows side-effect operations on stream elements during processing.

**Use Case:**  
Debugging streams, logging, or intermediate checks.

**Solution:**
- `stream.peek(e -> System.out.println(e)).collect(Collectors.toList())`.

**Best Practices:**
- Avoid modifying stream elements in peek.
- Prefer for debugging or monitoring only.

**References:**
- [Oracle Stream.peek](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#peek-java.util.function.Consumer-)

---

### Q36: NavigableMap / TreeMap

**Description:**  
Sorted map allowing navigation operations like floor, ceiling, higher, lower.

**Use Case:**  
Ordered key-value stores, range queries, sorted operations.

**Solution:**
- `TreeMap<K,V>` implements `NavigableMap`.
- Use `.floorKey()`, `.ceilingKey()` for navigation.

**Best Practices:**
- Use TreeMap for ordered access.
- Consider memory cost for large maps.

**References:**
- [Oracle NavigableMap](https://docs.oracle.com/javase/8/docs/api/java/util/NavigableMap.html)

---

### Q37: PriorityQueue

**Description:**  
Heap-based queue ordering elements based on natural order or comparator.

**Use Case:**  
Task scheduling, top-N retrieval, or priority processing.

**Solution:**
- Create `PriorityQueue` and add elements.
- Use `.poll()` to retrieve smallest/largest element.

**Best Practices:**
- Ensure comparator matches intended order.
- Avoid iterating for order; use poll.

**References:**
- [Oracle PriorityQueue](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)

---

### Q38: ConcurrentHashMap

**Description:**  
Thread-safe map allowing high concurrency without blocking.

**Use Case:**  
Shared maps in multithreaded environments like caches or counters.

**Solution:**
- Use `ConcurrentHashMap` instead of `HashMap` for thread safety.
- Use `.computeIfAbsent()` for atomic initialization.

**Best Practices:**
- Avoid locking external to map.
- Use atomic operations provided.

**References:**
- [Oracle ConcurrentHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html)

---

---

## Q39: ReentrantLock Basics
**Description:**  
**Use Case:** When multiple threads need controlled access to a shared resource with more advanced locking capabilities than `synchronized`.  
**Solution Approach:** `ReentrantLock` allows explicit lock/unlock control, fairness policies, and condition variables for signaling between threads.  
**Best Practices:** Always release the lock in a `finally` block. Prefer `tryLock()` when possible to avoid deadlocks.  
**References:**
- [Java Docs: ReentrantLock](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantLock.html)
- *Java Concurrency in Practice* by Brian Goetz

---

## Q40: ReentrantLock with Condition
**Description:**  
**Use Case:** Provides more fine-grained thread communication compared to `Object.wait()`/`notify()`.  
**Solution Approach:** Use `Condition` objects created from a `ReentrantLock` to allow threads to wait and be signaled independently.  
**Best Practices:** Use multiple conditions if different wait-sets are needed. Always signal after modifying the state.  
**References:**
- [Java Docs: Condition](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/Condition.html)

---

## Q41: Semaphore Basics
**Description:**  
**Use Case:** Control the number of threads that can access a resource pool (e.g., DB connections).  
**Solution Approach:** Acquire permits before accessing a resource and release them afterward.  
**Best Practices:** Always release permits in a `finally` block. Prefer `fair` semaphore for predictable access ordering.  
**References:**
- [Java Docs: Semaphore](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Semaphore.html)

---

## Q42: Binary Semaphore
**Description:**  
**Use Case:** Acts like a simple lock allowing only one thread at a time.  
**Solution Approach:** Initialize a `Semaphore` with 1 permit to mimic mutual exclusion.  
**Best Practices:** Ensure fairness if ordering matters. Release exactly once to avoid resource leaks.  
**References:**
- [Semaphore Patterns](https://www.baeldung.com/java-semaphore)

---

## Q43: CountDownLatch Basics
**Description:**  
**Use Case:** Wait until a set of threads completes before proceeding (e.g., wait for services to start).  
**Solution Approach:** Main thread calls `await()` while worker threads call `countDown()`.  
**Best Practices:** `CountDownLatch` is one-use only. For reusable synchronization, consider `CyclicBarrier`.  
**References:**
- [Java Docs: CountDownLatch](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CountDownLatch.html)

---

## Q44: CyclicBarrier Basics
**Description:**  
**Use Case:** Synchronize multiple threads at a barrier point so they all proceed together.  
**Solution Approach:** Threads call `await()`, and once all have arrived, they proceed.  
**Best Practices:** Provide a barrier action to perform a task once the last thread arrives.  
**References:**
- [Java Docs: CyclicBarrier](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CyclicBarrier.html)

---

## Q45: Phaser Basics
**Description:**  
**Use Case:** Flexible thread synchronization across multiple phases (e.g., iterative simulations).  
**Solution Approach:** Register threads, advance phases, and synchronize at each step.  
**Best Practices:** Deregister parties when finished to avoid memory leaks.  
**References:**
- [Java Docs: Phaser](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Phaser.html)

---

## Q46: Virtual Threads (Project Loom)
**Description:**  
**Use Case:** Handle thousands of concurrent tasks efficiently with lightweight threads.  
**Solution Approach:** Use `Thread.ofVirtual()` or `Executors.newVirtualThreadPerTaskExecutor()` to run tasks.  
**Best Practices:** Ideal for IO-bound workloads. Avoid blocking operations that aren’t Loom-friendly.  
**References:**
- [Project Loom](https://openjdk.org/projects/loom/)

---

## Q47: Structured Concurrency Basics
**Description:**  
**Use Case:** Simplify multi-tasking by treating concurrent tasks as units of work with lifecycle management.  
**Solution Approach:** Use structured concurrency APIs (`StructuredTaskScope`) to manage child tasks safely.  
**Best Practices:** Always handle cancellation and exceptions properly.  
**References:**
- [JEP 453: Structured Concurrency](https://openjdk.org/jeps/453)

---

## Q48: Structured Concurrency with Shutdown
**Description:**  
**Use Case:** Cancel or shut down tasks if one task fails.  
**Solution Approach:** Use `StructuredTaskScope.ShutdownOnFailure` to stop sibling tasks automatically.  
**Best Practices:** Favor fail-fast behavior to avoid resource wastage.  
**References:**
- [OpenJDK Docs](https://openjdk.org/)

---

## Q49: Modules Basics
**Description:**  
**Use Case:** Encapsulate code into modules for better maintainability and dependency management.  
**Solution Approach:** Use `module-info.java` to declare dependencies and exports.  
**Best Practices:** Keep module boundaries small and cohesive.  
**References:**
- [Java Platform Module System](https://openjdk.org/projects/jigsaw/)

---

## Q50: Records Basics
**Description:**  
**Use Case:** Define immutable data carriers without boilerplate.  
**Solution Approach:** Use `record` keyword for automatic `equals()`, `hashCode()`, and `toString()`.  
**Best Practices:** Use records for DTOs, not entities with behavior.  
**References:**
- [JEP 395: Records](https://openjdk.org/jeps/395)

---

## Q51: Pattern Matching for instanceof
**Description:**  
**Use Case:** Avoid explicit casting after `instanceof`.  
**Solution Approach:** Pattern matching allows direct binding of variable in the `instanceof` check.  
**Best Practices:** Use when code clarity improves; avoid overcomplicating conditionals.  
**References:**
- [JEP 394: Pattern Matching for instanceof](https://openjdk.org/jeps/394)

---

## Q52: Switch Expressions Basics
**Description:**  
**Use Case:** Replace verbose `switch` statements with concise expressions.  
**Solution Approach:** Use `switch` as an expression returning a value with `yield`.  
**Best Practices:** Always cover all cases (sealed classes or enums help).  
**References:**
- [JEP 361: Switch Expressions](https://openjdk.org/jeps/361)

---

## Q53: Sealed Classes Basics
**Description:**  
**Use Case:** Restrict class hierarchies to a known set of subclasses.  
**Solution Approach:** Use `sealed`, `permits`, and `non-sealed` modifiers to define inheritance rules.  
**Best Practices:** Use sealed classes to enforce domain modeling constraints.  
**References:**
- [JEP 409: Sealed Classes](https://openjdk.org/jeps/409)

---

## Q54: Sequenced Collections
**Description:**  
**Use Case:** Work with collections that guarantee predictable iteration order.  
**Solution Approach:** Use `SequencedCollection` API introduced in Java 21 for order-preserving structures.  
**Best Practices:** Prefer sequenced collections when order-sensitive operations are required.  
**References:**
- [JEP 431: Sequenced Collections](https://openjdk.org/jeps/431)

---

## Q55: String Templates (Preview)
**Description:**  
**Use Case:** Simplify string concatenation and formatting.  
**Solution Approach:** Use `STR."Hello \{name}"` for inline variable substitution.  
**Best Practices:** Avoid mixing with legacy concatenation for consistency.  
**References:**
- [JEP 430: String Templates](https://openjdk.org/jeps/430)

---

## Q56: Scoped Values (Preview)
**Description:**  
**Use Case:** Share immutable data with child threads without using thread-local variables.  
**Solution Approach:** Use `ScopedValue` API to safely bind values in structured concurrency.  
**Best Practices:** Prefer over `ThreadLocal` when possible to reduce memory leaks.  
**References:**
- [JEP 429: Scoped Values](https://openjdk.org/jeps/429)

---

## Conclusion

This repository is a **practical guide for Java interviews and learning modern Java**.  
It covers essential concepts from **Java 8–21**, including **functional programming, streams, concurrency, and new JDK features**.

Use these examples to **practice coding, strengthen concepts, and prepare confidently** for interviews.
