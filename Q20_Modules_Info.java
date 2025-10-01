// Q20: Modules (example content)
// Java example (requires Java 9 or later)

public class Q20_Modules_Info {
    public static void main(String[] args) {
        System.out.println("module-info.java example is in comments.");
    }
}
/*
Example module declaration (save as module-info.java in module root):
module com.example.quiz {
    requires java.base;
    exports com.example.quiz.api;
}
Modules require a specific project layout and Java 9+.
*/
