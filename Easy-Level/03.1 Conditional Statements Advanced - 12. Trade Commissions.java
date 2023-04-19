import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String cityInput = scan.nextLine();
        double valueInput = Double.parseDouble(scan.nextLine());


        //        City    0 ≤ s ≤ 500     500 < s ≤ 1 000      1 000 <; s ≤ 10 000     s >; 10 000
        //        London      5%                7%                    8%                     12%
        //        Paris      4.5%              7.5%                   10%                    13%
        //        Rome       5.5%               8%                    12%                   14.5%
        if (valueInput <0){
            System.out.println("error");
            return;
        }
        boolean isValidCity = cityInput.equals("London") || cityInput.equals("Paris") || cityInput.equals("Rome");
        if (!isValidCity){
            System.out.println("error");
            return;
        }
        double bonus = -1;
        if (cityInput.equals("London")) {
            if (valueInput <= 500) {
                bonus = 5;
            } else if (valueInput <= 1000) {
                bonus = 7;
            } else if (valueInput <= 10000) {
                bonus = 8;
            } else {
                bonus = 12;
            }
        }
            if (cityInput.equals("Paris")){
                if (valueInput <= 500){
                    bonus = 4.5;
                }else if (valueInput <= 1000){
                    bonus = 7.5;
                }else if(valueInput <=10000){
                    bonus = 10;
                }else {
                    bonus =13;
                }
            }
                if (cityInput.equals("Rome")) {
                    if (valueInput <= 500) {
                        bonus = 5.5;
                    } else if (valueInput <= 1000) {
                        bonus = 8;
                    } else if (valueInput <= 10000) {
                        bonus = 12;
                    } else {
                        bonus = 14.5;
                    }
                }

                double finalBonus = valueInput * bonus / 100;
                System.out.printf("%.2f",finalBonus);

        }
    }