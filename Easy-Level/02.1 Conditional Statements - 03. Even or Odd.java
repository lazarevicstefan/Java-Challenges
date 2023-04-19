import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();


        if (num1 % 2 == 0){
            System.out.println("even");
        }else System.out.println("odd");
    }
}