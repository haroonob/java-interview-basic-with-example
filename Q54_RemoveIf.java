// Q54: removeIf() in collections
// Java example (requires Java 8 or later)

import java.util.*;
public class Q54_RemoveIf {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6));
        nums.removeIf(n -> n % 2 == 0); // remove even numbers
        System.out.println(nums); // [1,3,5]
    }
}
