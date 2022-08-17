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
}


