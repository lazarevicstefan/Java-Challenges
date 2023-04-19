import java.util.Scanner;

public class Domaci02 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        int zbir = 0;
        while (broj != 0){
            int brojA = broj % 10;
            zbir = zbir + brojA;
            broj = broj /10;
        }
        System.out.println(zbir);
    }
}