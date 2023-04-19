import java.math.BigDecimal;
import java.util.Scanner;

public class Zadatak02 {
    public static int faktorijel(int broj){
        int proizvod = 1;
        for (int i = 1; i <= broj; i++) {
            proizvod = proizvod * i;
        }
        return proizvod;
    }
        public static BigDecimal fartorijelPrecizan (int broj){
        BigDecimal proizvod = new BigDecimal("1");
            for (int i = 1; i <= broj ; i++) {
                BigDecimal trenutnoI = new BigDecimal(i);
                proizvod = proizvod.multiply(trenutnoI);
//                System.out.println(proizvod);
            }
            return proizvod;
        }


    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());

        System.out.println(fartorijelPrecizan(broj));
//        for (int i = 1; i <= 100; i++) {
//            fartorijelPrecizan(i);
//        }

    }
}