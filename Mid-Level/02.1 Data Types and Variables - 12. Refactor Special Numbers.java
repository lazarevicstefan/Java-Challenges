import java.util.Scanner;
public class Vezba12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int zbir = 0;
        int kopijaI = 0;
        boolean isSpecialNumber = false;
        for (int i = 1; i <= n; i++) {
            kopijaI = i;
            while (i > 0) {
                zbir += i % 10;
                i = i / 10;
            }
            isSpecialNumber = (zbir == 5) || (zbir == 7) || (zbir == 11);
            if(isSpecialNumber == true)
            System.out.printf("%d -> True%n", kopijaI);
            else System.out.printf("%d -> False%n", kopijaI);
            zbir = 0;
            i = kopijaI;
        }

        }
}