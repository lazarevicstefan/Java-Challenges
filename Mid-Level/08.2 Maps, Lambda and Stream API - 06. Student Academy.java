import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Domaci06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<Double>> lista = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            String ime = scan.nextLine();
            Double ocena = Double.parseDouble(scan.nextLine());
            if (!lista.containsKey(ime)){
                lista.put(ime,new ArrayList<Double>());
            }
            if (!lista.get(ime).contains(ocena)) lista.get(ime).add(ocena);
        }
        for (Map.Entry<String, ArrayList<Double>> a:lista.entrySet()){
            String ime = a.getKey();
            Double zbir = 0.00;

            for (int i = 0; i < a.getValue().size() ; i++) {
                Double aaa = a.getValue().get(i);
                zbir = zbir + aaa;
            }

            Double resenje = zbir / a.getValue().size();
            if (resenje >= 4.50){
            System.out.printf("%s -> ",ime);
            System.out.printf("%.2f\n",resenje);
            }
        }
    }
}