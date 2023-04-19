import java.util.Scanner;

public class Vezba10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i =1; i<=n;i++) {
            int trenutniBroj = i;
            int kopijaTrenutnog = trenutniBroj;
            int zbirCifara = 0;
            while (kopijaTrenutnog != 0) {
                int poslednjaCifra = kopijaTrenutnog % 10;
                kopijaTrenutnog = kopijaTrenutnog / 10;
                zbirCifara = zbirCifara + poslednjaCifra;
            }
            boolean specijal = zbirCifara == 5 || zbirCifara == 7 || zbirCifara == 11;
            if (specijal) {
                System.out.println(trenutniBroj + " -> True");
            } else System.out.println(trenutniBroj + " -> False");
        }
    }
}