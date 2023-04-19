import java.util.Scanner;

public class Vezba03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        String[] stringUnos = unos.split(" ");
        int n = stringUnos.length;
        int[] intUnos = new int[n];
        int zbir = 0;
        for (int i = 0; i < n; i++) {
            intUnos[i] = Integer.parseInt(stringUnos[i]);
            if(intUnos[i] %2 ==0){
                zbir += intUnos[i];
            }
        }
        System.out.println(zbir);
    }
}