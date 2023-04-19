import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Domaci02 {
    public static void IspisiMapu (LinkedHashMap<String,Integer> mapa){
        for (Map.Entry<String,Integer> a: mapa.entrySet()) {
            String ime = a.getKey();
            Integer vrednost = a.getValue();
            System.out.printf("%s => %d\n",ime,vrednost);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        String[] delovi = unos.split(", ");
        ArrayList<String> listaTakmicara = new ArrayList<>(Arrays.asList(unos.split(", ")));
        LinkedHashMap<String,Integer> rezultati = new LinkedHashMap<>();
        for(String a: listaTakmicara) rezultati.put(a,0);

//        for (Map.Entry<String,Integer> a : rezultati.entrySet()) System.out.println(a);
        Pattern patternSlova = Pattern.compile("[a-zA-Z]");
        Pattern patternCifre = Pattern.compile("[0-9]");
        while (true){
            String red = scan.nextLine();
            StringBuilder sbZaIme = new StringBuilder();

            int zbir = 0;
            if (red.equals("end of race")) break;
//            for (int i = 0; i < red.length(); i++) {
//                char karakter = red.charAt(i);
//                if (Character.isLetter(karakter)){
//                    String t = String.valueOf(karakter);
//                    ime = ime + t;
//                }else if (Character.isDigit(karakter)){
//                    int a = Integer.parseInt(String.valueOf(karakter));
//                    zbir +=a;
//                }
//            }
                Matcher matcherSlova = patternSlova.matcher(red);
                while (matcherSlova.find()){
                    String trenutnoPoklapanje = matcherSlova.group();
                    sbZaIme.append(trenutnoPoklapanje);
                }
//            System.out.println(sbZaIme);
            Matcher matcherBrojevi= patternCifre.matcher(red);
            while (matcherBrojevi.find()){
                String trenutnoPoklapanjeCifre = matcherBrojevi.group();
                zbir = zbir + Integer.parseInt(trenutnoPoklapanjeCifre);
            }
//            System.out.println(zbir);
            if (rezultati.containsKey(sbZaIme.toString())){
                int trenutnaVrednost = rezultati.get(sbZaIme.toString());
                rezultati.put(sbZaIme.toString(),trenutnaVrednost+zbir);
            }


//            System.out.println(ime);
//            System.out.println(zbir);
//            if (rezultati.containsKey(ime)){
//                int trenutniZbir = rezultati.get(ime);
//                rezultati.put(ime,trenutniZbir + zbir);
//            }
        }


//            IspisiMapu(rezultati);
            List<String> sortiraniTakmicari = rezultati
                    .entrySet()
                    .stream()
                    .sorted((a,b) -> Integer.compare(b.getValue(),a.getValue()))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

        for (int i = 1; i <= 3; i++) {
            if (i == 1)System.out.printf("%dst place: %s\n",i,sortiraniTakmicari.get(i-1));
            else if (i == 2) System.out.printf("%dnd place: %s\n",i,sortiraniTakmicari.get(i-1));
            else  System.out.printf("%drd place: %s\n",i,sortiraniTakmicari.get(i-1));
        }



    }
}