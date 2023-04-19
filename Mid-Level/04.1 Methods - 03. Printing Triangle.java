import java.util.Scanner;

public class Vezba03 {
    public static void ispisPetlje(int pocetak,int kraj){
        if(pocetak > kraj){
            int pomocna = pocetak;
            pocetak = kraj;
            kraj = pomocna;
        }
        for (int i = pocetak; i <= kraj; i++) {
            System.out.printf("%d ",i);
        }
    }
    public static void ispisDoN (int n){
        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    public static void napraviSablon(int n){
        for (int i = 1; i <=n; i++) {
            ispisDoN(i);
        }
        for (int i = n-1; i >=1; i--) {
            ispisDoN(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = Integer.parseInt(scanner.nextLine());
        napraviSablon(broj);

    }
}