import java.util.Scanner;

public class Domaci05 {
    public static int sabiranje (int a,int b){
        return a+b;
    }
    public static int fin (int a, int b , int c){
        return sabiranje(a,b) - c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int fin = fin(a,b,c);
        System.out.println(fin);

    }
}