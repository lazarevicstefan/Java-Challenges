import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak02 {
    public static void main(String[] args) {
//        Zadatak01.main(new String[]{"a", "b"});

        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        Pattern pattern = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(unos);

        ArrayList<String> nekiNiz = new ArrayList<>();
        while (matcher.find()){
            String rez = matcher.group();
            nekiNiz.add(rez);
        }
        for (int i = 0; i < nekiNiz.size(); i++) {
            if (i != nekiNiz.size()-1 ) System.out.printf("%s, ",nekiNiz.get(i));
            else System.out.printf("%s",nekiNiz.get(i));
        }


    }
}