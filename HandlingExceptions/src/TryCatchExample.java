public class TryCatchExample {
    public static void main(String[] args) {
        int i = 12, j = 2;
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
            // Exception can tell you the list of method calls
            // that occurred that ultimately led to that exception
            ex.printStackTrace(); //Helpful during app development
        }
        System.out.println("do more work!");

        /*
        Error: / by zero
        do more work!
        java.lang.ArithmeticException: / by zero
        	at TryCatchExample.main(TryCatchExample.java:5)
         */
    }
}
