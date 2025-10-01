// Q38: synchronized example
// Java example (requires Java 1.0 or later)

public class Q38_SynchronizedExample {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable inc = () -> {
            for (int i=0;i<1000;i++) {
                synchronized (Q38_SynchronizedExample.class) { // note: class name below used in lock
                    counter++;
                }
            }
        };
        Thread t1 = new Thread(inc), t2 = new Thread(inc);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Counter: " + counter);
    }
}
// Note: The lock uses SynchronizedExample.class symbolically; actual lock object used above is the Class object.
