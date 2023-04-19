import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int budzetInput = Integer.parseInt(scan.nextLine());
        String sezonaInput = scan.nextLine();
        int brojPecarosaInput = Integer.parseInt(scan.nextLine());
        double spring = 3000;
        double summer_autumn = 4200;
        double winter = 2600;
        double popust = 0.0;
        if (brojPecarosaInput <=6){
            popust = 10;
        }else if (brojPecarosaInput >=7 && brojPecarosaInput <=11){
            popust = 15;
        }else if (brojPecarosaInput >=12){
            popust = 25;
        }

        double ukupna_cena = 0;
        if (sezonaInput.equals("Spring")){
            ukupna_cena = spring * (100-popust)/100;
        }else if (sezonaInput.equals("Summer") || sezonaInput.equals("Autumn")){
            ukupna_cena = summer_autumn * (100-popust)/100;
        }else if (sezonaInput.equals("Winter")){
            ukupna_cena = winter * (100-popust)/100;
        }
        if (!sezonaInput.equals("Autumn") && brojPecarosaInput % 2 == 0){
            ukupna_cena = ukupna_cena * 0.95;
        }
        if (ukupna_cena <=budzetInput){
            double ostatak = budzetInput - ukupna_cena;
            System.out.printf("Yes! You have %.2f USD left.",ostatak);
        }else {
            double nedostaje = ukupna_cena - budzetInput;
            System.out.printf("Not enough money! You need %.2f USD.",nedostaje);
        }

       }
    }