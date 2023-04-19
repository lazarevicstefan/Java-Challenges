import java.util.Scanner;

public class Domaci10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        int pocetniN = n;
        int brojac = 0;
        while(true){
            if (n * 2 == pocetniN && y!=0){
                    n = n / y;
            }
            if(n < m) {
                break;
            }
            n = n - m;
            brojac++;
        }
        System.out.println(n);
        System.out.println(brojac);
    }
}