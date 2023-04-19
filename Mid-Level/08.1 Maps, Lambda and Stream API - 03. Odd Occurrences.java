import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Zadatak03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] reci = scan.nextLine().split(" ");
        LinkedHashMap<String,Integer> brojac = new LinkedHashMap<>();
        for (String a : reci){
            String konvertovanjeRecUMalaSlova = a.toLowerCase();
            if (!brojac.containsKey(konvertovanjeRecUMalaSlova)){
                brojac.put(konvertovanjeRecUMalaSlova,1);
            }else{
                int broj = brojac.get(konvertovanjeRecUMalaSlova);
                brojac.put(konvertovanjeRecUMalaSlova,broj+1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();
        for (var e:brojac.entrySet()){
            if (e.getValue() % 2 ==1){
                odds.add(e.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {

            if (i < odds.size() - 1){
                System.out.print(odds.get(i) + ", ");
            }else System.out.print(odds.get(i));
        }
    }
}