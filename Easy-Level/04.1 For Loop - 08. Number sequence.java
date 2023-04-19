import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int najveciBroj = Integer.MIN_VALUE;
        int najmanjiBroj = Integer.MAX_VALUE;
        for (int i = 0; i<nBroj; i++){
            int broj = Integer.parseInt(scan.nextLine());
            if(broj > najveciBroj){
                najveciBroj = broj;
            }
            if(broj < najmanjiBroj){
                najmanjiBroj = broj;
            }
        }
        System.out.println("Max number: " + najveciBroj);
        System.out.println("Min number: " + najmanjiBroj);

    }
}