import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double deposit = scan.nextDouble();
        double months = scan.nextDouble();
        double annual = scan.nextDouble();
        if(deposit >= 100.00 && deposit <= 10000.00 && months >=1 && months <=12 && annual >=0.00 && annual <=100.00)
        {
            double ann1 = annual / 100;
            double dep1 = deposit * ann1;
            double mon1 = dep1 / 12;
            double mon2 = months * mon1;
            double ex = deposit + mon2;
            System.out.println(ex);

        }
        else System.out.println("error");

    }
}