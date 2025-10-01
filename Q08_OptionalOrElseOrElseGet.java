// Q08: Optional orElse vs orElseGet
// Java example (requires Java 8 or later)

import java.util.*;
public class Q08_OptionalOrElseOrElseGet {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("value");
        // orElse will evaluate the parameter even if Optional present
        System.out.println(opt.orElse(expensive())); // prints "value" but expensive() is called
        // orElseGet is lazy and won't call supplier if present
        System.out.println(opt.orElseGet(Q08_OptionalOrElseOrElseGet::expensive)); // prints "value" and expensive() not called
    }
    static String expensive() {
        System.out.println("expensive() called");
        return "default";
    }
}
