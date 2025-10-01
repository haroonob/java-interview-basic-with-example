// Q43: Simple HTTP Server Example
// Java 18+ required

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Q43_SimpleHttpServerComment {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Simple HTTP Server Example ===");

        // Create an HTTP server listening on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define a simple handler
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "Hello from Java Simple HTTP Server!";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            }
        });

        // Start the server
        server.setExecutor(null); // Use default executor
        server.start();

        System.out.println("Server started on http://localhost:8080/");
        System.out.println("Press Ctrl+C to stop.");
    }
}
