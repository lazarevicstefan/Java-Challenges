import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            int hour = Integer.parseInt(scan.nextLine());
            int min = Integer.parseInt(scan.nextLine());
            int min2 = min + 15;

            if(min2 >= 60){
                min2 = min2 - 60;
                hour = hour + 1;
            }
            if (hour >= 24){
                hour = 0;
            }
            if (min2 <10){
            System.out.printf("%d:0%d",hour,min2);
             }else{
            System.out.printf("%d:%d",hour,min2);
             }
    }
}