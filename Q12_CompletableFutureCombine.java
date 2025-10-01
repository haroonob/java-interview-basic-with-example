// Q12: CompletableFuture combine
// Java example (requires Java 8 or later)

import java.util.concurrent.*;
public class Q12_CompletableFutureCombine {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> sum = f1.thenCombine(f2, Integer::sum);
        System.out.println(sum.join()); // 30
    }
}
