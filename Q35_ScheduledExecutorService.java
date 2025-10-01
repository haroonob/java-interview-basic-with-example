// Q35: ScheduledExecutorService
// Java example (Java 5+)
// Demonstrates scheduling a single task and waiting for its completion

import java.util.concurrent.*;

public class Q35_ScheduledExecutorService {
    public static void main(String[] args) {
        // Create a scheduler with a single thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        try {
            // Task to run after 500 milliseconds
            Runnable task = () -> System.out.println("Scheduled executed at: " + System.currentTimeMillis());

            // Schedule the task
            ScheduledFuture<?> future = scheduler.schedule(task, 500, TimeUnit.MILLISECONDS);

            // Wait until the task completes
            future.get(); // throws InterruptedException, ExecutionException
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Task interrupted");
        } catch (ExecutionException e) {
            System.out.println("Task execution failed: " + e.getCause());
        } finally {
            // Shutdown scheduler properly
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(1, TimeUnit.SECONDS)) {
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Scheduler shutdown completed.");
    }
}
