import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int ukupanBroj = 0;
        for (int i = 0; i<nBroj; i++){
            int broj = Integer.parseInt(scan.nextLine());
            ukupanBroj += broj;
        }
        System.out.println(ukupanBroj);
    }
}