// Q21: Switch expressions
// Java example (requires Java 12 or later)

public class Q21_SwitchExpressions {
    public static void main(String[] args) {
        int day = 2;
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Other";
        };
        System.out.println(name); // Tuesday
    }
}
