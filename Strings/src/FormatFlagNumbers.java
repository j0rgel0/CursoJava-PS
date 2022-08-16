public class FormatFlagNumbers {
    public static void main(String[] args){
        int iVal = 1234567;
        double dVal = 1234567.0d;

        //Format flags (,): Include grouping separator
        String s1 = String.format("%d",iVal);
        System.out.println(s1); //1234567
        String s2 = String.format("%,d",iVal);
        System.out.println(s2); //1,234,567
        String s3 = String.format("%,.2f",dVal);
        System.out.println(s3); //1,234,567.00

        System.out.println();

        int iPosVal=123, iNegVal = -456;
        String s4 = String.format("%d",iPosVal);
        System.out.println(s4); //123
        String s5 = String.format("%d",iNegVal);
        System.out.println(s5); //-456

        //Format flags ( ): Leading space when positive number
        s4 = String.format("% d",iPosVal);
        System.out.println(s4); // 123 (with an space)
        s5 = String.format("% d",iNegVal);
        System.out.println(s5); //-456
        //Format flags (+): Always show sign
        s4 = String.format("%+d",iPosVal);
        System.out.println(s4); //+123 (with an space)
        s5 = String.format("%+d",iNegVal);
        System.out.println(s5); //-456
        //Format flags ((): Enclose negative values in parenthesis
        s4 = String.format("%(d",iPosVal);
        System.out.println(s4); //123
        s5 = String.format("%(d",iNegVal);
        System.out.println(s5); //(456)

        //Multiple flags
        s4 = String.format("% (d",iPosVal);
        System.out.println(s4); // 123 (with an space)
        s5 = String.format("% (d",iNegVal);
        System.out.println(s5); //(456)
    }
}
