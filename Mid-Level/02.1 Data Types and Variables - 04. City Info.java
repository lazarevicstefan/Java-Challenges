import java.util.Scanner;

public class Vezba04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int km = Integer.parseInt(scan.nextLine());
        System.out.printf("City of %s has population of %d and area %d square km.", city,population,km);

    }
}