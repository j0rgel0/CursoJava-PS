public class ForLoops {
    public static void main (String[] args){
        for(int i = 1; i < 25; i *= 2){
            System.out.print(i);
            System.out.print(" * 2 = ");
            i *= 2;
            System.out.println(i);
        }
        /*
        Output:
        1 * 2 = 2
        4 * 2 = 8
        16 * 2 = 32
         */
    }
}
