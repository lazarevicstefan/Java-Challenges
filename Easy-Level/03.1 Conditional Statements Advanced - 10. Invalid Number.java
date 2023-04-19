import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        boolean value = number >= 100 && number <=200|| number == 0;
        if (!value) {
            System.out.println("invalid");
        }


        }

    }