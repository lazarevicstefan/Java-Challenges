import java.util.Scanner;

public class Vezba06 {
    public static int povrsina (int duzina,int sirina){
        int povrsina = duzina * sirina;
        return povrsina;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prvaStranica = Integer.parseInt(scan.nextLine());
        int drugaStranica = Integer.parseInt(scan.nextLine());
        int ppovrsinaPravougaonika = povrsina(prvaStranica,drugaStranica);
        System.out.println(ppovrsinaPravougaonika);
    }
}