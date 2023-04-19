import java.util.Scanner;

public class Domaci02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        String[] delovi = unos.split(" ");
        String prviTekst = delovi[0];
        String drugiTekst = delovi[1];

        int n1 = prviTekst.length();
        int n2 = drugiTekst.length();
        int manjeDuzina , vecaDuzina;
        if (n1 > n2){
            vecaDuzina = n1;
            manjeDuzina = n2;
        }else {
            vecaDuzina = n2;
            manjeDuzina = n1;
        }
        int zbir = 0;

        for (int i = 0; i < manjeDuzina; i++) {
            char izPrvogTrenutnog = prviTekst.charAt(i);
            char izDrugogTrenutnog = drugiTekst.charAt(i);
            int prviVrednost = (int) izPrvogTrenutnog;
            int drugiVrednost = (int) izDrugogTrenutnog;
            int proizvod = prviVrednost * drugiVrednost;
            zbir = zbir  + proizvod;
        }
        for (int i = manjeDuzina; i < n1; i++) {
            zbir = zbir + (int) prviTekst.charAt(i);
        }
        for (int i = manjeDuzina; i < n2; i++) {
            zbir = zbir + (int) drugiTekst.charAt(i);
        }

        System.out.println(zbir);
    }
}