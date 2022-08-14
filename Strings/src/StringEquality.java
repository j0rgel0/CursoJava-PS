public class StringEquality {
    public static void main(String[] args) {
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";

        if (s1 == s2) {
        } //false

        // String equality [equals()]
        // The equals method is the best choice in most cases
        if (s1.equals(s2)) {// true
            System.out.println("s1 == s2");
        }

        // Interning a string [intern()]
        // Enables reliable == operator comparison
        // Improves performance of frequently compared strings
        String s3 = "I love";
        s3 += " Java";
        String s4 = "I";
        s4 += " love Java";
        if(s3.intern() == s4.intern()){
            System.out.println("s3 == s4");
        }

    }
}
