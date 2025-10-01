// Q32: Create thread with Runnable
// Java example (requires Java 1.0 or later)

public class Q32_RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> System.out.println("Hello from Runnable: " + Thread.currentThread().getName());
        Thread t = new Thread(r);
        t.start();
        t.join();
    }
}
