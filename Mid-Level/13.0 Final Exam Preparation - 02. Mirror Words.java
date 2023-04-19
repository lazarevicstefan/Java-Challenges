import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domaci02 {
    public static String okreniUnazad (String tekst){
        int n = tekst.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0 ; i--) {
            sb.append(tekst.charAt(i));
        }
        return sb.toString();
    }
    public static boolean daLiSuMirrorReci (String prva, String druga){
        String drugaUnazad  = okreniUnazad(druga);
        return prva.equals(drugaUnazad);
    }
    public static void main(String[] args) {

// @mix#tix3dj#poOl##loOp#wl@@bong&song%4very$long@thong#Part##traP##@@leveL@@Level@##car#rac##tu@pack@@ckap@#rr#sAw##wAs#r#@w1r

// #po0l##l0op# @bAc##cAB@ @LM@ML@ #xxxXxx##xxxXxx# @aba@@ababa@

        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        Pattern pattern = Pattern.compile("([@#])(?<prviDeo>[A-Za-z]{3,})\\1\\1(?<drugiDeo>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(unos);
        LinkedHashMap<String,String> paroviReci = new LinkedHashMap<>();
        while (matcher.find()){
            String rez = matcher.group();
            String prviDeo = matcher.group("prviDeo");
            String drugiDeo = matcher.group("drugiDeo");
//            System.out.println(prviDeo + " " + drugiDeo);
            paroviReci.put(prviDeo,drugiDeo);
        }
        if (paroviReci.entrySet().size() == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!\n",paroviReci.entrySet().size());
        }
        LinkedHashMap<String,String> mirrorParovi = new LinkedHashMap<>();
        for (Map.Entry<String,String> a : paroviReci.entrySet()){
            String prvi = a.getKey();
            String drugi = a.getValue();
            if (daLiSuMirrorReci(prvi,drugi)){
                mirrorParovi.put(prvi,drugi);
            }
        }
        if (mirrorParovi.entrySet().size() == 0){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String,String> b : mirrorParovi.entrySet() ) {
                String aa = b.getKey();
                String bb = b.getValue();
                sb.append(String.format("%s <=> %s, ",aa,bb));
            }
            String resenje = sb.toString();
            resenje = resenje.substring(0, sb.length() - 2);
            System.out.println(resenje);
        }
    }
}