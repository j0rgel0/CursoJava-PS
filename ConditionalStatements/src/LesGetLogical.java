public class LesGetLogical {
    public static void main(String[] args){

        int students = 150;
        int rooms = 4;
        //     true            true
        //   /     \         /     \
        if( rooms !=0 && students/rooms > 30){
            System.out.println("Crowded");
        }

        System.out.println();
        System.out.println("*** End of program ***");
    }
}
