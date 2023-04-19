import java.util.Scanner;

public class Vezba06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unosA = scan.nextLine();
        String unosB = scan.nextLine();
        String[] unosAstring = unosA.split(" ");
        String[] unosBstring = unosB.split(" ");
        int[] unosAint = new int[unosAstring.length];
        int[] unosBint = new int[unosBstring.length];
        int sum = 0;
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < unosAstring.length; i++) {
            unosAint[i] = Integer.parseInt(unosAstring[i]);
            sumA += unosAint[i];
        }
        for (int i = 0; i < unosBstring.length; i++) {
            unosBint[i] = Integer.parseInt(unosBstring[i]);
            sumB += unosBint[i];
        }

            for (int i = 0; i < unosAstring.length; i++) {
                if (unosAint[i] != unosBint[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    return;
                }
            }
        System.out.printf("Arrays are identical. Sum: %d",sumA);
    }
}