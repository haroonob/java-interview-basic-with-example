// Q46: Switch Patterns and Expressions
// Java 14+ for switch expressions, Java 21 for pattern matching (may require --enable-preview)

public class Q46_SwitchPatternComment {
    public static void main(String[] args) {
        System.out.println("=== Switch Case Examples ===");

        int day = 3;

        // Classic switch statement
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day"); break;
        }

        // Switch expression with yield
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };
        System.out.println("Switch expression result: " + dayName);

        // Multiple labels in a case
        int month = 4;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown";
        };
        System.out.println("Season for month " + month + ": " + season);

        // Pattern matching with instanceof (Java 21 preview)
        Object obj = "Hello";
        String result = switch (obj) {
            case String s -> "It's a string of length " + s.length();
            case Integer i -> "It's an integer: " + i;
            case null -> "It's null";
            default -> "Unknown type";
        };
        System.out.println(result);

        // Switch expressions can also compute values
        int value = 2;
        int squared = switch (value) {
            case 1 -> 1;
            case 2 -> 4;
            case 3 -> 9;
            default -> 0;
        };
        System.out.println("Squared value: " + squared);
    }
}
