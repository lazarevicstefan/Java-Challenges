import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double budzetinput = Double.parseDouble(scan.nextLine());
        String sezonaInput = scan.nextLine();
        String hotelIliKamp = "";
        double procenatBudzeta = 0.0;
        String destinacija = "";
        if (budzetinput <= 100){
            if(sezonaInput.equals("summer")){
                procenatBudzeta = 30;
                hotelIliKamp = "Camp";
                destinacija = "Bulgaria";
            }else if (sezonaInput.equals("winter")){
                procenatBudzeta = 70;
                hotelIliKamp = "Hotel";
                destinacija = "Bulgaria";
            }
        }else if (budzetinput <=1000){
            if(sezonaInput.equals("summer")){
                procenatBudzeta = 40;
                hotelIliKamp = "Camp";
                destinacija = "Balkans";
            }else if(sezonaInput.equals("winter")){
                procenatBudzeta = 80;
                hotelIliKamp = "Hotel";
                destinacija = "Balkans";
            }
        }else if (budzetinput >1000){
            procenatBudzeta = 90;
            hotelIliKamp = "Hotel";
            destinacija = "Europe";
        }
        double ukupno = budzetinput * procenatBudzeta /100;
        System.out.println("Somewhere in "+destinacija);
        System.out.printf("%s - %.2f",hotelIliKamp,ukupno );



    }
}