import java.util.Scanner;

public class Domaci05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] unos = scan.nextLine().split(" ");
        int n = unos.length;
        int[] niz = new int[n];

        StringBuilder Najveciiiii = new StringBuilder();
        int trenutniNajveci = Integer.MIN_VALUE;
        int brojacNisi= 0;
        int[] najveciNiz = new int[n];
        int dupli = 0;
        for (int i = 0; i < n; i++) {
            niz[i] = Integer.parseInt(unos[i]);
        }
        int brojac = 0;
        for (int j = 0; j < n; j++) {


        for (int i = brojac; i < n; i++) {
            if(trenutniNajveci < niz[i]){
                trenutniNajveci = niz[i];

            }
        }

        if (dupli != trenutniNajveci){
            Najveciiiii.append((int) trenutniNajveci).append(" ");
            dupli = trenutniNajveci;
        }
        brojac++;
        trenutniNajveci = Integer.MIN_VALUE;

        }
        System.out.println(Najveciiiii);
    }
}