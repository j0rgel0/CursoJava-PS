public class Arrays {
    public static void main (String[] args){
/*
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;

 */ 
        float[] theVals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for (int index = 0; index < theVals.length; index++){
            System.out.println("theVals["+index+"] = " + theVals[index]);
            System.out.println("sum = " + sum + " + " + theVals[index]);
            sum += theVals[index];
            System.out.println("sum = "+sum);
            System.out.println();
        }
        /*
        theVals[0] = 10.0
        sum = 0.0 + 10.0
        sum = 10.0

        theVals[1] = 20.0
        sum = 10.0 + 20.0
        sum = 30.0

        theVals[2] = 15.0
        sum = 30.0 + 15.0
        sum = 45.0
         */
    }
}
