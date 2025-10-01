// Q09: Parallel streams
// Java example (requires Java 8 or later)

import java.util.*;
public class Q09_ParallelStreams {
    public static void main(String[] args) {
        // Demonstrate parallel stream may process in non-deterministic order
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nums.parallelStream().forEach(n -> System.out.println(Thread.currentThread().getName()+": "+n));
        // Use forEachOrdered to preserve encounter order
        System.out.println("Ordered:");
        nums.parallelStream().forEachOrdered(System.out::println);
    }
}
