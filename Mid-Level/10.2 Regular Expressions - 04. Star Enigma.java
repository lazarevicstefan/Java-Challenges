import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domaci04 {
    public static String dekriptuj (String ulaz){
        Pattern pattern = Pattern.compile("[starSTAR]");
        Matcher matcher = pattern.matcher(ulaz);
        int brojac = 0;
        while (matcher.find()){
            brojac++;
        }
        StringBuilder desifrovano = new StringBuilder();
        for (char karakter : ulaz.toCharArray()){
            char izmenjen = (char) ((int)karakter-brojac);
            desifrovano.append(izmenjen);

        }
        return desifrovano.toString();
    }
    public static void main(String[] args) {

// STCDoghudd4=63333$D$0A53333
// EHfsytsnhf?8555&I&2C9555SR
// tt(''DGsvywgerx>6444444444%H%1B9444
// GQhrr|A977777(H(TTTT
// EHfsytsnhf?8555&I&2C9555SR

        Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            Pattern pattern = Pattern.compile("[^@\\-!:>]*@(?<nazivPlanete>[a-zA-z]+)[^@\\-!:>]*:(?<populacija>\\d+)[^@\\-!:>]*!(?<vrstaNapada>[AD])![^@\\-!:>]*->(?<brojVojnika>\\d+)");

        ArrayList<String> napadnutePlanete = new ArrayList<>();
        ArrayList<String> unistenePlanete = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String sifrovaniTekst = scan.nextLine();
            String desifrovaniTekst = dekriptuj(sifrovaniTekst);
            Matcher matcher = pattern.matcher(desifrovaniTekst);
            if (matcher.find()){
                String nazivPlanete = matcher.group("nazivPlanete");
                int populacija = Integer.parseInt(matcher.group("populacija"));
                String vrstaNapada = matcher.group("vrstaNapada");
                int brojVojnika = Integer.parseInt(matcher.group("brojVojnika"));

                if (vrstaNapada.equals("A")) napadnutePlanete.add(nazivPlanete);
                if (vrstaNapada.equals("D")) unistenePlanete.add(nazivPlanete);
            }
        }

        int brojNapadnutih = napadnutePlanete.size();
        int brojUnistenih = unistenePlanete.size();
        Collections.sort(napadnutePlanete);
        Collections.sort(unistenePlanete);
        System.out.printf("Attacked planets: %d\n",brojNapadnutih);
            napadnutePlanete.forEach(a -> System.out.printf("-> %s\n",a));
        System.out.printf("Destroyed planets: %d\n",brojUnistenih);
            unistenePlanete.forEach(a -> System.out.printf("-> %s\n",a));


    }
}