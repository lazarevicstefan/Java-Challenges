import java.util.Scanner;

public class Vezba02 {
    public static void IspisiOcenu(double prosek){
        if(prosek <2){
            System.out.println("Lose unet broj");
        }else if(prosek <=2.99){
            System.out.println("Fail");
        }else if(prosek <=3.49){
            System.out.println("Poor");
        }else if(prosek <=4.49){
            System.out.println("Good");
        }else if(prosek <=5.49){
            System.out.println("Very good");
        }else if(prosek <=6){
            System.out.println("Excellent");
        }else System.out.println("Lose unet broj");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double unetBroj = Double.parseDouble(scan.nextLine());
        IspisiOcenu(unetBroj);
    }
}