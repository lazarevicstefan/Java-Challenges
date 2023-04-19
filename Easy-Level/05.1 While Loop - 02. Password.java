import java.util.Scanner;

public class JudgeLab_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String confirmPassword;
        while (true) {
            confirmPassword = sc.nextLine();
            if (password.equals(confirmPassword)) {
                break;

            }

        }
        System.out.printf("Welcome %s!", username);
    }
}