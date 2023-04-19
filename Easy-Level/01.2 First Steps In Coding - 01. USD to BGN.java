import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double usd = scan.nextDouble();
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}