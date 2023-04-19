import java.util.Scanner;

public class Zadatak05 {
    public static boolean daLiJeSlovo (char karakter){
        boolean malo = (karakter >= 'a' && karakter <= 'z');
        boolean veliko = (karakter >= 'A' && karakter <= 'Z');
        return malo || veliko ;
    }
    public static boolean daLiJeCifra (char karakter){
        return (karakter >= '0' && karakter <= '9');
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        int n = unos.length();
        StringBuilder sbCifre = new StringBuilder();
        StringBuilder sbSlova = new StringBuilder();
        StringBuilder sbOstalo = new StringBuilder();
        for (int i = 0; i <n; i++) {
            char trenutniKarakter = unos.charAt(i);
            if (daLiJeSlovo(trenutniKarakter)){
                sbSlova.append(trenutniKarakter);
            } else if (daLiJeCifra(trenutniKarakter)) {
                sbCifre.append(trenutniKarakter);
            }else sbOstalo.append(trenutniKarakter);
        }
        System.out.println(sbCifre);
        System.out.println(sbSlova);
        System.out.println(sbOstalo);
    }
}