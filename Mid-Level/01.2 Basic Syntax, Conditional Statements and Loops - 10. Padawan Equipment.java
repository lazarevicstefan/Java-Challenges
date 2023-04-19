import java.util.Scanner;
public class DomaciproslaNedelja10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double banka = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double price_sabres = Double.parseDouble(scan.nextLine()) * Math.ceil(students * 1.1);
        double price_robes = Double.parseDouble(scan.nextLine()) * students;
        double price_belts = Double.parseDouble(scan.nextLine());
        int popust_belt = students / 6;
        price_belts = (double) price_belts * (students - popust_belt);
        double fin = price_sabres + price_robes + price_belts;
        if (fin > banka){
            System.out.printf("George Lucas will need %.2f USD more.", fin - banka);
        }else System.out.printf("The money is enough - it would cost %.2f USD.", fin);
    }
}