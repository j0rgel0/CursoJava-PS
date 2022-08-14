public class WhileLoops {
    public static void main (String[] args){
        int someValue = 4;
        int factorial = 1;
        while(someValue > 1){
            System.out.println("(upper-inside while loop) someValue: "+someValue);
            System.out.println("(upper-inside while loop) factorial: "+factorial);
            System.out.println("factorial = "+factorial+ "*" + someValue);
            factorial *= someValue;
            System.out.println("(lower-inside while loop) factorial: "+factorial);
            someValue--;
            System.out.println("(lower-inside while loop) someValue--: "+someValue);
            System.out.println();
        }
        System.out.println("(outside while loop) factorial: "+factorial);
        // (outside while loop) factorial: 24
    }

}
