import java.util.Arrays;
import java.util.Scanner;

public class Zadatak04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] reci = Arrays.stream(scan.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);
        for (String a : reci) System.out.println(a);
    }
}