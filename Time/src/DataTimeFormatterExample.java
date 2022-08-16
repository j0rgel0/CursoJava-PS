import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataTimeFormatterExample {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-08-16
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(today.format(usDateFormat)); //08-16-2022

        System.out.println("----------------");

        String usDateString = "07-04-2022";
        //LocalDate failed = LocalDate.parse(usDateString); //Error
        //DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy"); //in line9
        LocalDate theDate = LocalDate.parse(usDateString, usDateFormat);
        System.out.println(theDate); //2022-07-04
    }
}
