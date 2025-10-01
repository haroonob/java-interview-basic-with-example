// Q40: Daemon thread example
// Java example (requires Java 1.0 or later)

public class Q40_DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon running");
                try { Thread.sleep(200); } catch (InterruptedException e) { break; }
            }
        });
       // daemon.setDaemon(true);
        daemon.start();
        Thread.sleep(500); // main sleeps then exits; daemon will be terminated automatically
        System.out.println("Main thread exiting");
    }
}
