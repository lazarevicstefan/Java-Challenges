import java.sql.BatchUpdateException;
import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double budzet = Double.parseDouble(scan.nextLine());
        int brojNoci = Integer.parseInt(scan.nextLine());
        double cenaPoNoci = Double.parseDouble(scan.nextLine());
        int procenatZaDodatneTroskove = Integer.parseInt(scan.nextLine());

        if(brojNoci > 7){
            cenaPoNoci = cenaPoNoci * 0.95;
        }

        double ukupnaCena = brojNoci * cenaPoNoci;
        ukupnaCena = ukupnaCena + budzet * procenatZaDodatneTroskove /100;

        double preostaloNovca = budzet - ukupnaCena;
        if(preostaloNovca >=0){
            System.out.printf("Smiths will be left with %.2f USD after vacation.",preostaloNovca);
        }else {
            preostaloNovca = -preostaloNovca;
            System.out.printf("%.2f USD needed.",preostaloNovca);

        }




    }
}