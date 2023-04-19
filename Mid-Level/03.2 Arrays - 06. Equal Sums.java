import java.util.Scanner;

public class Domaci06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stringNIZ = scan.nextLine().split(" ");
        int n = stringNIZ.length;
        int [] niz = new int[n];
        int sredina = 0;
        int leviZbir = 0;
        int desniZbir = 0;
        for (int i = 0; i < n; i++) {
            niz[i] = Integer.parseInt(stringNIZ[i]);
        }
        if(niz.length ==1) {
            System.out.println("0");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sredina; j++) {
                leviZbir = leviZbir + niz[j];
            }
            for (int k = sredina+1; k < n; k++) {
                desniZbir = desniZbir + niz[k];
            }

            if(leviZbir == desniZbir){
                System.out.println(i);
                return;
            }
            sredina++;
            leviZbir = 0;
            desniZbir = 0;
        }
        System.out.println("no");
    }
}