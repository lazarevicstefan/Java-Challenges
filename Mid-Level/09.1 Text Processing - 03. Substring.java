import java.util.Scanner;

public class Zadatak03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String recKojuMenjam = scan.nextLine();
        String text = scan.nextLine();
        
        while (text.contains(recKojuMenjam)) {
            text = text.replaceAll(recKojuMenjam,"");
        }

        System.out.println(text);
    }
}