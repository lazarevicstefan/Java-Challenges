import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String productInput = scan.nextLine().toLowerCase();
        String cityInput = scan.nextLine().toLowerCase();
        double quantityInput = Double.parseDouble(scan.nextLine());
        double sumnum = 0;
        switch (cityInput){
            case "london":
                switch (productInput){
                    case "coffee":
                        sumnum = 0.50;
                        break;
                    case "water":
                        sumnum = 0.80;
                        break;
                    case "beer":
                        sumnum = 1.20;
                        break;
                    case "sweets":
                        sumnum = 1.45;
                        break;
                    case "peanuts":
                        sumnum = 1.60;
                        break;
                }
            break;
            case "rome":
                switch (productInput){
                    case "coffee":
                        sumnum = 0.40;
                        break;
                    case "water":
                        sumnum = 0.70;
                        break;
                    case "beer":
                        sumnum = 1.15;
                        break;
                    case "sweets":
                        sumnum = 1.30;
                        break;
                    case "peanuts":
                        sumnum = 1.50;
                        break;
                }
                break;
            case "paris":
                switch (productInput){
                    case "coffee":
                        sumnum = 0.45;
                        break;
                    case "water":
                        sumnum = 0.70;
                        break;
                    case "beer":
                        sumnum = 1.10;
                        break;
                    case "sweets":
                        sumnum = 1.35;
                        break;
                    case "peanuts":
                        sumnum = 1.55;
                        break;
                }
                break;
        }
        double total = sumnum * quantityInput;
        System.out.println(total);

        }

    }