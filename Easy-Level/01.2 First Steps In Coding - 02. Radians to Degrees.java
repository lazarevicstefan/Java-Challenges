import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double inp = scan.nextDouble();
        double dee = inp * 180/ Math.PI;
        System.out.println(dee);

    }
}