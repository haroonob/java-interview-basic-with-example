// Q11: CompletableFuture chaining
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q11_CompletableFutureChaining {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 10)
            .thenApply(n -> n * 2)
            .thenApply(n -> "Result: " + n)
            .thenAccept(System.out::println)
            .join(); // prints Result: 20
    }
}
