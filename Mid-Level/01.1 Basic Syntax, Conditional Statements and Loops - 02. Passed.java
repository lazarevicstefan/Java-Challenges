import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vrednost = Double.parseDouble(scan.nextLine());
        if(vrednost >=3.00){
            System.out.println("Passed!");
        }
    }
}