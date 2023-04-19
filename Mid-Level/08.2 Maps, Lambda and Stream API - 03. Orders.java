import java.util.LinkedHashMap;
import java.util.Scanner;

public class Domaci03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,Double[]> proizvoidiKolicineCene = new LinkedHashMap<>();

        while(true){
            String unos = scan.nextLine();
            if (unos.equals("buy")) break;
            String[] deloviUnosa = unos.split(" ");
            String naziv = deloviUnosa[0];
            double kolicina = Double.parseDouble(deloviUnosa[2]);
            double cena = Double.parseDouble(deloviUnosa[1]);
//            proizvoidiKolicineCene.putIfAbsent(naziv,new Double[2]);
            if(!proizvoidiKolicineCene.containsKey(naziv)){
                proizvoidiKolicineCene.put(naziv,new Double[]{0.0,0.0});
            }

            double staraKolicina = proizvoidiKolicineCene.get(naziv)[1];
            proizvoidiKolicineCene.put(naziv, new Double[]{cena, staraKolicina + kolicina});



//            proizvoidiKolicineCene.entrySet()
//                    .stream()
//                    .forEach(e -> System.out.printf("%s -> %.2f %.0f\n",e.getKey(),e.getValue()[0],e.getValue()[1]));

//            proizvoidiKolicineCene.get(naziv)[0] = cena;
//            proizvoidiKolicineCene.get(naziv)[1] = kolicina;

        }
        proizvoidiKolicineCene.entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s -> %.2f \n",e.getKey(),e.getValue()[0]*e.getValue()[1]));

    }
}