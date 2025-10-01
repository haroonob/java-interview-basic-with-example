// Q39: ReentrantLock example
// Java example (requires Java 5 or later)

import java.util.concurrent.locks.*;
public class Q39_ReentrantLockExample {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int v = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i=0;i<1000;i++) {
                lock.lock();
                try {
                    v++;
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("v=" + v);
    }
}
