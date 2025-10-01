// Q29: Enhanced instanceof example
// Java example (requires Java 14 or later)

public class Q29_EnhancedInstanceof {
    public static void main(String[] args) {
        Object x = 10;
        if (x instanceof Integer i && i > 5) {
            System.out.println("Integer greater than 5: " + i);
        }
    }
}
