// Q45: Record Patterns and Pattern Matching
// Java 16+ for records, Java 21 for pattern matching (may require --enable-preview)

public class Q45_RecordPatternsComment {

    // Define a simple record
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        System.out.println("=== Record Patterns Example ===");

        // Create some records
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);

        // Access fields
        System.out.println("Person 1: " + p1.name() + ", " + p1.age());
        System.out.println("Person 2: " + p2.name() + ", " + p2.age());

        // Record pattern matching with instanceof (Java 21 preview)
        Object obj = p1;
        if (obj instanceof Person(String name, int age)) {
            System.out.println("Pattern matched: " + name + ", " + age);
        }

        // Using switch with record patterns (Java 21 preview)
        String description = switch (obj) {
            case Person(String n, int a) when a >= 30 -> n + " is 30 or older";
            case Person(String n, int a) -> n + " is younger than 30";
            default -> "Unknown object";
        };
        System.out.println(description);

        // Demonstrate equals and toString
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p1.toString(): " + p1);
    }
}
