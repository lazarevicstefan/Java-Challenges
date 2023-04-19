import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        Pattern pattern = Pattern.compile(
                "\\b(?<day>\\d{2})(\\.|\\/|\\-)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(tekst);
        while (matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s\n",day,month,year);
        }


    }
}