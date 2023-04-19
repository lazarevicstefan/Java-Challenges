import java.util.Scanner;

public class Zadatak09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n_input = Integer.parseInt(scan.nextLine());
        double final_sum = 0;
        char ccc = '$';
        for (int i = 0; i <n_input;i++) {
            double Price_Input = Double.parseDouble(scan.nextLine());
            int days_input = Integer.parseInt(scan.nextLine());
            int count = Integer.parseInt(scan.nextLine());
            double sum = Price_Input * days_input * count;
            final_sum = final_sum + sum;
            System.out.printf("The price for the coffee is: %c%.2f\n",ccc,sum);
        }
        System.out.printf("Total: %c%.2f",ccc,final_sum);
    }
}