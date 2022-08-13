public class PrefixPostfix {
    public static void main(String[] args){
        int someValue = 5;
        System.out.println("The original value of someValue: " + someValue);
        System.out.println("++someValue: " + ++someValue);
        System.out.println("someValue: " + someValue);

        int someOtherValue = 5;
        System.out.println("The original value of someOtherValue: " + someOtherValue);
        System.out.println("someOtherValue++: " + someOtherValue++);
        System.out.println("someOtherValue: " + someOtherValue);

        /*
        The original value of someValue: 5
        ++someValue: 6
        someValue: 6
        The original value of someOtherValue: 5
        someOtherValue++: 5
        someOtherValue: 6
         */
    }
}
