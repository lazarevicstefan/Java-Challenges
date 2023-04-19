import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vezba06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String unos = scan.nextLine();
            lista.add(unos);
        }
        Collections.sort(lista);
        for (int i = 0; i< lista.size(); i++){
            System.out.printf("%d.%s\n",i+1,lista.get(i));
        }
    }
}