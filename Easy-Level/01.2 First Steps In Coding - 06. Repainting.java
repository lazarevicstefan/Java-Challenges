import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double nylon = 1.50;
        double paint = 14.50;
        double paintthinner = 5.00;
        double nyloninput = Double.parseDouble(scan.nextLine());
        double paintinput = Double.parseDouble(scan.nextLine());
        double paintthinnerinput = Double.parseDouble(scan.nextLine());
        double hoursinput = Double.parseDouble(scan.nextLine());

        if(nyloninput >=1 && nyloninput <=100){
            if(paintinput >=1 && paintinput <=100){
                if (paintthinnerinput >=1 && paintthinnerinput <=30){
                    if(hoursinput >= 1 && hoursinput <= 9){
                        double nylonsum = (nyloninput + 2) * nylon;
                        double paintsum = (paintinput * 1.1) * paint;
                        double paintthinnersum = paintthinnerinput * paintthinner;
                        double sum = nylonsum + paintsum + paintthinnersum + 0.4;
                        double sumwork = (sum * 0.3) * hoursinput;
                        double total = sum + sumwork;
                        System.out.println(total);
                    }
                }
            }
        }


    }
}
