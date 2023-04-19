import java.util.Scanner;

public class Domaci08 {
    public static double faktorijalBrojaN (double n){
        double fin = 1;
        for (int i = 1; i <= n; i++) {
            fin = fin * i;
        }
        return fin;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        double c = faktorijalBrojaN(a) / faktorijalBrojaN(b);
        if(a == 0 || b == 0){
            System.out.printf("0");
            return;
        }
        System.out.printf("%.2f",c);
    }
}