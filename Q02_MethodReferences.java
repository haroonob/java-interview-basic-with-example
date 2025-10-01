// Q02: Method references
// Java example (requires Java 8 or later)

import java.util.*;
public class Q02_MethodReferences {
    public static void main(String[] args) {
        // Question: Show method reference usage instead of lambda
        List<String> names = Arrays.asList("Lilly","John","Aisha");
        // System.out::println is a method reference to an instance method of a particular object
        names.forEach(System.out::println);
    }
}
