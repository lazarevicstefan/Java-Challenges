import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Domaci05 {
    public static String pomnoziVelikiBrojPrekoStringa (String velikiBroj, String jednaCifra){
        if (jednaCifra.equals("0")) return "0";
        int broj = Integer.parseInt(jednaCifra);
        int n = velikiBroj.length();
        int prenos = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            char trenutniKarakter = velikiBroj.charAt(i);
            int zaistaCIfra = Integer.parseInt(trenutniKarakter + "");
            int rez = (zaistaCIfra * broj) + prenos;
            if (rez > 9){
                prenos = rez / 10;
            }else prenos = 0;
            int cifraRezultata = rez % 10;
            sb.append(cifraRezultata);
        }
        if (prenos != 0) sb.append(prenos);
        String a = sb.reverse().toString();
            return  a;
    }
    public static String UkloniNULE  (String sb){
        int n = sb.length();
        int pozicijaPrveCifreKojaNijeNULA = 0;
        int brojac = 0;
        while (true){
            if (sb.charAt(brojac) == '0'){
                brojac++;
            }else break;
        }
        return sb.substring(brojac);
//        for (int i = 0; i < n ; i++){
//            if (sb.charAt(i) != '0'){
//                pozicijaPrveCifreKojaNijeNULA = i;
//                break;
//            }
//        }
//        return sb.substring(pozicijaPrveCifreKojaNijeNULA);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(pomnoziVelikiBrojPrekoStringa(UkloniNULE(scan.nextLine()), scan.nextLine()));
//        BigDecimal a = new BigDecimal(scan.nextLine());
//        BigDecimal b = new BigDecimal(scan.nextLine());
//        BigDecimal c = a.multiply(b);
//        System.out.println(c);



    }
}