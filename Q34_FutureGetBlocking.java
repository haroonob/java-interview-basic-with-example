// Q34: Future get() blocking
// Java example (requires Java 5 or later)

import java.util.concurrent.*;
public class Q34_FutureGetBlocking {
    public static void main(String[] args) throws Exception {
        try(ExecutorService exec = Executors.newSingleThreadExecutor()) {
            Future<String> f = exec.submit(() -> {
                Thread.sleep(200);
                return "done";
            });
            // get() will block until result is available
            System.out.println(f.get()); // prints done
            exec.shutdown();
        }
    }
}
