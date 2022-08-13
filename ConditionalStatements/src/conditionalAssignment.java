public class conditionalAssignment {
    public static void main(String[] args){
        int value1 = 7;
        int value2 = 5;
        // result = condition ? true-value: false-value ;
        int maxValue = value1 > value2 ? value1: value2;
        System.out.println(maxValue); // displays 7
        System.out.println("---------------");

        if (value1 > value2){
            System.out.println("Value 1 is bigger");
        } else if(value2 > value1){
            System.out.println("Value 2 is bigger");
        } else {
            System.out.println("Value 1  and value 2 are equal");
        }

        // Value 1 is bigger
    }
}
