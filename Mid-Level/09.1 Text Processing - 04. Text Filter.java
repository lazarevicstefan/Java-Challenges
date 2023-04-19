import java.util.Scanner;

public class Zadatak04 {
    public static String cenzurisano (String rec){
        int n = rec.length();
        rec = "";
        for (int i = 0; i < n; i++) {
            rec = rec.concat("*");
        }
        return rec;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banovaneReci = scan.nextLine().split(", ");
        String tekst = scan.nextLine();
        for (int i = 0; i < banovaneReci.length; i++) {
            tekst = tekst.replaceAll(banovaneReci[i],cenzurisano(banovaneReci[i]));
        }
        System.out.println(tekst);
    }
}