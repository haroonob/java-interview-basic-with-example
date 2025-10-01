// Q27: Record usage with streams
// Java example (requires Java 16 or later)

import java.util.*;
public class Q27_RecordWithStream {
    public static void main(String[] args) {
        // Example record shown in comment; use simple POJO-like behavior for compilation
        record Person(String name, int age) {}
        List<Person> people = List.of(new Person("Lilly",25), new Person("John",30));
        people.stream().map(Person::name).forEach(System.out::println);
    }
}
