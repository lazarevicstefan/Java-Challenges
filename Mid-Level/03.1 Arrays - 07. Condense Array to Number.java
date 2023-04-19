import java.util.Scanner;

public class Vezba07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );
        String unosPOI = scan.nextLine();
        String[] unos = unosPOI.split(" ");
        int n = unos.length;
        int[] unosINT = new int[n];

        for (int i = 0; i < n; i++) {
            unosINT[i] = Integer.parseInt(unos[i]);
        }
        while(n >= 1) {
            for (int i = 0; i < n - 1; i++) {
                unosINT[i] = unosINT[i] + unosINT[i + 1];
            }
            for (int i = 0; i < n -1; i++) {
                // System.out.printf("%d ",unosINT[i]);
            }
            System.out.println();
            n--;
        }
        System.out.println(unosINT[0]);
    }
}