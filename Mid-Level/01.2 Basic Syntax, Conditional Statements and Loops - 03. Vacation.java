import java.util.Scanner;

public class Zadatak03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int group_input = Integer.parseInt(scan.nextLine());
        String person_input = scan.nextLine();
        String day_input = scan.nextLine();
        double price= 0.00;
        if (person_input.equals("Students")){
            if (day_input.equals("Friday")){
                price = 8.45;
            }else if(day_input.equals("Saturday")){
                price = 9.80;
            } else if(day_input.equals("Sunday")) {
                price = 10.46;
            }
        }else if (person_input.equals("Business")){
            if (day_input.equals("Friday")){
                price = 10.90;
            }else if(day_input.equals("Saturday")){
                price = 15.60;
            } else if(day_input.equals("Sunday")) {
                price = 16;
            }
        }else if (person_input.equals("Regular")){
            if (day_input.equals("Friday")){
                price = 15;
            }else if(day_input.equals("Saturday")){
                price = 20;
            } else if(day_input.equals("Sunday")) {
                price = 22.50;
            }
        }
        double total_price = price * group_input;
        if (person_input.equals("Students")){
            if (group_input >=30){
                total_price = total_price * 0.85;
            }
        }else if(person_input.equals("Business")){
            if (group_input >=100){
                if(day_input.equals("Friday")){
                    total_price = total_price - 109;
                }else if (day_input.equals("Saturday")){
                    total_price = total_price - 156;
                }else if (day_input.equals("Sunday")){
                    total_price = total_price - 160;
                }
            }
        }else if(person_input.equals("Regular")){
            if (group_input >=10 && group_input <=20){
                total_price = total_price * 0.95;
            }
        }
        System.out.printf("Total price: %.2f",total_price);
    }
}