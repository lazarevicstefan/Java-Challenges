import java.util.Scanner;

public class Domaci09 {

    public static boolean daLiJePalindrom (String text){
        int n = text.length();
        String okrenutiText = "";
        for (int i = n-1; i >= 0; i--) {
            okrenutiText = okrenutiText + text.charAt(i);
        }
        return text.equals(okrenutiText);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String broj = scan.nextLine();
            if (broj.equals("END")) return;
            System.out.println(daLiJePalindrom(broj));

        }
    }
}