import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        Pattern pattern = Pattern.compile("(\\b[A-Z][a-z]+) ([A-Z][a-z]+\\b)");
        ///  \b - oznacava da regex kupi samo cele reci
        Matcher matcher = pattern.matcher(unos);

        while (matcher.find()){
            String rez = matcher.group();
            System.out.printf("%s ",rez);

        }
//        if (matcher.find()){
//            String rez = matcher.group();
//            System.out.println(rez);
//        }



    }
}