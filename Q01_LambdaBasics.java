// Q01: Lambda basics
// Java example (requires Java 8 or later)

import java.util.*;
public class Q01_LambdaBasics {
    public static void main(String[] args) {
        // Question: Use a lambda to filter and print even numbers.
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        // Lambda expression used in filter
        nums.stream()
            .filter(n -> n % 2 == 0) // lambda: takes n and returns boolean
            .forEach(System.out::println); // method reference to print: 2 4 6
    }
}
