import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double priceRoomForOnePersone = 18.00;
        double priceApartman = 25.00;
        double pricePresidentApartment = 35.00;
        int daysOfStay = Integer.parseInt(scan.nextLine()) - 1;
        String roomType = scan.nextLine();
        String ocenaPozitivnoILINegativno = scan.nextLine();
        double ocena = 0.0;
        double discount = 0.0;

            if (ocenaPozitivnoILINegativno.equals("positive")){
                ocena = 25;
            }else if (ocenaPozitivnoILINegativno.equals("negative")){
                ocena = -10;
            }

        if (daysOfStay <0){
            return;
        }else if (daysOfStay<10){////////////////////////////////////////////
        if(roomType.equals("apartment")){
            discount = 30;
            double total = daysOfStay * priceApartman * (100-discount)/100;
            double fintotal = total * (100+ocena) /100;
            System.out.printf("%.2f",fintotal);
            return;
        }else if(roomType.equals("president apartment")){
            discount = 10;
            double total = daysOfStay * pricePresidentApartment * (100-discount)/100;
            double fintotal = total * (100+ocena) /100;
            System.out.printf("%.2f",fintotal);
            return;
        }else if(roomType.equals("room for one person")){
            double fintotal = daysOfStay * priceRoomForOnePersone * (100+ocena)/100;
            System.out.printf("%.2f",fintotal);
            return;
        }/////////////////////////////////
        }else if (daysOfStay >= 10 && daysOfStay <= 15){   ///////////////////////////////////////////////
            if(roomType.equals("apartment")){
                discount = 35;
                double total = daysOfStay * priceApartman * (100-discount)/100;
                double fintotal = total * (100+ocena) /100;
                System.out.printf("%.2f",fintotal);
                return;
            }else if(roomType.equals("president apartment")){
                discount = 15;
                double total = daysOfStay * pricePresidentApartment * (100-discount)/100;
                double fintotal = total * (100+ocena) /100;
                System.out.printf("%.2f",fintotal);
                return;
            }else if(roomType.equals("room for one person")){
                double fintotal = daysOfStay * priceRoomForOnePersone * (100+ocena)/100;
                System.out.printf("%.2f",fintotal);
                return;
            }

        }else if (daysOfStay >15){
            if(roomType.equals("apartment")){
                discount = 50;
                double total = daysOfStay * priceApartman * (100-discount)/100;
                double fintotal = total * (100+ocena) /100;
                System.out.printf("%.2f",fintotal);
                return;
            }else if(roomType.equals("president apartment")){
                discount = 20;
                double total = daysOfStay * pricePresidentApartment * (100-discount)/100;
                double fintotal = total * (100+ocena) /100;
                System.out.printf("%.2f",fintotal);
                return;
            }else if(roomType.equals("room for one person")){
                double fintotal = daysOfStay * priceRoomForOnePersone * (100+ocena)/100;
                System.out.printf("%.2f",fintotal);
                return;
            }
        }



    }
}