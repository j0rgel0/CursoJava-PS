public class LogicalOperators {
    public static void main(String[] args){
        int a= 20, b =14, c = 5;
        //      true
        //    /      \
        //  true    true
        //  /  \    /  \
        if (a > b & b > c ){
            System.out.println("a is greater than c");
        }

        boolean done = false;
        if (!done){ // ! negation
            System.out.println("Keep going!");
        }

        // && executes right only when left is true: true && true
        // || executes only when left is false: false||true true||---
    }
}
