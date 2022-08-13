public class OperationPrecedence {
    public static void main(String[] args){
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println("21 - 6 / 3 = "+result1);
        System.out.println("(21 - 6) / 3 = "+result2);

        /*
        result1: 21 - 6 / 3 = 19
        result2: (21 - 6) / 3 = 5
         */

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));
        System.out.println("21 / 3 * 1 + 6 = "+result3);
        // 7 * 1 + 6 = 13
        // 7 + 6 = 13
        System.out.println("21 / ( 3 * (1 + 6) )= "+result4);
        // 21 / ( 3 * 7 ) = 1
        // 21 / 21 = 1

        /*
        result3: 21 / 3 * 1 + 6 = 13
        result4: 21 / ( 3 * (1 + 6) )= 1
         */
    }
}
