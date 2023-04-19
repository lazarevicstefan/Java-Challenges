import java.util.ArrayList;
import java.util.Scanner;

public class Domaci07dusan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        String[] delovi =  tekst.split("\\|");

        ArrayList<String> listaNizovaStringa = new ArrayList<>();
        for (String a: delovi){
            listaNizovaStringa.add(a);
        }
        ArrayList<String> rezultat = new ArrayList<>();
        for(int i = listaNizovaStringa.size()-1 ; i>=0 ; i-- ){
            String niz = listaNizovaStringa.get(i);
//            System.out.println(niz+ " ");
            String[] deloviNiza = niz.split(" ");
            for(String b: deloviNiza){
                if (!b.equals("")) {
                    rezultat.add(b);
                }
            }
        }
        for(String broj : rezultat){
            System.out.print(broj + " ");
        }
    }
}