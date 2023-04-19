import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double pens = 5.80;
        double markers = 7.20;
        double detergent = 1.20;
        double pensinput = Double.parseDouble(scan.nextLine());
        double markersinput = Double.parseDouble(scan.nextLine());
        double detergentinput = Double.parseDouble(scan.nextLine());
        double percentinput = Double.parseDouble(scan.nextLine());

        if(pensinput >=0 && pensinput <=100){
            if(markersinput >=0 && markersinput <=100){
                if (detergentinput >=0 && detergentinput <=50){
                    if(percentinput >= 0 && percentinput <= 100){
                        double percent = percentinput/100;
                        double pens1 = pensinput * pens;
                        double markers1 = markersinput * markers;
                        double detergent1 = detergentinput * detergent;
                        double price = pens1 + markers1 + detergent1;
                        double price1 = price * percent;
                        double pricewithdiscount = price - price1;
                        System.out.println(pricewithdiscount);
                    }
                }
            }
        }


    }
}
