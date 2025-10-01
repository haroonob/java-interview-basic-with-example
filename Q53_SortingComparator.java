// Q53: Sorting with Comparator & lambdas
// Java example (requires Java 8 or later)

import java.util.*;
public class Q53_SortingComparator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Zoe","Anna","Bob"));
        names.sort(String::compareToIgnoreCase);
        System.out.println(names); // [Anna, Bob, Zoe]
    }
}
