public class Parameters {
    public static void main (String[] args){
        showSum(7.5f,1.4f,3);
    }

    static void showSum(float x, float y, int count){
        float sum = x + y; // sum: 8.9
        for(int i = 0; i < count; i++){
            System.out.println(sum);
        }
        /*
            8.9
            8.9
            8.9
         */
    }
}
