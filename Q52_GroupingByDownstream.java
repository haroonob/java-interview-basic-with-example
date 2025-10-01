// Q52: groupingBy with downstream collector
// Java example (requires Java 8 or later)

import java.util.*;
import java.util.stream.*;
public class Q52_GroupingByDownstream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","bb","ccc","dd","e");
        Map<Integer, Long> counts = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(counts); // counts by length
    }
}
