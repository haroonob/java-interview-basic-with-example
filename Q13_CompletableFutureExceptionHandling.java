// Q13: CompletableFuture exception handling
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q13_CompletableFutureExceptionHandling {
    public static void main(String[] args) {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> 1/0)
            .exceptionally(ex -> {
                System.out.println("Handled: " + ex);
                return 0;
            });
        System.out.println(cf.join()); // prints Handled: ... then 0
    }
}
