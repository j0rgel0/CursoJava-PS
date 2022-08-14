public class BlockStatement {
    public static void main(String[] args){
        int v1 = 10, v2 = 4;
        final int diff;

        if (v1 > v2){ //Block Statement 1
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2, diff = " + diff);
        } else { //Block Statement 2
            diff = v2 - v1;
            System.out.println("v1 is not bigger than v2. diff= " + diff);
        }

        System.out.println();
        double students = 30.0d, rooms = 4.0d;
        if (rooms > 0.0d){
            System.out.println("# students: " + students);
            System.out.println("# rooms: " + rooms);
            double avg = students / rooms;
            System.out.println("Students per room: " + avg);
        }

    }
}
