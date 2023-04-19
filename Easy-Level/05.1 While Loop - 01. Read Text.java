import java.util.Scanner;

public class JudgeLab_05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String tekst = sc.nextLine();
            if (tekst.equals("Stop")) {
                break;
            }
            System.out.println(tekst);
        }
    }
}