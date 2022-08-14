public class Switch {
    public static void main(String[] args){
        // Primitives types supported: byte, short, int, long, char
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'a';

        switch(opCode){
            case 'a':
                result = value1 + value2;
                opCode = '+';
                break;
            case 's':
                result = value1 - value2;
                opCode = '-';
                break;
            case 'm':
                result = value1 * value2;
                opCode = '*';
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                opCode = '/';
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(value1+" "+ opCode +" "+value2+" = "+result);
    }
}
