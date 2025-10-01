import java.util.concurrent.Semaphore;

/*A Semaphore in Java is a thread synchronization construct provided by java.util.concurrent. It’s used to control access to a shared resource by multiple threads. Think of it like a set of permits—only threads that acquire a permit can proceed, and when they’re done, they release it back.

1. Key Concepts

Permits:
A semaphore has a certain number of permits. If a thread can acquire a permit, it proceeds; otherwise, it waits until a permit is available.

Types of Semaphores:

Counting Semaphore: Any number of threads up to the limit can access the resource.

Binary Semaphore: Only 1 permit, works like a lock (mutex).

Fairness:
You can create a fair semaphore so threads acquire permits in FIFO order.*/

public class Q56_SemaphoreExample {
    private static final Semaphore semaphore = new Semaphore(3); // 3 permits

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                System.out.println(threadName + " is waiting for a permit.");
                semaphore.acquire(); // acquire a permit
                System.out.println(threadName + " acquired a permit.");

                Thread.sleep(2000); // simulate some work

                System.out.println(threadName + " releasing permit.");
                semaphore.release(); // release permit
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Create 6 threads, but only 3 can run simultaneously
        for (int i = 0; i < 6; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
