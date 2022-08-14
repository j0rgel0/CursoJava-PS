public class CallingMethods {
    public static void main (String[] args){
        System.out.println("Before method call");
        doSomething();
        System.out.println("After method call");

        /*
        Before method call
        Inside method
        Still inside
        After method call
         */
    }

    static void doSomething(){
        System.out.println("Inside method");
        System.out.println("Still inside");
    }
}
