// Q23: instanceof pattern matching
// Java example (requires Java 14 or later)

public class Q23_InstanceofPattern {
    public static void main(String[] args) {
        Object obj = "hello";
        // Pattern matching for instanceof (Java 14+)
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // HELLO
        }
    }
}
