import java.util.Scanner;

public class Vezba09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int centuries = Integer.parseInt(sc.nextLine());
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = 24 * days;
        double minutes = 60 * hours;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}