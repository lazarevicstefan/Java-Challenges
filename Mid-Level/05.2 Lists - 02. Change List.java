import java.util.ArrayList;
import java.util.Scanner;

public class Domaci02 {
    public static void unesiListu (ArrayList<Integer> brojevi, String text){
        String[] delovi = text.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }

    }
    public static void ispisiListu (ArrayList<Integer> brojevi){
        for(int broj : brojevi){
            System.out.printf("%d ",broj);
        }
        System.out.println();
    }
    public static void obrisiSvePoVrednosti (ArrayList<Integer> brojevi , int broj){
        while (brojevi.contains(broj)) {
            brojevi.remove(Integer.valueOf(broj));
        }
    }
    public static void  ubaciNaPoziciju (ArrayList<Integer> brojevi, int broj , int index){
        brojevi.add(index,broj);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text  = scan.nextLine();
        ArrayList<Integer> brojevi = new ArrayList<>();
        unesiListu(brojevi,text);
        while (true){
            String komanda = scan.nextLine();
            if(komanda.equals("end")) break;
            String[] delovi = komanda.split(" ");
            String nazivKomande = delovi[0];
            int prviBroj = Integer.parseInt(delovi[1]);
            if (nazivKomande.equals("Delete")){
                obrisiSvePoVrednosti(brojevi,prviBroj);
            }else if(nazivKomande.equals("Insert")){
                ubaciNaPoziciju(brojevi,prviBroj,Integer.parseInt(delovi[2]));
            }
        }
        ispisiListu(brojevi);
    }
}