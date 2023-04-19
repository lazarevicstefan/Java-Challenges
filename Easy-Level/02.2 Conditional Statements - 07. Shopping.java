import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double peterbudgetinput = Double.parseDouble(scan.nextLine());
        int numvideocardsinput = Integer.parseInt(scan.nextLine());
        int numCPUinput = Integer.parseInt(scan.nextLine());
        int numRAMinput = Integer.parseInt(scan.nextLine());
        double sumnvideocards = numvideocardsinput * 250;
        double sumCPU = numCPUinput *(sumnvideocards * 0.35);
        double sumRAM = numRAMinput *(sumnvideocards * 0.1);
        double sumTotal = sumnvideocards + sumCPU + sumRAM;
        if (numvideocardsinput > numCPUinput){
            double sum = sumTotal - (sumTotal * 0.15);
            if (sum > peterbudgetinput){
            System.out.printf("Not enough money! You need %.2f USD more!", sum-peterbudgetinput);
            }else System.out.printf("You have %.2f USD left!",peterbudgetinput-sum);
        }else {
            if (sumTotal > peterbudgetinput){
                System.out.printf("Not enough money! You need %.2f USD more!", sumTotal-peterbudgetinput);
            }else System.out.printf("You have %.2f USD left!",peterbudgetinput-sumTotal);


        }
    }
}