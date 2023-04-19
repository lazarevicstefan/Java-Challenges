import java.math.BigDecimal;
import java.util.Scanner;

public class Vezba03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short n = Short.parseShort(scan.nextLine());
        BigDecimal trenutniZbir = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal niviBroj = new BigDecimal(scan.nextLine());
           // System.out.println(niviBroj);
            trenutniZbir = trenutniZbir.add(niviBroj);
        }
        System.out.println(trenutniZbir);
    }
}