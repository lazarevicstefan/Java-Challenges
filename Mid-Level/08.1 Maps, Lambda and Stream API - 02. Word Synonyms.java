import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak02 {
    public static void ispisiListu (ArrayList<String> lista){
        for (int i = 0; i < lista.size(); i++) {
                if (i != lista.size()-1){
                    System.out.printf("%s, ",lista.get(i));
                }else System.out.printf("%s\n",lista.get(i));
        }
    }
    public static void ispisiMapu (LinkedHashMap<String,ArrayList<String>> mapaZaIspis){
        for (Map.Entry<String,ArrayList<String>> unos : mapaZaIspis.entrySet()){
            String pojma = unos.getKey();
            ArrayList<String> listaSinonima = unos.getValue();
            System.out.printf("%s - ",pojma);
            ispisiListu(listaSinonima);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, ArrayList<String>> pojmoviSaSinonimima = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String pojam = scan.nextLine();
            String sinonim = scan.nextLine();
            if (!pojmoviSaSinonimima.containsKey(pojam)){
                pojmoviSaSinonimima.put(pojam,new ArrayList<>());
                pojmoviSaSinonimima.get(pojam).add(sinonim);
            } else {
                pojmoviSaSinonimima.get(pojam).add(sinonim);
            }
        }
        ispisiMapu(pojmoviSaSinonimima);

    }
}