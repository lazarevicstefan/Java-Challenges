import java.util.Scanner;

public class Domaci06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char c= 'a';
        int ca = (int) c;
        int cb = ca +n;
        int i,j,k;
        for (i = ca; i < cb; i++) {
            for (j = ca; j < cb; j++) {
                for (k = ca; k < cb; k++) {
                    System.out.printf("%c",(char)i);
                    System.out.printf("%c",(char)j);
                    System.out.printf("%c\n",(char)k);
                }
            }
        }
    }
}