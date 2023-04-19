import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadatak01 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String unos = scan.nextLine();

        String[] reci = unos.split(" ");
        int n = reci.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int nasumicnaPozicija = rand.nextInt(n);
            String pomocna = reci[i];
            reci[i] = reci[nasumicnaPozicija];
            reci[nasumicnaPozicija] = pomocna;

//            System.out.println(reci[nasumicnaPozicija]);
        }
        for(String rec : reci) System.out.println(rec);



    }
}