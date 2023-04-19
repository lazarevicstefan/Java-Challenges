import java.util.Scanner;

public class main {

    public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
            double movieinput = Double.parseDouble(scan.nextLine());
            double numberinput = Double.parseDouble(scan.nextLine());
            double priceinput = Double.parseDouble(scan.nextLine());
            double sumdecor = movieinput * 0.1;
            double sumclothes = numberinput * priceinput;


            if(numberinput >= 150){
                double total1 = sumclothes * 0.1;
                sumclothes = sumclothes - total1;
                double totalsum = sumclothes + sumdecor;
            if (movieinput >= totalsum){
                total1 = sumdecor + sumclothes;
                Double xxx = movieinput - total1;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.",xxx);
            }else {
                total1 = sumdecor + sumclothes;
                double xxx = total1 - movieinput;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", xxx);
            }
            }else {

                double totalsum = sumclothes + sumdecor;
                if (movieinput >= totalsum){
                    sumclothes = sumdecor + sumclothes;
                    Double xxx = movieinput - sumclothes;
                    System.out.println("Action!");
                    System.out.printf("Wingard starts filming with %.2f USD left.",xxx);
                }else {
                    sumclothes = sumdecor + sumclothes;
                    double xxx = sumclothes - movieinput;
                    System.out.println("Not enough money!");
                    System.out.printf("Wingard needs %.2f USD more.", xxx);

            }}

            }


    }