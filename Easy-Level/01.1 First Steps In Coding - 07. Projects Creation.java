import java.util.Scanner;

public class main {

    public static void main(String[]args) {


        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int projects = scan.nextInt();
        int pro = projects * 3;
        if (projects > 0 && projects < 100) {
            System.out.println("The architect " + name + " will need " + pro + " hours to complete " + projects + " project/s.");
        }else {
            System.out.println("Greska broj projekata nije izmedju 0 i 100");

        }

    }
}
