// Q44: UTF-8 default charset (Java 18+)
// Java example (requires Java 18 or later)

public class Q44_UTF8Default {
    public static void main(String[] args) {
        System.out.println("Default charset: " + java.nio.charset.Charset.defaultCharset());
        System.out.println("Note: From Java 18, UTF-8 is the default charset in many builds.");
    }
}
