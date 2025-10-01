// Q36: Callable vs Runnable
// Java example (requires Java 5 or later)

import java.util.concurrent.*;
public class Q36_CallableVsRunnable {
    public static void main(String[] args) throws Exception {
        Callable<Integer> c = () -> 7;
        Runnable r = () -> System.out.println("Runnable executed");
        try (ExecutorService exec = Executors.newFixedThreadPool(2)) {
            Future<Integer> fc = exec.submit(c);
            Future<?> fr = exec.submit(r);
            System.out.println("Callable result: " + fc.get());
            fr.get(); // wait for runnable completion
            exec.shutdown();
        }
    }
}
