import java.util.Scanner;

public class Vezba02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unosSoba = scan.nextLine();

        String[] nizSoba = unosSoba.split("\\|");

//        for (String a : nizSoba)System.out.println(a);

        int heroHp = 100;
        int bitcoinSakupljeno = 0;

        for (int i = 0; i < nizSoba.length; i++) {
            String[] deloviKomande = nizSoba[i].split(" ");
            String komanda = deloviKomande[0];
            int parametarKaoBroj = Integer.parseInt(deloviKomande[1]);
            if (komanda.equals( "potion")){
                int pomocna = heroHp;
                heroHp = heroHp + parametarKaoBroj;
                if (heroHp > 100) {
                    parametarKaoBroj = 100 - pomocna;
                    heroHp = 100;}

                System.out.printf("You healed for %d hp.\n",parametarKaoBroj);
                System.out.printf("Current health: %d hp.\n",heroHp);
            }else if (komanda.equals("chest")){
                System.out.printf("You found %d bitcoins.\n",parametarKaoBroj);
                bitcoinSakupljeno = bitcoinSakupljeno + parametarKaoBroj;
            }else{
                heroHp = heroHp - parametarKaoBroj;
                if (heroHp > 0){
                    System.out.printf("You slayed %s.\n",komanda);
                }else {
                    System.out.printf("You died! Killed by %s.\n", komanda);
                    int brojSobe = i+1;
                    System.out.printf("Best room: %d\n", brojSobe);
                    return;
                }
            }
        }
        System.out.printf("You've made it!\n");
        System.out.printf("Bitcoins: %d\n",bitcoinSakupljeno);
        System.out.printf("Health: %d\n",heroHp);
    }
}