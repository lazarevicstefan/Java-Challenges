import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Domaci03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile(
                "%(?<nazivMusterije>[A-Z][a-z]+)%[^|$.%]*?<(?<proizvod>\\w+)>[^|$.%]*?\\|(?<kolicina>[0-9]+)\\|[^|$.%]*?(?<cena>[0-9\\.]+)\\$");

        double totalSuma = 0;
        while (true){
            String unos = scan.nextLine();
            if (unos.equals("end of shift")) break;

            Matcher matcher = pattern.matcher(unos);
            if (matcher.find()) {
                String nazivMusterije = matcher.group("nazivMusterije");
                String proizvod = matcher.group("proizvod");
                int kolicina = Integer.parseInt(matcher.group("kolicina"));
                double cena = Double.parseDouble(matcher.group("cena"));
                double punaCena = cena * kolicina;
                System.out.printf("%s: %s - %.2f\n", nazivMusterije, proizvod, punaCena);
                totalSuma += punaCena;
            }
        }

        System.out.printf("Total income: %.2f\n",totalSuma);

    }
}