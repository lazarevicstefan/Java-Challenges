import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = Integer.parseInt(scan.nextLine());
            if (a %2 ==0){
                int b = Math.abs(a);
                System.out.printf("The number is: %d",b);

                break;
            }else System.out.println("Please write an even number.");
        }
    }
}