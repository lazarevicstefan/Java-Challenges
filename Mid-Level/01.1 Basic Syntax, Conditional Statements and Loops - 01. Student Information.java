import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ime = scan.nextLine();
        int godine = Integer.parseInt(scan.nextLine());
        Double ocena = Double.parseDouble(scan.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",ime,godine,ocena);
    }
}