public class Main {
    public static void main (String[] args){
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'a';

        if(opCode == 'a') {
            result = value1 + value2;
            opCode = '+';
        }else if(opCode == 's'){
            result = value1 - value2;
            opCode = '+';
        }else if(opCode == 'm'){
            result = value1 * value2;
            opCode = '*';
        }else if(opCode == 'd'){
            result = value1 / value2;
            opCode = '/';
        }else {
            result = 0.0d;
        }
        System.out.println(value1+" "+ opCode +" "+value2+" = "+result);
    }
}
