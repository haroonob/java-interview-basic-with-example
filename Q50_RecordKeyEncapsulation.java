// Q50: Record key encapsulation and pattern matching
// Java example (requires Java 21 or later)

public class Q50_RecordKeyEncapsulation {
    // Define a simple record (immutable data carrier)
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create a record instance
        Person person = new Person("Alice", 30);

        // Access fields using generated accessor methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Records are immutable: the following is NOT allowed
        // p1.age = 35; // compilation error

        // Using pattern matching (Java 21 preview feature)

//        Person person = (Person) obj;
        String name = person.name();
        int age = person.age();
        System.out.println("Pattern matched: " + name + ", " + age);

        // Demonstrate equals and hashCode
        Person p2 = new Person("Alice", 30);
        System.out.println("p1.equals(p2): " + person.equals(p2));
        System.out.println("p1.hashCode(): " + person.hashCode());

        // toString method
        System.out.println("p1.toString(): " + person);
    }
}
