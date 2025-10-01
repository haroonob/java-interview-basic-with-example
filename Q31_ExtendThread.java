// Q31: Create thread by extending Thread
// Java example (requires Java 1.0 or later)

public class Q31_ExtendThread {
    public static void main(String[] args) throws InterruptedException {
        class MyThread extends Thread {
            public void run() {
                System.out.println("Running in MyThread: " + Thread.currentThread().getName());
            }
        }
        MyThread t = new MyThread();
        t.start();
        t.join();
    }
}
