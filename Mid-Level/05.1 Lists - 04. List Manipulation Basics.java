import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vezba04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] unos = scan.nextLine().split(" ");
        ArrayList<String> unosLista = new ArrayList<>();
        unosLista.addAll(Arrays.asList(unos));
        while(true){
            String trenutno =  scan.nextLine();
            if(trenutno.equals("end")) break;
            String[] komanda = trenutno.split(" ");
            String number = komanda[1];
            switch (komanda[0]){
                case "Add":
                    unosLista.add(number);
                    break;
                case "Remove":
                    String brojZaBrisanje = komanda[1];
                    unosLista.remove(String.valueOf(brojZaBrisanje));
                    break;
                case "RemoveAt":
                    int indexZaBrisanje = Integer.parseInt(komanda[1]);
                    unosLista.remove(indexZaBrisanje);
                    break;
                case "Insert":
                    String brojZaInsertovanje = komanda[1];
                    int brojIndexa = Integer.parseInt(komanda[2]);
                    unosLista.add(brojIndexa,brojZaInsertovanje);
                    break;
            }
        }
//        System.out.println(unosLista.toString().replaceAll("\\[\\],", " "));
        for (String a : unosLista){
            System.out.printf("%s ",a);
        }
    }
}