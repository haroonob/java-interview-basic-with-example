// Q17: Immutable collections
// Java example (requires Java 9 or later)

import java.util.*;
public class Q17_ImmutableCollections {
    public static void main(String[] args) {
        // List.of returns an immutable list (Java 9+)
        List<String> list = List.of("A","B","C");
        System.out.println(list);
        try {
            list.add("D"); // throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable list");
        }
    }
}
