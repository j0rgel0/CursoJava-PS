public class FormatFlag {
    public static void main(String[] args){
        int iVal = 32;
        String s1 = String.format("%d",iVal);
        System.out.println(s1); //32
        String s2 = String.format("%x",iVal); //20 (hexadecimal)
        System.out.println(s2);

        //Flag format (#): Include radix
        String s3 = String.format("%#x",iVal); //0x20 (hexadecimal)
        System.out.println(s3);
        String s4 = String.format("%#X",iVal); //0X20 (hexadecimal)
        System.out.println(s4);
        System.out.println();

        int w =5, x = 235, y = 481, z = 12;
        s1 = String.format("W:%d X:%d", w, x);
        System.out.println(s1); // W:5 X:235
        s2 = String.format("Y:%d Z:%d", y, z);
        System.out.println(s2); // Y:481 Z:12

        // The number 4 is that expects 4 digits.
        s3 = String.format("W:%4d X:%4d", w, x);
        System.out.println(s3); // W:   5 X: 235
        s4 = String.format("Y:%4d Z:%4d", y, z);
        System.out.println(s4); // Y: 481 Z:  12

        System.out.println();

        //Flag format (0): Zero-padding
        s1 = String.format("W:%04d X:%04d", w, x);
        System.out.println(s1); // W:0005 X:0235
        s2 = String.format("Y:%04d Z:%04d", y, z);
        System.out.println(s2); // Y:0481 Z:0012

        //Flag format (-): Left justify
        s3 = String.format("W:%-4d X:%-4d", w, x);
        System.out.println(s3); // W:5    X:235
        s4 = String.format("Y:%-4d Z:%-4d", y, z);
        System.out.println(s4); // Y:481  Z:12
    }
}
