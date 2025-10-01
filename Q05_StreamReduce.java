// Q05: Stream reduce
// Java example (requires Java 8 or later)

import java.util.*;
public class Q05_StreamReduce {
    public static void main(String[] args) {
        // Question: Sum numbers using reduce
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum); // 15
    }
}
