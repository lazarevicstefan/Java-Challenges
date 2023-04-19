import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Vezba02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ulaz = scan.nextLine().split(" ");
        int n = ulaz.length;
        ArrayList<Integer> brojevi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            brojevi.add(Integer.parseInt(ulaz[i]));
        }

        for (int i = 0; i < n/2; i++) {
            Integer trenutni = brojevi.get(i);
            int duzinaListe = brojevi.size();
            Integer trenutniSaKraja = brojevi.get(duzinaListe-1);
            brojevi.set(i,trenutni +trenutniSaKraja);
            brojevi.remove(duzinaListe-1);
        }
        for (int broj:brojevi){
            System.out.print(broj+" ");
        }
    }
}