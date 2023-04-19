import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            float num = scan.nextFloat();
            if (num <= 10){
                System.out.println("slow");
            }else if(num > 10 && num <=50){
                System.out.println("average");
            }else if(num > 50 && num <=150){
                System.out.println("fast");
            }else if(num > 150 && num <=1000){
                System.out.println("ultra fast");
            } else{
                System.out.println("extremely fast");
            }

    }


}