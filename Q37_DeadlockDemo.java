// Q37: Deadlock demonstration (simple)
// Java example (requires Java 1.0 or later)

public class Q37_DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object a = new Object();
        final Object b = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(a) {
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized(b) {
                    System.out.println("t1 acquired both");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(b) {
                try { Thread.sleep(50); }
                catch (InterruptedException e) {

                }
                synchronized(a) {
                    System.out.println("t2 acquired both");
                }
            }
        });
        t1.start(); t2.start();
        t1.join(500); t2.join(500);
        System.out.println("If program stuck, deadlock occurred (you may see no second print).");
    }
}
