import java.util.Scanner;

public class Vezba07 {
    public static String visestrukiString (String text,int brojPonavljanja){
        String krajnjiString = "";
        for (int i = 0; i < brojPonavljanja; i++) {
            krajnjiString = krajnjiString + text;
        }
        return krajnjiString;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.print(visestrukiString(unos,n));
    }
}