import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Domaci02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> resursiKolicine = new LinkedHashMap<>();
        while (true){
            String resurs = scan.nextLine();
            if (resurs.equals("stop")) break;
            Integer kolicinaTrenutna = Integer.parseInt(scan.nextLine());
            resursiKolicine.putIfAbsent(resurs,0);
            int trenutnaKolicinaResursa = resursiKolicine.get(resurs);
//            System.out.println(trenutnaKolicinaResursa);

            resursiKolicine.put(resurs, trenutnaKolicinaResursa + kolicinaTrenutna);

        }
        resursiKolicine
                .entrySet()
                .stream()
                .forEach(element -> System.out.printf("%s -> %d\n",element.getKey(),element.getValue()));
//        for(Map.Entry<String,Integer> a:resursiKolicine.entrySet()){
//            System.out.println(a);
//        }

    }
}