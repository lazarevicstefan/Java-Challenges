import java.util.Scanner;

public class Vezba01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        short brojMetara = (short)Integer.parseInt(scan.nextLine());
        double brojKilometara = brojMetara / 1000.0;
        System.out.printf("%.2f",brojKilometara);
        }
}