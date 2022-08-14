public class Parameters {
    public static void main (String[] args){
        showSum(7.5f,1.4f,3); // 8.9
        System.out.println("Back from showSum");

        double result = calculateInterest(100d,0.05d,10);
        System.out.println();
        System.out.println("Calculate Interest :"+result); // 50.0

        double[] result2 = produceInterestHistory(100d,0.05d, 10);
        System.out.println();
        System.out.println("Produce Interest History:"+result2); // 50.0
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

    }
    static double calculateInterest(double amt, double rate, int years){
        //double interest = amt * rate * years;
        return amt * rate * years;
    }

    static double[] produceInterestHistory(double amt, double rate, int years){
        double[] accumulatedInterest = new double[years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++){
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }
}
