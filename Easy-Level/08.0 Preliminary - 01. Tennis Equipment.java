import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cenaReketa=Double.parseDouble(sc.nextLine());
        int brojReketa=Integer.parseInt(sc.nextLine());
        int brojPatika=Integer.parseInt(sc.nextLine());
        double totalReketi=brojReketa*cenaReketa;
        double cenaPatika=cenaReketa/6;
        double totalPatika=brojPatika*cenaPatika;
        double oprema=(totalReketi+totalPatika)*0.2;
        double total=totalReketi+totalPatika+oprema;
        double cenaDjokovic=Math.floor(total/8);
        double cenaSponzor=Math.ceil(total*7.0/8.0);
        System.out.printf("Price to be paid by Djokovic %.0f\n", cenaDjokovic);
        System.out.printf("Price to be paid by sponsors %.0f", cenaSponzor);

    }
}