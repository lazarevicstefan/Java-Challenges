import java.util.Scanner;

public class Zadatak02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        String[] delovi = unos.split(" ");
        String rez = "";
        for(String s: delovi){
            int duzina = s.length();
            for (int i = 0; i < duzina; i++) {
//                rez += s;
                rez = rez.concat(s);
            }
        }
        System.out.println(rez);
    }
}