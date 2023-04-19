import java.util.*;

public class Domaci05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> lista = new LinkedHashMap<>();

        while (true){
            String unos = scan.nextLine();
            if (unos.equals("end"))break;

            String[] delovi = unos.split(" : ");
            String key = delovi[0];
            String vrednost = delovi[1];
            if (!lista.containsKey(key)){
            lista.put(key,new ArrayList<String>());
            }
            lista.get(key).add(vrednost);
        }
            for(Map.Entry<String,ArrayList<String>> a : lista.entrySet()){
                String ispis = a.getKey();
                int n = a.getValue().size();
                System.out.printf("%s: %d\n",ispis,n);
                for(String b : a.getValue()){
                    System.out.printf("-- %s\n",b);
                }
            }


    }
}