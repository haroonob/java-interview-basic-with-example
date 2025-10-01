// Q26: Stream.toList()
// Java example (requires Java 16 or later)

import java.util.*;
import java.util.stream.*;
public class Q26_StreamToList {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(1,2,3,4).toList(); // returns an unmodifiable List (Java 16+)
        System.out.println(nums);
        try { nums.add(5); } catch (UnsupportedOperationException e) { System.out.println("unmodifiable"); }
    }
}
