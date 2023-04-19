import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        name += scan.nextLine();
        scan.close();

        System.out.println("Hello, " + name + "!");
    }
}
