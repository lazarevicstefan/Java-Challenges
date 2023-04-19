import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger prviBroj = new BigInteger(scan.nextLine());
        BigInteger drugiBroj = new BigInteger(scan.nextLine());

        BigInteger sum = prviBroj.add(drugiBroj);
        System.out.println(sum);

    }
}