import java.util.Scanner;

public class Domaci04 {
    public static String EnkriptujeCezarovKod (char a){
        char novi = (char)((int)a+3);
        return novi + "";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char karakter : unos.toCharArray()) {
            String sifrovano = EnkriptujeCezarovKod(karakter);
            sb.append(sifrovano);
        }
        System.out.println(sb);
    }
}