import java.util.Scanner;

public class Vezba05 {
    public static void kupovina (String product,int kolicina){
        double cena = 0;
        switch(product){
            case "coffee":
                cena = 1.50;
                break;
            case "water":
                cena = 1.00;
                break;
            case "coke":
                cena = 1.40;
                break;
            case "snacks":
                cena = 2.00;
                break;
        }
        double ukupno = cena * kolicina;
        System.out.printf("%.2f",ukupno);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String proizvod = scan.nextLine();
        int kolicina = Integer.parseInt(scan.nextLine());
        kupovina(proizvod,kolicina);
    }
}