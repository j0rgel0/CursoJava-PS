public class Main {
    public static void main(String[] args){
        usingClasses();
    }

    private static void usingClasses() {

        //Flight 1
        // Create a variable
        Flight nycToLv1;
        // The new keyboard to create a class instance (a.k.a an object)
        nycToLv1 = new Flight();

        //Flight 2
        Flight slcToSf2 = new Flight();

        slcToSf2.add1Passenger();
        System.out.println(slcToSf2.getPassengers()); // 1

        //These are NOT primitive types, there are reference types.
        //The only thing it assigns it's the reference
        slcToSf2 = nycToLv1;

        System.out.println(slcToSf2.getPassengers()); // 0

        nycToLv1.add1Passenger();
        nycToLv1.add1Passenger();
        System.out.println(slcToSf2.getPassengers()); // 2
    }
}
