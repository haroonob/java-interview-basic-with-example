// Q25: Sealed classes (example)
// Java example (requires Java 17 or later)

public class Q25_SealedClasses {
    public static void main(String[] args) {
        System.out.println("Sealed class example in comments.");
    }
}

sealed interface Shape permits Circle, Square {}
final class Circle implements Shape {}
final class Square implements Shape {}
/*Sealed types restrict which classes may extend/implement them (Java 17+).
*/
