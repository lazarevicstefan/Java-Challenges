import java.util.Scanner;

public class Vezba02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            niz[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.printf("%d ",niz[i]);
        }
    }
}