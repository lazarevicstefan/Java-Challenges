import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            int first = Integer.parseInt(scan.nextLine());
            int secound = Integer.parseInt(scan.nextLine());
            int third = Integer.parseInt(scan.nextLine());
            int total = first + secound + third;
            int minutes = total / 60;
            int secounds = total % 60;
            if (secounds <10){
                System.out.printf("%d:0%d",minutes,secounds);
            }else{
                System.out.printf("%d:%d",minutes,secounds);
            }

    }


}