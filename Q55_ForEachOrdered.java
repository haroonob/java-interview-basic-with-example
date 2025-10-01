// Q55: forEachOrdered with parallel stream
// Java example (requires Java 8 or later)

import java.util.*;
public class Q55_ForEachOrdered {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nums.parallelStream()
            .filter(n -> n % 2 == 0)
            .forEachOrdered(System.out::println); // preserves encounter order: 2 4 6 8 10
    }
}
