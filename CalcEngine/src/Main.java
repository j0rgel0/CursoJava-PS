public class Main {
    public static void main(String[] args) {
        /*
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'a';
        */

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'/', '+', '-', '*'};
        double[] results = new double[opCodes.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            int index = 0;
            for (double currentResult : results) {
                System.out.println(leftVals[index] + " " + opCodes[index] + " " + rightVals[index] + " = " + results[index]);
                index++;
            }
        } else if(args.length == 3){
            handleCommandLine(args);
            /*
            Testing in CommandLine
            C:\Users\jorge\IdeaProjects\CalcEngine\out\production\CalcEngine>java Main + 20 50
            20.0 + 50.0 = 70.0
             */
        } else {
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(leftVal + " " + opCode + " " + rightVal + " = " + result);

    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case '+':
                result = leftVal + rightVal;
                break;
            case '-':
                result = leftVal - rightVal;
                break;
            case '*':
                result = leftVal * rightVal;
                break;
            case '/':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
}
