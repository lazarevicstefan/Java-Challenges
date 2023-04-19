import java.util.Scanner;

public class Exercise_06_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetniBroj = Integer.parseInt(sc.nextLine());
        int krajnjiBroj = Integer.parseInt(sc.nextLine());
        for (int brojimo = pocetniBroj; brojimo <= krajnjiBroj; brojimo++) {
            String brojTekst = brojimo + "";
            int n = brojTekst.length();
            int zbirParnihPozicija = 0;
            int zbirNeparnihPozicija = 0;
            for (int i = 0; i < n; i++) {
                char karakteriSaPozicije = brojTekst.charAt(i);
                int cifra = Integer.parseInt(karakteriSaPozicije + "");
                if (i % 2 == 0) {
                    System.out.printf("");
                    zbirParnihPozicija = zbirParnihPozicija + cifra;
                } else {
                    System.out.printf("");
                    zbirNeparnihPozicija = zbirNeparnihPozicija + cifra;
                }
            }
            if (zbirNeparnihPozicija == zbirParnihPozicija) {
                System.out.printf("%s ", brojTekst);
            }
        }
    }
}