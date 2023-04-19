import java.util.Scanner;

public class Vezba01 {
    public static void ispis(int broj){
        if(broj >0){
            System.out.printf("The number %d is positive.",broj);
        }else if(broj <0){
            System.out.printf("The number %d is negative.",broj);
        }else System.out.printf("The number %d is zero.",broj);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nekiBroj = Integer.parseInt(scan.nextLine());
        ispis(nekiBroj);
    }
}