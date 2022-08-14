public class StringConvertions {
    public static void main(String[] args){
        int iVal= 100;
        String sVal = String.valueOf(iVal); // "100"

        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println(output); // 2 * 3 = 6
    }
}
