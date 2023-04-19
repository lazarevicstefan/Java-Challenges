import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double sneakers = 0.60;
        double outfit =  0.80;
        double ball = 0.25;
        double accessories = 0.20;
        double basketballinput = Double.parseDouble(scan.nextLine());

        if(basketballinput >=0 && basketballinput <=9999){
            double sneakerssum = basketballinput * sneakers;
            double outfitsum = sneakerssum * outfit;
            double ballsum = outfitsum * ball;
            double accessoriessum = ballsum * accessories;
            double total = basketballinput + sneakerssum + outfitsum + ballsum + accessoriessum;

            System.out.println(total);

        }
    }
}