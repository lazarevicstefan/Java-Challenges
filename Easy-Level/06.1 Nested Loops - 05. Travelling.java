import java.util.Scanner;

public class JudgeLab_06_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String zemlja = sc.nextLine();
            if (zemlja.equals("End")) {
                break;
            }
            double cena = Double.parseDouble(sc.nextLine());

            double sacuvano = 0;
            while (true) {
                double trenutniIznos = Double.parseDouble(sc.nextLine());
                sacuvano = sacuvano + trenutniIznos;
                if (sacuvano >= cena) {
                    System.out.printf("Going to %s!\n", zemlja);
                    break;
                }
            }
        }
    }
}