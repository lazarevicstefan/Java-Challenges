import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Domaci01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String unos = scan.nextLine();
        LinkedHashMap<String,Integer> slovaPonavljanja = new LinkedHashMap<>();
        for (int i = 0; i < unos.length(); i++) {
            String trenutni = unos.charAt(i) + "";
            if (!trenutni.equals(" ")) {
                if (!slovaPonavljanja.containsKey(trenutni)) {
                    slovaPonavljanja.put(trenutni, 1);
                } else slovaPonavljanja.put(trenutni, slovaPonavljanja.get(trenutni) + 1);
            }
        }
        for (Map.Entry<String,Integer> m : slovaPonavljanja.entrySet()){
            String key = m.getKey();
            Integer value = m.getValue();
            System.out.printf("%s -> %d\n",key,value);
        }


    }
}