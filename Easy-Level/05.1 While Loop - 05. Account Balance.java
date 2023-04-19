import java.util.Scanner;

public class JudgeLab_05_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double vrednostTransakcije;
        double parice=0;
        while(true){
            String transakcija=sc.nextLine();
            if(transakcija.equals("NoMoreMoney")){
                break;
            }
            vrednostTransakcije=Double.parseDouble(transakcija);
            if(vrednostTransakcije<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", vrednostTransakcije);
            parice=parice+vrednostTransakcije;
        }
        System.out.printf("Total: %.2f\n",parice);
    }
}