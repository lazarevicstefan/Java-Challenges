import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak02 {
    public static String izdvojSamoCifre(String tekst){
        Pattern pattern = Pattern.compile("[0-9]");
        StringBuilder sb = new StringBuilder();

        Matcher matcher_ceo_string = pattern.matcher(tekst);
        while (matcher_ceo_string.find()){
            sb.append(matcher_ceo_string.group());
        }
        /** karakter po karakter mecujemo
        for (char k : tekst.toCharArray()) {
            Matcher matcher = pattern.matcher(k + "");
            if (matcher.find()){
                sb.append(matcher.group());
            }
        }
         **/
        return  sb.toString();
    }

    public static void main(String[] args) {

// 3
// @#FreshFisH@#
// @###Brea0D@###
// @##Che46sE@##

        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^@#+[A-Z][a-zA-Z0-9]{4,}[A-Z]@#+$");
        int n = Integer.parseInt(scan.nextLine());
        String sifraProizvoda = "00";
        for (int i = 0; i < n; i++) {
            String unos = scan.nextLine();
            Matcher matcher = pattern.matcher(unos);
            if (matcher.find()){
                String poklapanje = matcher.group();
                sifraProizvoda = izdvojSamoCifre(poklapanje);
                if (sifraProizvoda.equals("")) sifraProizvoda = "00";
                System.out.println("Product group: " + sifraProizvoda);
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}