import java.util.Scanner;

public class main {

    public static void main(String[]args) {


        Scanner scan = new Scanner(System.in);


        double dog = scan.nextInt();
        double cat = scan.nextInt();

        double doga = dog * 2.5;
        double cata = cat * 4;
        double sum = doga + cata;
        if (dog >= 0 && dog < 100 && cat >= 0 && cat < 100) {

            System.out.println(""+sum+" USD.");
        }else {
            System.out.println("Greska broj projekata nije izmedju 0 i 100");

        }

    }
}