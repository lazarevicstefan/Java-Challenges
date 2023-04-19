import java.util.Scanner;
import java.util.function.DoublePredicate;

public class DomaciproslaNedelja11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = (lostGameCount/2) * Double.parseDouble(scan.nextLine());
//        double headsetCount = (lostGameCount/2);
        double mousePrice = (lostGameCount/3) * Double.parseDouble(scan.nextLine());
//        double mouseCount = (lostGameCount/3);
        double keyboardPrice = (lostGameCount/6) * Double.parseDouble(scan.nextLine());
//        double keyboardCount = (lostGameCount/6);
        double displayPrice = (lostGameCount/12) * Double.parseDouble(scan.nextLine());
        double fin = headsetPrice +mousePrice + keyboardPrice + displayPrice;
        System.out.printf("Rage expenses: %.2f USD.",fin);
    }
}