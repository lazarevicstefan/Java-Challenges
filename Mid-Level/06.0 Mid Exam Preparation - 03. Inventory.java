import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vezba03 {
    public static void unesiListu(ArrayList<String> proizvodi , String text){
        String[] delovi = text.split(", ");
        proizvodi.addAll(Arrays.asList(delovi));
    }
    public static void ispisiListu(ArrayList<String> proizvodi){
        for(int i = 0; i< proizvodi.size();i++){
            String element = proizvodi.get(i);
            if (i !=proizvodi.size()-1) {
                System.out.printf("%s, ",element);
            }else {
                System.out.printf("%s", element);
            }        
        }
        System.out.println();
    }
    public static void collect (ArrayList<String> proizvodi, String vrednost){
        if (!proizvodi.contains(vrednost)){
            proizvodi.add(vrednost);
        }
    }
    public static void drop (ArrayList<String> proizvodi, String vrednost){
            if (proizvodi.contains(vrednost)){
                proizvodi.remove(vrednost);
            }

    }
    public static void combine (ArrayList<String> proizvodi, String vrednost){
        String[] deloviParametra = vrednost.split(":");
        String stariParametar = deloviParametra[0];
        String noviParametar = deloviParametra[1];
        if(proizvodi.contains(stariParametar)){
            int pozicijaNaKojojSeNalazi = proizvodi.indexOf(stariParametar);
            if (!proizvodi.contains(noviParametar)){
            proizvodi.add(pozicijaNaKojojSeNalazi + 1,noviParametar);
            }
        }
    }
    public static void renew (ArrayList<String> proizvodi, String vrednostZaRenew){
        if (proizvodi.contains(vrednostZaRenew)){
            proizvodi.remove(vrednostZaRenew);
            proizvodi.add(vrednostZaRenew);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> proizvodi = new ArrayList<>();
        String unos = scan.nextLine();
        unesiListu(proizvodi, unos);

        while (true){
            String text = scan.nextLine();
            if (text.equals("Craft!")) break;
            String[] deloviKomande = text.split(" - ");
            String nazivKomande = deloviKomande[0];
            String nazivItema = deloviKomande[1];
            switch (nazivKomande){
                case "Collect":
                    collect(proizvodi,nazivItema);
                    break;
                case "Drop":
                    drop(proizvodi,nazivItema);
                    break;
                case "Combine Items":
                    combine(proizvodi,nazivItema);
                    break;
                case "Renew":
                    renew(proizvodi,nazivItema);
                    break;
                default:
                    System.out.println("Pogresna komanda!!!!!!!!!!");
            }

//            ispisiListu(proizvodi);
        }
        ispisiListu(proizvodi);
    }
}