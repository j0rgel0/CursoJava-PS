import java.util.Scanner;

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

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            int index = 0;
            for (double currentResult : results) {
                System.out.println(leftVals[index] + " " + opCodes[index] + " " + rightVals[index] + " = " + results[index]);
                index++;
            }
        } else if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();;
        } else if (args.length == 3) {
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

    static void executeInteractively() {
        System.out.println("Enter an operator an two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        switch (opCode) {
            case 'a':
                opCode = '+';
                break;
            case 's':
                opCode = '-';
                break;
            case 'm':
                opCode = '*';
                break;
            case 'd':
                opCode = '/';
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                break;
        }
        System.out.println(leftVal + " " + opCode + " " + rightVal + " = " + result);
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
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break; // Using break exits the loop and then runs the next statement after the loop
            }
        }
        return value;
    }
}
