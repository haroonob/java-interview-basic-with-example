// Q07: Optional basics
// Java example (requires Java 8 or later)

import java.util.*;
public class Q07_OptionalBasics {
    public static void main(String[] args) {
        // Wrap possibly-null value with Optional
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent()); // false
        System.out.println(opt.orElse("default")); // prints "default"
    }
}
