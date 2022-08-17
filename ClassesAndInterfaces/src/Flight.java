public class Flight {
    //Adding private: To applying Access Modifiers
    private int passengers;
    private int seats;

    public int getPassengers() {
        return passengers;
    }

    //Constructor
    public Flight(){
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger(){
        if(passengers < seats){
            passengers += 1;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }

    public boolean hasRoom(Flight f2){
        // Special reference: this
        // Making clear with "this" to reduce ambiguity
        int total = this.passengers + f2.passengers;
        return  total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        System.out.println("newFlight: "+newFlight);
        return newFlight;
    }
}


