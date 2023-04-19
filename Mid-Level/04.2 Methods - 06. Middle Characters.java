import java.util.Scanner;

public class Domaci06 {
    public static void centar (String text){
        int n = text.length();
        if (n % 2 == 0){
            int trenutni = n / 2 -1;
            int trenutni2 = n / 2;
            System.out.printf("%s%s",text.charAt(trenutni),text.charAt(trenutni2));
        }else {
            int trenutni = n / 2;
            System.out.println(text.charAt(trenutni));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        centar(unos);

    }
}