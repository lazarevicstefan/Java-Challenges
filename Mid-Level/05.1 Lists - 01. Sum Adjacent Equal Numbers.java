import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Vezba01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        String[] deloviUnosa = unos.split(" ");
        int n = deloviUnosa.length;
        ArrayList<Double> brojevi = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        brojevi.add(Double.parseDouble(deloviUnosa[i]));
        }

        for(int i = 0; i < brojevi.size()-1 ; i++){
            double trenutni = brojevi.get(i);
            double sledeci = brojevi.get(i+1);
            if (trenutni == sledeci){
                 brojevi.set(i, trenutni + sledeci);
                 brojevi.remove(i+1);
                 i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat ("#.##");

        for(double ispis : brojevi){
            String fin = df.format(ispis);
            System.out.print(fin + " ");
        }
    }
}