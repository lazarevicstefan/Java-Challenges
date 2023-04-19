import java.util.Scanner;

public class Domaci04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * 1 2 3 4 5
         * broj rotacija : 2
         *
         * 2 3 4 5 1
         * posle druge
         * 3 4 5 1 2
         */
        String[] nizDelova = scan.nextLine().split(" ");
        int brojRotacija = Integer.parseInt(scan.nextLine());
        int n = nizDelova.length;
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            niz[i] = Integer.parseInt(nizDelova[i]);
        }
        for (int j = 0; j < brojRotacija; j++) { // rotacijaaaa puta
            ///////////////////////////////////////////////////////////////////
        int vrednostPrvogElementa = niz[0];
        for (int i = 0; i < n - 1; i++) {
            niz[i] = niz[i+1];
        }
        niz[n-1] = vrednostPrvogElementa;

            
        ////////////////////////////////////////////////////////////////////////
        }
        for (int i = 0; i < n ; i++) {
            System.out.printf("%d ",niz[i]);
        }
    }
}