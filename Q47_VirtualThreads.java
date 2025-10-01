// Q47: Virtual Threads
// Java 21+ required (may need --enable-preview in some builds)

public class Q47_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Virtual Threads Example ===");

        // Start a virtual thread and keep a reference
        Thread vThread = Thread.startVirtualThread(() -> {
            System.out.println("Hello from virtual thread: " + Thread.currentThread());
        });

        // Wait for the virtual thread to finish
        vThread.join();

        System.out.println("Virtual thread has completed execution.");
    }
}
