import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);


            double tripinput = Double.parseDouble(scan.nextLine());
            int puzzleinput = Integer.parseInt(scan.nextLine());
            int dollinput = Integer.parseInt(scan.nextLine());
            int bearinput = Integer.parseInt(scan.nextLine());
            int minioninput = Integer.parseInt(scan.nextLine());
            int truckinput = Integer.parseInt(scan.nextLine());
            double puzzle = puzzleinput * 2.60;
            double doll = dollinput * 3;
            double bear = bearinput * 4.10;
            double minion = minioninput * 8.20;
            double truck = truckinput * 2;
            int sumproducts = puzzleinput + dollinput + bearinput + minioninput + truckinput;
            double sumprice = puzzle + doll + bear + minion + truck;

            if (sumproducts >= 50){
                double sumdisc = sumprice * 0.25;
                sumprice = sumprice - sumdisc;
                double rent = sumprice * 0.1;
                sumprice = sumprice - rent;
                if(sumprice >= tripinput){
                    double xxx = sumprice - tripinput;
                    System.out.printf("Yes! %.2f USD left.",xxx);
                }else {
                    double xxx = tripinput - sumprice;
                    System.out.printf("Not enough money! %.2f USD needed.",xxx);
                }
            }else {
                double rent = sumprice * 0.1;
                sumprice = sumprice - rent;
                if (sumprice >= tripinput) {
                    double xxx = sumprice - tripinput;
                    System.out.printf("Yes! %.2f USD left.", xxx);
                } else {
                    double xxx = tripinput - sumprice;
                    System.out.printf("Not enough money! %.2f USD needed.", xxx);
                }
            }

            }


    }