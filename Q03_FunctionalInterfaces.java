// Q03: Functional interfaces (Predicate, Function)
// Java example (requires Java 8 or later)

import java.util.*;
import java.util.function.*;
public class Q03_FunctionalInterfaces {
    public static void main(String[] args) {
        // Question: Demonstrate Predicate and Function usage
        Predicate<String> nonEmpty = s -> s != null && !s.isEmpty();
        Function<String, Integer> len = s -> s.length();
        List<String> words = Arrays.asList("java","",null,"stream");
        // filter using Predicate and map to length using Function
        words.stream()
             .filter(w -> nonEmpty.test(w))
             .map(len)
             .forEach(System.out::println); // prints lengths of "java" and "stream"
    }
}
