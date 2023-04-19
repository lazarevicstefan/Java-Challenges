import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        int nekibroj = 1;
        int sum = 0;
        for (int i = 1; i <= broj; i++) {
            System.out.println(nekibroj);
            sum = sum + nekibroj;
            nekibroj = nekibroj +2;
        }
        System.out.printf("Sum: %d\n", sum);
    }
}