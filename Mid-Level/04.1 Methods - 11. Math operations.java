import java.text.DecimalFormat;
import java.util.Scanner;

public class Vezba11 {

    public static double sabiranjeIostalo (int a, char karakter, int b){
        double fin = 0.0;
        switch (karakter){
            case '+':
                fin = a+b;
                break;
            case '-':
                fin = a-b;
                break;
            case '*':
                fin = a*b;
                break;
            case '/':
                fin = a/b;
                break;
        }
        return fin;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        char karakter = scan.nextLine().charAt(0);
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.##").format(sabiranjeIostalo(a,karakter,b)));
    }
}