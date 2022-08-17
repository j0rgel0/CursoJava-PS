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
        slcToSf2.add1Passenger();
        System.out.println(slcToSf2.getPassengers()); // 3

        //Flight 3
        Flight lax1 = new Flight();
        //Flight 4
        Flight lax2 = new Flight();
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax2.add1Passenger();
        System.out.println(lax1.getPassengers()); // 2
        System.out.println(lax2.getPassengers()); // 1

        //Flight 5
        Flight lax3 =  null;
        System.out.println("Flight f3: "+lax3);

        if(lax1.hasRoom(lax2)){
            lax3 = lax1.createNewWithBoth(lax2);
            System.out.println("hasRoom f3 (passengers): "+lax3.getPassengers());
        }
        if(lax3 != null){
            System.out.println("Flights combined");
        }
    }
}
