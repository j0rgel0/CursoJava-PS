public class Flight {
    int passengers;
    int seats;

    //Constructor
    Flight(){
        seats = 150;
        passengers = 0;
    }

    void add1Passenger(){
        if(passengers < seats){
            passengers += 1;
        }
    }
}


