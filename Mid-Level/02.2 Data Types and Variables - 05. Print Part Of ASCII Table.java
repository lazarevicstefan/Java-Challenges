import java.util.Scanner;

public class Domaci05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int o = a;
        for (int i = a; i <= b; i++) {
            System.out.printf("%c ",(char) i);
        }
    }
}