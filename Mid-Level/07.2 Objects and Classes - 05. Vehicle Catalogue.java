import java.util.ArrayList;
import java.util.Scanner;

public class Domaci05 {
    static class Vehicle{
        private String type;
        private String model;
        private String color;
        private int horsePower;
        public Vehicle(String type,String model,String color, int horsePower){
            this.type = type;
            this.model = model;
            this.color  = color;
            this.horsePower = horsePower;
        }
        public Vehicle(String text){
            String[] delovi = text.split(" ");

            this.type = delovi[0];
            this.model = delovi[1];
            this.color  = delovi[2];
            this.horsePower = Integer.parseInt(delovi[3]);
        }
        public static void getModel (ArrayList<Vehicle> lista, String unos){
            for (Vehicle v : lista){
                if(v.model.equals(unos)){
                    System.out.println(v);
                }
            }
        }
        public void proveri(){
            if (this.type.equals("car")) this.type = "Car";
            else if(this.type.equals("truck")) this.type = "Truck";
        }

        public static double prosekCars (ArrayList<Vehicle> lista){
            int brojac = 0;
            double ukupno = 0.00;
            for (Vehicle v :lista){
                if (v.type.equals("Car")){
                    brojac++;
                    ukupno = ukupno + v.horsePower;
                }
            }
            ukupno = ukupno /brojac;
            if (brojac == 0) ukupno = 0.00;
            return ukupno;
        }
        public static double prosekTruck (ArrayList<Vehicle> lista){
            int brojac = 0;
            double ukupno = 0.00;
            for (Vehicle v :lista){
                if (v.type.equals("Truck")){
                    brojac++;
                    ukupno = ukupno + v.horsePower;
                }
            }
            ukupno = ukupno /brojac;
            if (brojac == 0) ukupno = 0.00;
            return ukupno;
        }

        @Override
        public String toString() {
//            if (this.type.equals("car")) this.type = "Car";
//            else if (this.type.equals("truck")) this.type = "Truck";

            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d"
                    ,this.type,this.model,this.color,this.horsePower);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> lista = new ArrayList<>();

        while (true){
        String text = scan.nextLine();
        String komanda = text.split(" ")[0];
        if (komanda.equals("End")) break;
        Vehicle trenutni = new Vehicle(text);
        trenutni.proveri();
        lista.add(trenutni);
//            System.out.println(trenutni);
        }
            while (true){
                String text = scan.nextLine();
                String komanda = text;
                if (komanda.equals("Close the Catalogue")) break;
                Vehicle.getModel(lista,komanda);
//                System.out.println(komanda);
            }
        // ispisi prosek i za truck i za car
       
        System.out.printf("Cars have average horsepower of: %.2f.\n",Vehicle.prosekCars(lista));
        System.out.printf("Trucks have average horsepower of: %.2f.\n",Vehicle.prosekTruck(lista));
    }
}