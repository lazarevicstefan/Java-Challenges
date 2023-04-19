import java.util.Scanner;

public class Domaci07 {
    public static void patternNxN(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        patternNxN(broj);
    }
}