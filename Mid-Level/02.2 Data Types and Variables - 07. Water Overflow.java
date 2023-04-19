import java.util.Scanner;

public class Domaci07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        short max_kapacitet = 255;
        short trenutni_kapacitet = 0;
        for (int i = 0; i < n; i++) {
            short noviKapacitet = Short.parseShort(scan.nextLine());
            if (trenutni_kapacitet + noviKapacitet > max_kapacitet){
                System.out.println("Insufficient capacity!");
                continue;
            }
            trenutni_kapacitet = (short) (trenutni_kapacitet + noviKapacitet);
            }
        System.out.println(trenutni_kapacitet);
        }
    }