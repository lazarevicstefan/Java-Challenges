import java.sql.BatchUpdateException;
import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int brojDana = Integer.parseInt(scan.nextLine());
        double totalnaKolicinaHrane= Double.parseDouble(scan.nextLine());

        double sumaZaPas = 0;
        double sumaZaMacku = 0;
        double sumaBiscuit = 0;
        double kolacicZaTajDan;
        for (int i = 1;i <= brojDana;i++){
        int pasPojeoZaTajDan = Integer.parseInt(scan.nextLine());
        int mackaPojelaZaTajDan = Integer.parseInt(scan.nextLine());
        sumaZaPas = sumaZaPas + pasPojeoZaTajDan;
        sumaZaMacku = sumaZaMacku + mackaPojelaZaTajDan;
        if(i % 3 == 0){
            kolacicZaTajDan = (pasPojeoZaTajDan + mackaPojelaZaTajDan) * 0.1;
            sumaBiscuit = sumaBiscuit + kolacicZaTajDan;
        }
        }
        double ukupnoHrane= sumaZaPas + sumaZaMacku;
        double procenatPojedeneHrane= ukupnoHrane / totalnaKolicinaHrane *100;
        double procenatPas = sumaZaPas / ukupnoHrane *100;
        double procenatMacka = sumaZaMacku / ukupnoHrane *100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n",sumaBiscuit);
        System.out.printf("%.2f%% of the food has been eaten.\n",procenatPojedeneHrane);
        System.out.printf("%.2f%% eaten from the dog.\n", procenatPas);
        System.out.printf("%.2f%% eaten from the cat.\n",procenatMacka);


    }
}