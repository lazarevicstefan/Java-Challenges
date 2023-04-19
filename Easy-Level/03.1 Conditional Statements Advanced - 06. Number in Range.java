import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int numberInput = Integer.parseInt(scan.nextLine());
        if(numberInput >= -100 && numberInput <= 100 && numberInput != 0){
        System.out.println("Yes");
        }else System.out.println("No");
    }
}