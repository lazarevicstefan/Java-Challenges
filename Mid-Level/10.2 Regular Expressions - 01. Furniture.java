import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domaci01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile(
                ">>(?<item>\\w+)<<(?<price>[0-9\\.]+)!(?<quantity>\\d+)");
//            "\\b>>(?<item>\\w+)<<(?<price>[0-9\\.]+)!\\d+\\b");
        ArrayList<String> kupljenNamestaj = new ArrayList<>();
        double total = 0.00;
        while (true){
            String unos = scan.nextLine();
            if (unos.equals("Purchase")) break;
            Matcher matcher = pattern.matcher(unos);
            if (matcher.find()){
                String nazivUredjaja = matcher.group("item");
                double cena = Double.parseDouble(matcher.group("price"));
                int kolicina = Integer.parseInt(matcher.group("quantity"));
                double totalCena = cena * kolicina;
                total +=totalCena;
                kupljenNamestaj.add(nazivUredjaja);
//                System.out.printf("%s: %.2f x %d = %.2f\n",nazivUredjaja,cena,kolicina,totalCena);
            }
        }

        System.out.println("Bought furniture:");
        for(String a : kupljenNamestaj){
            System.out.println(a);
        }
        System.out.printf("Total money spend: %.2f",total);
//        System.out.println(a.group());

    }
}