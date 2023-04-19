import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Domaci08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> firmeIZaposleni = new LinkedHashMap<>();

        while (true){
            String unos = scan.nextLine();
            if (unos.equals("End")) break;
            String[] delovi = unos.split(" -> ");
            String firma = delovi[0];
            String id = delovi[1];

            if (!firmeIZaposleni.containsKey(firma)){
                firmeIZaposleni.put(firma,new ArrayList<String>());
            }
            if (!firmeIZaposleni.get(firma).contains(id)) { // ako ne sadrzi taj ID onda ga dodajemo u listu
                firmeIZaposleni.get(firma).add(id);
            }
        }
//        firmeIZaposleni.entrySet()
//                .stream()
//                .forEach(e -> System.out.printf("%s\n-- %s"));
        for(Map.Entry<String,ArrayList<String>> e :firmeIZaposleni.entrySet()){
            String nazivFirme = e.getKey();
            ArrayList<String> trenutniNiz = e.getValue();
            System.out.println(nazivFirme);
            for(String id : trenutniNiz) {
                System.out.printf("-- %s\n",id);
            }
        }
    }
}