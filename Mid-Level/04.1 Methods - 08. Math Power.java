import java.text.DecimalFormat;
import java.util.Scanner;

public class Vezba08 {
    public static double stepenovanje (double a, int b){
        double c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
//        if (stepenovanje(a,b) % 1 == 0){
//            System.out.printf("%.0f",stepenovanje(a,b));
//        }else System.out.print(stepenovanje(a,b));
        System.out.println(new DecimalFormat("0.####").format(stepenovanje(a,b)));
    }
}