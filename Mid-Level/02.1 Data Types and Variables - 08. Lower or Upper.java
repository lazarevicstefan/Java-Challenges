import java.util.Scanner;

public class Vezba08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char karakter = scan.next().charAt(0);
        if (Character.isLowerCase(karakter)){
            System.out.println("lower-case");
        }else System.out.println("upper-case");
    }
}