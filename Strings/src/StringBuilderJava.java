import java.lang.StringBuilder;
public class StringBuilderJava {

    public static void main(String[] args){
        String location = "Florida";
        int flightNumber = 175;

        // StringBuilder
        // Efficiently constructs strings values
        // Add new content to end with append
        // Add new content within with insert
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);

        // Use toString to extract content to a string
        String message = sb.toString(); //I flew to Florida on Flight #175
        System.out.println(message);

        String time = "9:00";
        int pos = sb.indexOf(" on");
        sb.insert(pos," at ");
        sb.insert(pos + 4, time);
        message = sb.toString(); //I flew to Florida at 9:00 on Flight #175
        System.out.println(message);
    }
}
