public class CompoundAssignmentOp {
    public static void main(String[] args){

        // -=
        int myValue = 50;
        myValue -= 5;
        System.out.println("50 -= 5  equals to: "+myValue);

        // /=
        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;
        myOtherValue /= val1 * val2;
        // first solve val1 * val2 = 50
        // then 100 / 50 = 2
        System.out.println("100 /= 50  equals to: "+myOtherValue);

        // %=
        int myOtherValue2 = 100;
        int val3 = 6;
        myOtherValue2 %= val3;
        // 100 % 6 = 4
        System.out.println("100 %= 6  equals to: "+myOtherValue2);

        /*
            50 -= 5  equals to: 45
            100 /= 50  equals to: 2
            100 %= 6  equals to: 4
         */
    }
}
