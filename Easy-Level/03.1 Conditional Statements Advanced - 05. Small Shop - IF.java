import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String productInput = scan.nextLine().toLowerCase();
        String cityInput = scan.nextLine().toLowerCase();
        double quantityInput = Double.parseDouble(scan.nextLine());
        double sumnum = 0;
        if (productInput.equals("coffee")){
            if(cityInput.equals("london")){
                sumnum =  0.50;
            }else if(cityInput.equals("rome")){
                sumnum =  0.40;
            }else if(cityInput.equals("paris")){
                sumnum =  0.45;
            }
        }else if(productInput.equals("water")){
            if(cityInput.equals("london")){
                sumnum = 0.80;
            }else if(cityInput.equals("rome")){
                sumnum = 0.70;
            }else if(cityInput.equals("paris")){
                sumnum = 0.70;
            }
        }else if(productInput.equals("beer")){
            if(cityInput.equals("london")){
                sumnum = 1.20;
            }else if(cityInput.equals("rome")){
                sumnum = 1.15;
            }else if(cityInput.equals("paris")){
                sumnum = 1.10;
            }
        }else if(productInput.equals("sweets")){
            if(cityInput.equals("london")){
                sumnum = 1.45;
            }else if(cityInput.equals("rome")){
                sumnum = 1.30;
            }else if(cityInput.equals("paris")){
                sumnum = 1.35;
            }
        }else if(productInput.equals("peanuts")){
            if(cityInput.equals("london")){
                sumnum = 1.60;
            }else if(cityInput.equals("rome")){
                sumnum = 1.50;
            }else if(cityInput.equals("paris")){
                sumnum = 1.55;
            }
        }
        double totalPrice = sumnum * quantityInput;
        System.out.println(totalPrice);




        }

    }