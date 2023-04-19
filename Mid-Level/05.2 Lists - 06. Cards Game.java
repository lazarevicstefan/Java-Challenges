import java.util.ArrayList;
import java.util.Scanner;

public class Domaci06 {
    public static void unesiListu (ArrayList<Integer> brojevi, String text){
        String[] delovi = text.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }

    }
    public static void ispisiListu (ArrayList<Integer> brojevi){
        for(int broj : brojevi){
            System.out.printf("%d ",broj);
        }
        System.out.println();
    }
    public static void prebaciKartuNaKrajuPrvog (ArrayList<Integer> prvi, ArrayList<Integer> drugi){
        int izgubio = drugi.get(0);
        int pobedio = prvi.get(0);
        drugi.remove(0);
        prvi.remove(0);
        prvi.add(pobedio);
        prvi.add(izgubio);
    }
    public static int sum (ArrayList<Integer> brojevi){
        int zbir = 0;
        for (int a : brojevi){
            zbir = zbir + a;
        }
        return zbir;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String secound = scan.nextLine();
        ArrayList<Integer> firstPlayer = new ArrayList<>();
        ArrayList<Integer> secoundPlayer = new ArrayList<>();
        unesiListu(firstPlayer, first);
        unesiListu(secoundPlayer, secound);

        while (true){

            int duzinaJedan = firstPlayer.size();
            int duzinaDva = secoundPlayer.size();
            if( duzinaJedan-1 < 0){
                int sum = sum(secoundPlayer);
                System.out.println("Second player wins! Sum: "+ sum);
                break;
            }else if (duzinaDva-1 < 0){
                int sum = sum(firstPlayer);
                System.out.println("First player wins! Sum: "+ sum);
                break;
            }
            int pozicijaPrvogIgraca = firstPlayer.get(0);
            int pozicijaDrugogIgraca = secoundPlayer.get(0);

            if (pozicijaPrvogIgraca>pozicijaDrugogIgraca){
                prebaciKartuNaKrajuPrvog(firstPlayer,secoundPlayer);
            }else if(pozicijaDrugogIgraca>pozicijaPrvogIgraca){
                prebaciKartuNaKrajuPrvog(secoundPlayer,firstPlayer);
            }else {
                    firstPlayer.remove(0);
                    secoundPlayer.remove(0);
            }
        }
    }
}