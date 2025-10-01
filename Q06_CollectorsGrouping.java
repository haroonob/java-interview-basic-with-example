// Q06: Collectors groupingBy
// Java example (requires Java 8 or later)

import java.util.*;
import java.util.stream.*;
public class Q06_CollectorsGrouping {
    public static void main(String[] args) {
        // Group strings by their length
        List<String> list = Arrays.asList("one","two","three","four","six");
        Map<Integer, List<String>> byLen = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(byLen); // e.g., {3=[one, two, six], 4=[four], 5=[three]}
    }
}
