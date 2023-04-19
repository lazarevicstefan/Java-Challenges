import java.util.Scanner;

public class Vezba04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String[] podvojenText = text.split(" ");
        int n = podvojenText.length;
        String[] saKrajaText = new String[n];
        for (int i = 0; i < n; i++) {
        String elemenSaPocetka = podvojenText[i];
        saKrajaText[n-1-i] = elemenSaPocetka;
        }
        String fin = String.join(" ",saKrajaText);
        System.out.println(fin);
    }
}