import java.util.Scanner;

public class Domaci04 {
    public static boolean proveriDuzinuSifre(String sifra){
        int n = sifra.length();
        if(n >= 6 && n<=10) return true;
        else return false;
    }
    public static boolean proveriMaloSlovo(char karakter){
        return karakter >= 'a' && karakter <= 'z';
    }
    public static boolean proveriVelikoSlovo(char karakter){
        return karakter >= 'A' && karakter <= 'Z';
    }
    public static boolean proveriSlovo(char karakter){
        return proveriMaloSlovo(karakter) || proveriVelikoSlovo(karakter);
    }
    public static boolean proveriCifru(char karakter){
        return karakter >= '0' && karakter <= '9';
    }
    public static boolean daLiJeSlovoIliCifra (char karakter){
        return proveriSlovo(karakter) || proveriCifru(karakter);
    }
    public static boolean daLiSeSastojiSamoOdSlovaICifara(String sifra){
        int n = sifra.length();
        boolean ispravnaSifra = true;
        for (int i = 0; i < n; i++) {
            char trenutni = sifra.charAt(i);
            if (!daLiJeSlovoIliCifra(trenutni)){
                ispravnaSifra = false;
                break;
            }
        }
        return ispravnaSifra;
    }
    public static boolean daLiImaViseOd2Cifre (String sifra) {
        int n = sifra.length();
        int brojac = 0;
        for (int i = 0; i < n; i++) {
            char trenutni = sifra.charAt(i);
            if (proveriCifru(trenutni)) {
                brojac++;
            }
        }
        return brojac >= 2;
    }
    public static void daLijEIspavanPassword(String sifra){
        boolean ispravnaSifra = true;
        if(!proveriDuzinuSifre(sifra)){
            System.out.println("Password must be between 6 and 10 characters");
//            return false;
            ispravnaSifra = false;
        }
        if(!daLiSeSastojiSamoOdSlovaICifara(sifra)){
            System.out.println("Password must consist only of letters and digits");
//            return false;
            ispravnaSifra = false;
        }
        if(!daLiImaViseOd2Cifre(sifra)){
            System.out.println("Password must have at least 2 digits");
//            return false;
            ispravnaSifra = false;
        }if (ispravnaSifra) {
            System.out.println("Password is valid");

        }
//        return ispravnaSifra;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        daLijEIspavanPassword(unos);
    }
}