public class ArgumentIndex {
    public static void main(String[] args){
        //Argument Index
        int valA = 100, valB = 200, valC = 300;

        String s1 = String.format("%d %d %d", valA, valB, valC);
        // Not specified Corresponds sequentially to argument
        System.out.println("s1: "+s1); //s1: 100 200 300

        String s2 = String.format("%3$d %1$d %2$d", valA, valB, valC);
        // index$ Index of argument to use (1-based)
        System.out.println("s2: "+s2);//s2: 300 100 200

        String s3 = String.format("%3$d %<d %1$d", valA, valB, valC);
        // < Corresponds to same argument as previous format specifier
        System.out.println("s3: "+s3);//s3: 300 300 100
    }
}
