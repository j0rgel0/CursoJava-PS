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

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case '+':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case '-':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case '*':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case '/':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }

        int index = 0;
        for(double currentResult : results) {
            System.out.println(leftVals[index] + " " + opCodes[index] + " " + rightVals[index] + " = " + results[index]);
            index++;
        }
    }
}
