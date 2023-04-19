import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        int drugibroj = Integer.parseInt(scan.nextLine());
        int ukupno = 0;
        if(drugibroj>10){
            System.out.printf("%d X %d = %d\n", broj, drugibroj, broj*drugibroj);
            return;}
        for (int i = 1;i<= 10;i++){
            if(i >=drugibroj) {
                int nesto = broj * i;
                System.out.printf("%d X %d = %d\n", broj, i, nesto);
            }
         }
     }
}