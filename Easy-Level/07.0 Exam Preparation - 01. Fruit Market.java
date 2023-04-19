import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double strawbery_price = Double.parseDouble(scan.nextLine());
        double numOFkg_bananas = Double.parseDouble(scan.nextLine());
        double numOFkg_oranges = Double.parseDouble(scan.nextLine());
        double numOFkg_raspberries = Double.parseDouble(scan.nextLine());
        double numOFkg_strawberry = Double.parseDouble(scan.nextLine());

        double rassberies_price = strawbery_price * 0.5;
        double orange_price = rassberies_price * (1-0.4);
        double banana_price = rassberies_price * (1-0.8);

        double total_strowberys = strawbery_price * numOFkg_strawberry;
        double total_bananas = banana_price * numOFkg_bananas;
        double total_oranges = orange_price * numOFkg_oranges;
        double total_raspberies = rassberies_price * numOFkg_raspberries;

        double total = total_bananas + total_oranges + total_raspberies + total_strowberys;
        System.out.printf("%.2f",total);




    }
}