// Q42: CompletableFuture.anyOf()
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q42_CompletableFutureAnyOf {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            sleep(200); return "slow";
        });
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "fast");
        Object first = CompletableFuture.anyOf(f1, f2).join();
        System.out.println("First: " + first); // fast (likely)
    }
    static void sleep(long ms){ try{ Thread.sleep(ms);}catch(Exception e){} }
}
