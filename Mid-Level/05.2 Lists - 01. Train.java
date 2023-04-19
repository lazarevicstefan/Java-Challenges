import java.util.ArrayList;
import java.util.Scanner;

public class Domaci01 {
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        ArrayList<Integer> vagoni = new ArrayList<>();
        unesiListu(vagoni,text);
//        ispisiListu(vagoni);
        int maksimalniKapacitetVagona = Integer.parseInt(scan.nextLine());
        while  (true){
            String komanda = scan.nextLine();
            if (komanda.equals("end")) break;
            String [] deloviKomande = komanda.split(" ");
            if(deloviKomande.length == 2){
                vagoni.add(Integer.parseInt(deloviKomande[1]));
            }else if (deloviKomande.length == 1){
                int dodatakPutnika = Integer.parseInt(deloviKomande[0]);
                for (int i = 0; i < vagoni.size(); i++) {
                    int trenutniBrojPutnikaVagona = vagoni.get(i);
                    if(trenutniBrojPutnikaVagona + dodatakPutnika <=maksimalniKapacitetVagona){
                        int noviBrojPutnika = trenutniBrojPutnikaVagona + dodatakPutnika;
                        vagoni.set(i,noviBrojPutnika);
                        break;
                    }
                }
            }
        }
        ispisiListu(vagoni);
    }
}