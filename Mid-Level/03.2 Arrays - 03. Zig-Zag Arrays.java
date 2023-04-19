import java.util.Scanner;

public class Domaci03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] niz = new int[2];
        int[] niz1 = new int[n];
        int[] niz2 = new int[n];
        int brojac1 = 0;
        int brojac2 = 0;
        boolean provera = true;
        for (int i = 0; i < n; i++) {
            String[] nizInt = scan.nextLine().split(" ");
            niz[0] = Integer.parseInt(nizInt[0]);
            niz[1] = Integer.parseInt(nizInt[1]);
            if (provera) {
                niz1[brojac1] = niz[0];
                brojac1++;
                niz2[brojac2] = niz[1];
                brojac2++;
                provera = false;
            }else {
                niz1[brojac1] = niz[1];
                brojac1++;
                niz2[brojac2] = niz[0];
                brojac2++;
                provera = true;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.printf("%d ",niz1[k]);
        }
        System.out.println();
        for (int k = 0; k < n; k++) {
            System.out.printf("%d ",niz2[k]);
        }
    }
}