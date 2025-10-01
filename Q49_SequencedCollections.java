// Q49: Sequenced Collections
// Java example (Java 21+ recommended for sequenced collection enhancements)

import java.util.*;

public class Q49_SequencedCollections {
    public static void main(String[] args) {
        System.out.println("=== Sequenced Collections Example ===");

        // LinkedHashSet maintains insertion order
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");

        System.out.println("LinkedHashSet (insertion order): " + linkedSet);

        // Remove and re-add element to see ordering
        linkedSet.remove("Banana");
        linkedSet.add("Banana");
        System.out.println("After removing and re-adding Banana: " + linkedSet);

        // LinkedHashMap maintains insertion order
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Alice", 30);
        linkedMap.put("Bob", 25);
        linkedMap.put("Charlie", 35);

        System.out.println("LinkedHashMap (insertion order): " + linkedMap);

        // Sequenced operations: remove first entry
        String firstKey = linkedMap.keySet().iterator().next();
        linkedMap.remove(firstKey);
        System.out.println("After removing first entry (" + firstKey + "): " + linkedMap);

        // Java 21+: Deque with sequenced behavior
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("First");
        deque.addLast("Second");
        deque.addLast("Third");
        System.out.println("Deque contents: " + deque);

        deque.removeFirst();
        System.out.println("Deque after removing first element: " + deque);
    }
}
