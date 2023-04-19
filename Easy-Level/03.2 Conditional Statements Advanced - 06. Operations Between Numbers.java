import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        double ukupno = 0.0;
        if (operator.equals("+")){
        ukupno = n1 + n2;
        String paran = "";
        if(ukupno % 2 == 0){
            paran = "even";
        }else paran = "odd";
        System.out.printf("%d + %d = %.0f - %s",n1,n2,ukupno, paran);
        return;
        }else if (operator.equals("-")){
            ukupno = n1 - n2;
            String paran = "";
            if(ukupno % 2 == 0){
                paran = "even";
            }else paran = "odd";
            System.out.printf("%d - %d = %.0f - %s",n1,n2,ukupno, paran);
            return;
        }else if(operator.equals("*")){
            ukupno = n1 * n2;
            String paran = "";
            if(ukupno % 2 == 0){
                paran = "even";
            }else paran = "odd";
            System.out.printf("%d * %d = %.0f - %s",n1,n2,ukupno, paran);
            return;
        }else if (operator.equals("/")){
            if (n1 == 0 || n2 == 0){
                int a = n1 + n2 ;
                System.out.println("Cannot divide "+a+" by zero");
            }else{
            ukupno = (double)n1 / n2;
            System.out.printf("%d / %d = %.2f",n1,n2,ukupno);
            return;
            }
        }else if (operator.equals("%")){
            if (n1 == 0 || n2 == 0){
            int a = n1 + n2 ;
            System.out.println("Cannot divide "+a+" by zero");}else{
            int total = n1 % n2;
            System.out.println(n1 +" % "+ n2+ " = "+ total);
            return;}
        }

    }
}