import java.util.Scanner;

public class Vezba06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ukupno = "";
        for (int i = 0; i < 3; i++) {
            String unos = scan.nextLine();
            ukupno = ukupno +unos;
        }
        System.out.println(ukupno);
    }
}