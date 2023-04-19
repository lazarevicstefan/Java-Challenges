import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        double ukupno = 0;
        int brojac = 0;
        for(int i = 2 ; i <= nBroj ; i = i +2 ) {
            brojac++;
            ukupno = ukupno + (brojac *10);
        }
        double kostaToStoHoce = Double.parseDouble(scan.nextLine());
        int utopilaIgracke = Integer.parseInt(scan.nextLine());
        int ukupnaCenaZaIgracke = 0;
        int brojac2 = 0;
        for (int i = 1; i <= nBroj ; i = i +2){
            brojac2++;
        }

        ukupnaCenaZaIgracke = brojac2 * utopilaIgracke;
        ukupno = ukupno + ukupnaCenaZaIgracke;
        int a = nBroj/2;
        double brat = Math.floor(a);
        ukupno = ukupno - brat;

        if(ukupno>=kostaToStoHoce){
            double rrrukupno = ukupno - kostaToStoHoce;
            System.out.printf("Yes! %.2f",rrrukupno);
        }else {
            double aaaukupno = ukupno - kostaToStoHoce;
            double total = Math.abs(aaaukupno);
                    System.out.printf("No! %.2f",total);
        }

    }
}