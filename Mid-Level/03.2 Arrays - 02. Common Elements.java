import java.util.Scanner;

public class Domaci02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] niz1 = scan.nextLine().split(" ");
        String[] niz2 = scan.nextLine().split(" ");
        int n = niz1.length;
        int n1 = niz2.length;
        for (int j = 0; j < n1; j++) {
        String trekstKojiTrazimo = "";
        trekstKojiTrazimo = trekstKojiTrazimo + niz2[j];
        boolean tekstsenalaziuNIzu = false;
        for (int i = 0; i < n; i++) {
            if (trekstKojiTrazimo.equals(niz1[i])){
                tekstsenalaziuNIzu = true;
                break;
            }
        }
        if(tekstsenalaziuNIzu){
            System.out.printf("%s ",trekstKojiTrazimo);
        }
        }
    }
}