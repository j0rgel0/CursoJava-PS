public class Parameters {
    public static void main (String[] args){
        showSum(7.5f,1.4f,3);
        System.out.println("Back from showSum");
    }

    static void showSum(float x, float y, int count){
        if(count<1){
            return;
        }
        float sum = x + y; // sum: 8.9
        for(int i = 0; i < count; i++){
            System.out.println(sum);
            return;
        }
        /*
            8.9
         */
    }
}
