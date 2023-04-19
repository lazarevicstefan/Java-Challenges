import java.util.Scanner;

public class Zadatak07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ukupno_novac = 0;
        while (true){
         String uneta_novcanica_string = scan.nextLine();
         if (uneta_novcanica_string.equals("Start")){
             double Nuts = 2.0;
             double Water = 0.7;
             double Crisps = 1.5;
             double Soda = 0.8;
             double Coke = 1.0;
             while (true){
                 String nekoPice = scan.nextLine();

                 switch (nekoPice){
                     case "Nuts":
                         if(ukupno_novac < Nuts){
                             System.out.println("Sorry, not enough money");
                             break;
                         }else{
                         System.out.println("Purchased Nuts");
                         ukupno_novac = ukupno_novac - Nuts;
                         break;
                         }
                     case "Water":
                         if(ukupno_novac < Water){
                             System.out.println("Sorry, not enough money");
                             break;
                         }else{
                         System.out.println("Purchased Water");
                         ukupno_novac = ukupno_novac - Water;
                         break;
                         }
                     case "Crisps":
                         if(ukupno_novac < Crisps){
                             System.out.println("Sorry, not enough money");
                             break;
                         }else{
                         System.out.println("Purchased Crisps");
                         ukupno_novac = ukupno_novac - Crisps;
                         break;
                         }
                     case "Soda":
                         if(ukupno_novac < Soda){
                             System.out.println("Sorry, not enough money");
                             break;
                         }else{
                         System.out.println("Purchased Soda");
                         ukupno_novac = ukupno_novac - Soda;
                         break;
                         }
                     case "Coke":
                         if(ukupno_novac < Coke){
                             System.out.println("Sorry, not enough money");
                            break;
                         }else{
                         System.out.println("Purchased Coke");
                         ukupno_novac = ukupno_novac - Coke;
                         break;
                         }
                     case "End":
                         System.out.printf("Change: %.2f",ukupno_novac);
                         return;
                     default:
                         System.out.println("Invalid product");
                         break;
                 }
             }
         }
            double uneta_novcanica = Double.parseDouble(uneta_novcanica_string);
         if(uneta_novcanica == 0.1 || uneta_novcanica == 0.2 || uneta_novcanica == 0.5 || uneta_novcanica == 1 || uneta_novcanica == 2){
            ukupno_novac = ukupno_novac + uneta_novcanica;
         }else System.out.printf("Cannot accept %.2f\n", uneta_novcanica);
        }
    }
}