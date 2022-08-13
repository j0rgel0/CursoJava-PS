public class TypeConversion {
    public static void main(String[] args){
        //Implicit type conversion
        int intValueOne = 50;
        System.out.println("intValueOne: "+ intValueOne + " [Type: " + ((Object)intValueOne).getClass().getSimpleName() + "]");
        long longValueOne = intValueOne;
        System.out.println("longValueOne: "+ longValueOne + " [Type: " + ((Object)longValueOne).getClass().getSimpleName() + "]");
        /*
            intValueOne: 50 [Type: Integer]
            longValueOne: 50 [Type: Long]
         */

        //Explicit type conversion
        long longValueTwo = 50;
        System.out.println("longValueTwo: "+longValueTwo + " [Type: " + ((Object)longValueTwo).getClass().getSimpleName() + "]");
        // Cast:
        int intValueTwo = (int) longValueTwo;
        System.out.println("(int) intValueTwo: "+intValueTwo + " [Type: " + ((Object)intValueTwo).getClass().getSimpleName() + "]");
        /*
            longValueTwo: 50 [Type: Long]
            (int) intValueTwo: 50 [Type: Integer]
         */
        System.out.println("------------------------");
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        System.out.println("floatVal: "+ floatVal + " [Type: " + ((Object)floatVal).getClass().getSimpleName() + "]");
        System.out.println("doubleVal: "+ doubleVal + " [Type: " + ((Object)doubleVal).getClass().getSimpleName() + "]");
        System.out.println("byteVal: "+ byteVal + " [Type: " + ((Object)byteVal).getClass().getSimpleName() + "]");
        System.out.println("shortVal: "+ shortVal + " [Type: " + ((Object)shortVal).getClass().getSimpleName() + "]");
        System.out.println("longVal: "+ longVal + " [Type: " + ((Object)longVal).getClass().getSimpleName() + "]");
        System.out.println("------------------------");

        //byte into short: small into bigger (implicit type conversion)
        short result1 = byteVal;
        System.out.println("result1 byte -> short: "+result1 + " [Type: " + ((Object)result1).getClass().getSimpleName() + "]");

        //long into short: bigger into smaller (needs cast : explicit type conversion)
        short result2 = (short) longVal;
        System.out.println("result2 long -> short: "+result1 + " [Type: " + ((Object)result2).getClass().getSimpleName() + "]");

        short result3 = (short) (byteVal- longVal);
        System.out.println("result3 (short) (byte minus long) -> short: "+result3 + " [Type: " + ((Object)result3).getClass().getSimpleName() + "]");
        System.out.println("Success");
    }
}
