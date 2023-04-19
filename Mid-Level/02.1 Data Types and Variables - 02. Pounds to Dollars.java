import java.util.Scanner;

public class vezba02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num_input = Double.parseDouble(scan.nextLine());
        double fin = num_input * 1.36;
        System.out.printf("%.3f",fin);
    }
}