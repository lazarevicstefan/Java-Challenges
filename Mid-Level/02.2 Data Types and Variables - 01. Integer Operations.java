import java.util.Scanner;

public class Domaci01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());
        int sum = a+b;
        sum = sum /c;
        sum = sum *d;
        System.out.println(sum);
    }
}