// Q24: Records
// Java example (requires Java 16 or later)

public class Q24_RecordsExample {
    // Record declaration (Java 16+). For single-file compilation, define record at top level in its own file.
    public static void main(String[] args) {
        System.out.println("See Person record usage comment below.");
        record Person(String name, int age) {}
        Person p = new Person("Lilly", 25);
        System.out.println(p.name() + ", " + p.age());
    }
}
/*

*/
