// Q41: CompletableFuture.allOf()
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q41_CompletableFutureAllOf {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "A");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "B");
        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);
        all.join();
        System.out.println("Both done: " + f1.join() + f2.join()); // AB
    }
}
