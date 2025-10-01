// Q28: Pattern matching in switch (preview)
// Java example (requires Java 17 or later)

public class Q28_PatternSwitchComment {
    public static void main(String[] args) {
        System.out.println("Pattern matching in switch is a preview/preview+ feature in recent Java versions.");
        Object obj=new String("hello");
        switch(obj) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Int: " + i);
            default -> System.out.println("Other");
        }
    }
}
/*
Example (requires preview flags and newer JDK):
switch(obj) {
  case String s -> System.out.println("String: " + s);
  case Integer i -> System.out.println("Int: " + i);
  default -> System.out.println("Other");
}
*/
