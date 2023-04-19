import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Domaci03 {
    public static void ubaciAutoMapu (LinkedHashMap<String, ArrayList<Integer>> automobili , String unos){
        String[] delovi = unos.split("\\|");
        String modelVozila = delovi[0];
        int kilometraza = Integer.parseInt(delovi[1]);
        int gorivo = Integer.parseInt(delovi[2]);
        ArrayList<Integer> vrednosti  = new ArrayList<>();
        vrednosti.add(kilometraza);
        vrednosti.add(gorivo);
        automobili.put(modelVozila,vrednosti);
    }
    public static void ucitajNAutomobila (LinkedHashMap<String, ArrayList<Integer>> automobili , int n){
        Scanner scan = new Scanner(System.in);

    }
    public static void drive (LinkedHashMap<String,ArrayList<Integer>> automobili , String nazivVozila, int distanca, int gorivoPotrebnoZaVoznju){
        ArrayList<Integer> podaciVozila = automobili.get(nazivVozila);
        int kolicinaGoriva = podaciVozila.get(1);
        int kilometrazaTrenutna = podaciVozila.get(0);

        if (kolicinaGoriva >= gorivoPotrebnoZaVoznju){
            kilometrazaTrenutna = kilometrazaTrenutna + distanca;
            kolicinaGoriva = kolicinaGoriva - gorivoPotrebnoZaVoznju;
            ArrayList<Integer> novoStanje = new ArrayList<>();
            novoStanje.add(kilometrazaTrenutna);
            novoStanje.add(kolicinaGoriva);

            automobili.put(nazivVozila,novoStanje);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",nazivVozila,distanca,gorivoPotrebnoZaVoznju);
            if (kilometrazaTrenutna >= 100000){
                System.out.printf("Time to sell the %s!\n",nazivVozila);
                automobili.remove(nazivVozila);
            }
        }else {
            System.out.println("Not enough fuel to make that ride");
        }
    }
    public static void refuel (LinkedHashMap<String,ArrayList<Integer>> automobili , String nazivVozila, int kolicinaGoriva){
        ArrayList<Integer> podaciVozila = automobili.get(nazivVozila);
        int gorivoTrenutno = podaciVozila.get(1);

        if (gorivoTrenutno + kolicinaGoriva> 75){
            kolicinaGoriva = 75 - gorivoTrenutno;
        }
        gorivoTrenutno = gorivoTrenutno + kolicinaGoriva;
        podaciVozila.set(1,gorivoTrenutno);
        automobili.put(nazivVozila,podaciVozila);
        System.out.printf("%s refueled with %d liters\n",nazivVozila,kolicinaGoriva);
    }
    public static void revert (LinkedHashMap<String,ArrayList<Integer>> automobili , String nazivVozila, int brojKilometara){
        ArrayList<Integer> podaciVozila = automobili.get(nazivVozila);
        int trenutnoKilometara = podaciVozila.get(0);
        if (trenutnoKilometara - brojKilometara < 10000){
            trenutnoKilometara = 10000;

        }else {
            trenutnoKilometara = trenutnoKilometara - brojKilometara;
            System.out.printf("%s mileage decreased by %d kilometers\n",nazivVozila,brojKilometara);
        }
        podaciVozila.set(0,trenutnoKilometara);
        automobili.put(nazivVozila,podaciVozila);
    }
    public static void ispisiMapu (LinkedHashMap<String,ArrayList<Integer>> automobili){
        for (Map.Entry<String,ArrayList<Integer>> auto : automobili.entrySet()){
            String nazivVozila = auto.getKey();
            ArrayList<Integer> podaci = auto.getValue();
            int kilometraza = podaci.get(0);
            int gorivo = podaci.get(1);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",nazivVozila,kilometraza,gorivo);
        }
    }
    public static void main(String[] args) {

// 3
// Audi A6|38000|62
// Mercedes CLS|11000|35
// Volkswagen Passat CC|45678|5
// Drive : Audi A6 : 543 : 47
// Drive : Mercedes CLS : 94 : 11
// Drive : Volkswagen Passat CC : 69 : 8
// Refuel : Audi A6 : 50
// Revert : Mercedes CLS : 500
// Revert : Audi A6 : 30000
// Stop

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, ArrayList<Integer>> automobili = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String unos = scan.nextLine();
            ubaciAutoMapu(automobili,unos);
        }
//        ucitajNAutomobila(automobili,n);
        while (true){
            String tekst = scan.nextLine();
            if (tekst.equals("Stop")) break;
            String[] delovi = tekst.split(" : ");
            String nazivKomande = delovi[0];
            String nazivVozila = delovi[1];
            if (nazivKomande.equals("Drive")){
                int distanca = Integer.parseInt(delovi[2]);
                int kolicinaGoriva = Integer.parseInt(delovi[3]);
                drive(automobili,nazivVozila,distanca,kolicinaGoriva);
            }else if (nazivKomande.equals("Refuel")){
                int kolicinaGoriva = Integer.parseInt(delovi[2]);
                refuel(automobili,nazivVozila,kolicinaGoriva);
            }else if (nazivKomande.equals("Revert")){
                int kolicinaKilometara = Integer.parseInt(delovi[2]);
                revert(automobili,nazivVozila,kolicinaKilometara);
            }
        }
        ispisiMapu(automobili);
    }
}