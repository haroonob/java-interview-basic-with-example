// Q16: Try-with-resources
// Java example (requires Java 7+ or later)

import java.io.*;
public class Q16_TryWithResources {
    public static void main(String[] args) {
        // Demonstrate try-with-resources with a ByteArrayInputStream
        try (InputStream is = new ByteArrayInputStream("hello".getBytes())) {
            int b;
            while ((b = is.read()) != -1) {
                System.out.print((char)b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
