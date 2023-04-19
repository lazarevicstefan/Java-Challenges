import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double meter = scan.nextDouble();
        double price = meter * 7.61;
        double disc = price * 0.18;
        double fin = price - disc;

        System.out.printf("The final price is: %.2f USD.%n", fin);
        System.out.printf("The discount is: %.2f USD.%n",disc);

    }
}
