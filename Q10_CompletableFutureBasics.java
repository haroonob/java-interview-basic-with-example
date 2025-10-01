// Q10: CompletableFuture basics
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q10_CompletableFutureBasics {
    public static void main(String[] args) throws Exception {
        // Supply a value asynchronously and then print it
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> "Hello");
        cf.thenAccept(System.out::println).join(); // prints Hello
    }
}
