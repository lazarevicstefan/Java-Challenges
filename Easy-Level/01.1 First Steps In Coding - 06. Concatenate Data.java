import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        String firstname = scan.next();
        String lastname = scan.next();
        int age = scan.nextInt();
        String town = scan.next();


        System.out.println("You are " + firstname + " " + lastname +", a "+ age +"-years old person from " + town + ".");
                          
    }
}
