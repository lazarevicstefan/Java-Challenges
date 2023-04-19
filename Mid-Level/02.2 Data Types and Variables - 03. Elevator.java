import java.util.Scanner;

public class Domaci03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int osoba = Integer.parseInt(scan.nextLine());
        int poTuri = Integer.parseInt(scan.nextLine());
        int deljenje = osoba / poTuri;
        if (osoba % poTuri == 0){
            System.out.println(deljenje);
        }else System.out.println(deljenje+1);
    }
}