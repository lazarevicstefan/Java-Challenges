import java.util.Scanner;
import java.lang.Math;
public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            String figure = scan.nextLine();
            if(figure.equals("square")){
                float square = scan.nextFloat();
                float fin1 = square * square;
                System.out.printf("%.3f", fin1);
            }else if (figure.equals("rectangle")){
                float rec1 = scan.nextFloat();
                float rec2 = scan.nextFloat();
                float fin2 = rec1 * rec2;
                System.out.printf("%.3f", fin2);

            }else if (figure.equals("circle")){
                float circle = scan.nextFloat();
                float fin3 = (float) (Math.PI * (circle * circle));
                System.out.printf("%.3f", fin3);

            }else if (figure.equals("triangle")){
                float tri1 = scan.nextFloat();
                float tri2 = scan.nextFloat();
                float fin4 = (tri1*tri2)/2;
                System.out.printf("%.3f", fin4);
            }


    }


}