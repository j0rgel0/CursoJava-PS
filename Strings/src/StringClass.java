public class StringClass {
    public static void main(String[] args){
        String name = "Jim";
        String greeting = "Hello " + name;
        System.out.println(greeting); // Hello Jim
        // Values can be concatenated using + and +=
        greeting += " good to see you!";
        System.out.println(greeting); // Hello Jim good to see you!
    }
}
