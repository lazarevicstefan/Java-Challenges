import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        double ainput = Double.parseDouble(scan.nextLine());
        double binput = Double.parseDouble(scan.nextLine());
        double cinput = Double.parseDouble(scan.nextLine());
        double percentinput = Double.parseDouble(scan.nextLine());

        if(ainput >=10 && ainput <=500){
            if(binput >=10 && binput <=300){
              if(cinput >=10 && binput <=200){
                if(percentinput >=0.000 && percentinput <=100.000){
                 double vol = ainput * binput * cinput;
                 double liters = vol * 0.001;
                 double space = percentinput /100;
                 double total = liters * (1-space);
                 System.out.println(total);

                }
              }
            }
        }
    }
}