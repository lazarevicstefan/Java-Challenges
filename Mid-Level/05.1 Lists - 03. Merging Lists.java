import java.util.ArrayList;
import java.util.Scanner;

public class Vezba03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] unos1 = scan.nextLine().split(" ");
        String[] unos2 = scan.nextLine().split(" ");
        int n = unos1.length, ostatak;
        if (unos1.length > unos2.length) n = unos2.length;
        else n = unos1.length;
        ArrayList<String> niz = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        niz.add(unos1[i]);
        niz.add(unos2[i]);
        }
        if(unos1.length > unos2.length) {
            int a = unos1.length - unos2.length;
            for (int i = n; i < a+n; i++) {
                niz.add(unos1[i]);
            }
            }else if (unos1.length < unos2.length) {
                int a = unos2.length - unos1.length;
                for (int i = n; i < a+n; i++) {
                    niz.add(unos2[i]);
                }
            }
        for(String brojevi : niz){
            System.out.printf("%s ",brojevi);
        }

    }
}