public class StringFormatting {
    public static void main(String[] args){
        //Format specifiers: Focus is on describing desired result
        //Can control many aspects of appearance

        // Concatenation
        int david = 17, dawson = 15, dillon = 8, gordon = 6;
        String s1 = "My nephews are " + david + ", " + dawson + ", " + dillon + ", and " + gordon + " years old";
        System.out.println(s1);
        // My nephews are 17, 15, 8, and 6 years old

        // Formatting
        String s2 = String.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
        System.out.println(s2);
        // My nephews are 17, 15, 8, and 6 years old
        System.out.println();

        double avgDiff = ((david-dawson)+(dawson-dillon)+(dillon-gordon))/3.0d;

        String s3 = "The average age between each is " + avgDiff + " years";
        System.out.println(s3);
        // The average age between each is 3.6666666666666665 years

        String s4 = String.format("The average age between each is %.1f years", avgDiff);
        System.out.println(s4);
        // The average age between each is 3.7 years
    }
}
