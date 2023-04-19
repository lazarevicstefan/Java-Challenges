import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        int n = unos.length();
        for (int i = 0; i<n; i++){
            System.out.println(unos.charAt(i));
        }


    }
}