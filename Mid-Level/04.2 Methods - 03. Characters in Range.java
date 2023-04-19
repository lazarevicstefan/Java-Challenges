import java.util.Scanner;

public class Domaci03 {
    public static void ispisiKaraktere (char a, char b){
        char c;
        if(b<a){
            c=a;
            a=b;
            b=c;
        }
        for (int i = a+1; i < b; i++) {
            System.out.printf("%c ",i);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.nextLine().charAt(0);
        char b = scan.nextLine().charAt(0);
        ispisiKaraktere(a,b);
    }
}