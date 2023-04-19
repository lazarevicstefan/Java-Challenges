import java.util.Scanner;

public class Domaci06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();

//        /**      PRVI PRIMER      */
//        for (int i = 0; i < unos.length(); i++) {
//            String trenutniKarakter = unos.charAt(i) + "";
//            String dupliKarakter = String.format("%s%s",trenutniKarakter,trenutniKarakter);
//            while (unos.contains(dupliKarakter)){
//                unos = unos.replace(dupliKarakter,trenutniKarakter);
//            }
//        }
//        System.out.println(unos);
//
//        /**      DRUGI PRIMER      */
//        String trenutni, prethodni  = "";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < unos.length(); i++) {
//            trenutni = unos.charAt(i) + "";
//            if (!trenutni.equals(prethodni)){
//                sb.append(trenutni);
//            }
//            prethodni = trenutni;
//        }
//        System.out.println(sb);

        /**      TRECI PRIMER      */
        StringBuilder aaa = new StringBuilder();
        for (int i = 0; i < unos.length()-1; i++) {
            String tren = unos.charAt(i) + "";
            String sledeci = unos.charAt(i+1) + "";
            if (!tren.equals(sledeci)){
                aaa.append(tren);
            }
            if (i == unos.length()-2) aaa.append(sledeci);
        }
        System.out.println(aaa);

    }
}