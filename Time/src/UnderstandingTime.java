import java.time.Instant;

public class UnderstandingTime
{
    public static void main(String[] args){
        //InstantClass
    }

    static void checkRelationship(Instant otherInstant){
        Instant nowInstant = Instant.now();
        if(otherInstant.compareTo(nowInstant)>0){
            System.out.println("Instant is in the future");
        } else if (otherInstant.compareTo(nowInstant) < 0){
            System.out.println("Instant is in the past");
        } else {
            System.out.println("Instant is now");
        }
    }
}
