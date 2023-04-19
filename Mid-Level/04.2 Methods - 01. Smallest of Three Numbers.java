import java.util.Scanner;

public class Domaci01 {
    public static int najmanjiBroj (int a,int b, int c){
        int namanji = Integer.MAX_VALUE;
        if (a < b){
            namanji = a;
        }else if ( b < c){
            namanji = b;
        }else namanji = c;
        return namanji;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(najmanjiBroj(a,b,c));
    }
}