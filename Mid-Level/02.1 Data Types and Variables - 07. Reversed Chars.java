
import java.util.Scanner;

public class Vezba07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ukupno = "";
        String stampa = "";
        for (int i = 0; i < 3; i++) {
            String unos = scan.nextLine();
            ukupno = ukupno + unos;
        }
        for (int i = 2; i >= 0; i--) {
            String fin = "" + ukupno.charAt(i);
            stampa = stampa + fin + " ";
        }
        System.out.println(stampa);
    }
}

//**

import java.util.Scanner;

public class Vezba07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
char a = scan.nextLine().charAt(0);
char b = scan.nextLine().charAt(0);
char c = scan.nextLine().charAt(0);
        System.out.printf("%c %c %c", c,b,a);
    }
}
*/