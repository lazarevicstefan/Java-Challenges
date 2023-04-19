import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double chicken = 10.35;
        double fish = 12.40;
        double vegetarian = 8.15;
        double chickeninput = Double.parseDouble(scan.nextLine());
        double fishinput = Double.parseDouble(scan.nextLine());
        double vegetarianinput = Double.parseDouble(scan.nextLine());

        if(chickeninput >=0 && chickeninput <=99){
            if(fishinput >=0 && fishinput <=99){
                if (vegetarianinput >=0 && vegetarianinput <=99){
                    double chickensum = chickeninput * chicken;
                    double fishsum = fishinput * fish;
                    double vegetariansum = vegetarianinput * vegetarian;
                    double sum = chickensum + fishsum + vegetariansum;
                    double twentysum = sum * 0.2;
                    double total = sum + twentysum + 2.50;
                    System.out.printf("%.2f",total);
                }
            }
        }


    }
}