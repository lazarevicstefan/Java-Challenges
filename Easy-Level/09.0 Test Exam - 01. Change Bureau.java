import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int brojBitcoinaInput = Integer.parseInt(scan.nextLine());
        double brojJuanaInput = Double.parseDouble(scan.nextLine());
        double provizijaInput = Double.parseDouble(scan.nextLine());

        int ukupnoBitcouna = brojBitcoinaInput * 1168;
                double ukupnoJuana = brojJuanaInput * 0.15 * 1.76;
        Double ukupnoSabrano = (double)ukupnoBitcouna + ukupnoJuana;
        Double ukupnoEvri = ukupnoSabrano / 1.95;
        double provizija = ukupnoEvri * provizijaInput /100;
        double total = ukupnoEvri - provizija;
        System.out.printf("%.2f",total);




    }
}