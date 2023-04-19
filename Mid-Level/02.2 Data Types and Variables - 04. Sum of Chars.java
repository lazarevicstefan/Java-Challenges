import java.util.Scanner;

public class Domaci04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int fin = 0;
        for (int i = 0; i < n; i++) {
        char unos = scan.nextLine().charAt(0);
            fin = fin + (int)unos;
        }
        System.out.println("The sum equals: "+fin);
    }
}