// Q19: Private methods in interfaces
// Java example (requires Java 9 or later)

public class Q19_PrivateMethodsInInterface {
    public static void main(String[] args) {
        System.out.println("See interface example in comments.");
    }
}

interface Example {
    private static void helper() { System.out.println("helper"); }
    static void doWork() { helper(); }
}
//Note: Private methods in interfaces are allowed from Java 9 and help avoid code duplication in default methods.
