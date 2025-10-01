// Q51: Map.of and Map.copyOf
// Java example (requires Java 9 or later)

import java.util.*;
public class Q51_MapOfCopyOf {
    public static void main(String[] args) {
        Map<String,Integer> m = Map.of("a",1,"b",2);
        System.out.println(m);
        Map<String,Integer> copy = Map.copyOf(m);
        System.out.println(copy);
    }
}
