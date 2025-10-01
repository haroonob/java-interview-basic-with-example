// Q18: Diamond operator improvements
// Java example (requires Java 7+ or later)

import java.util.*;
public class Q18_DiamondOperator {
    public static void main(String[] args) {
        // Diamond operator with anonymous inner classes improved in Java 7
        Map<String, String> map = new HashMap<>(); // type inferred on the right
        map.put("k","v");
        System.out.println(map);
    }
}
