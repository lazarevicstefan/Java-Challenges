import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num < 100){
                System.out.println("Less than 100");
            }else if(num >= 100 && num <=200){
                System.out.println("Between 100 and 200");
            }else{
                System.out.println("Greater than 200");
            }

    }


}