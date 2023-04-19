import java.net.Inet4Address;
import java.util.Scanner;

public class Domaci01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    int[] brojeviINT = new int[n];
    String[] brojeviString = new String[n];
    int sum = 0;
        for (int i = 0; i < n; i++) {
            String unos = scan.nextLine();
            brojeviString[i] = unos;
        }
        for (int i = 0; i < n; i++) {
            int sum2 = Integer.parseInt(brojeviString[i]);
            sum+= Integer.parseInt(brojeviString[i]);;
            System.out.print(sum2 + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}