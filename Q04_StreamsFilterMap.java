// Q04: Streams filter and map
// Java example (requires Java 8 or later)

import java.util.*;
public class Q04_StreamsFilterMap {
    public static void main(String[] args) {
        // Question: Convert list of strings to uppercase and filter length > 3
        List<String> list = Arrays.asList("one","three","four","to");
        list.stream()
            .map(String::toUpperCase)
            .filter(s -> s.length() > 3)
            .forEach(System.out::println); // prints THREE FOUR
    }
}
