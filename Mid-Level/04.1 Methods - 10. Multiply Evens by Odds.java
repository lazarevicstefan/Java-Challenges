import java.util.Scanner;

public class Vezba10 {
    public static int parni (int n){
        String na = n + "";
        int a = na.length();
        int zbir = 0;
        for (int i = 0; i < a; i++) {
            int trenutni = Integer.parseInt(na.charAt(i)+"");
            if (trenutni % 2 == 0 ){
                zbir += trenutni;
            }
        }
        return zbir;
    }
    public static int neparni (int n){
        String na = n + "";
        int a = na.length();
        int zbir = 0;
        for (int i = 0; i < a; i++) {
            int trenutni = Integer.parseInt(na.charAt(i)+"");
            if (trenutni % 2 == 1 ){
                zbir += trenutni;
            }
        }
        return zbir;
    }
    public static int fin (int n){
        return parni(n) * neparni(n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(fin(broj));
    }
}