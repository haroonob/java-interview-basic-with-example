// Q33: ExecutorService submit()
// Java example (requires Java 5 or later)

import java.util.concurrent.*;
public class Q33_ExecutorServiceSubmit {
    public static void main(String[] args) throws Exception {
        try(ExecutorService exec = Executors.newFixedThreadPool(2)) {
            Future<Integer> f = exec.submit(() -> {
                Thread.sleep(100);
                return 42;
            });
            System.out.println("Result: " + f.get()); // 42
            exec.shutdown();
        }
    }
}
