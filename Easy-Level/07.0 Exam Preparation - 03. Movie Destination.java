import java.sql.BatchUpdateException;
import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

//        1.	Movie budget – a floating-point number in the range [100 000.0… 2 000 000.0]
//        2.	Destination – text, can be "Dubai", " Washington" and "London"
//        3.	Season – text, can be "Summer" or "Winter"
//        4.	Number of days – integer in the range[1… 40]
        double budzet = Double.parseDouble(scan.nextLine());
        String lokacija = scan.nextLine();
        String godisnjeDoba = scan.nextLine();
        int brojDana = Integer.parseInt(scan.nextLine());

        double cenaPoDanu = 0;
        if (lokacija.equals("Dubai")) {
            if(godisnjeDoba.equals("Winter")){
                cenaPoDanu = 45000;
            }else if(godisnjeDoba.equals("Summer")){
                cenaPoDanu = 40000;
            }
            cenaPoDanu = cenaPoDanu * 0.7;
        }else if (lokacija.equals("Sofia")){
            if(godisnjeDoba.equals("Winter")){
                cenaPoDanu = 17000;
            }else if(godisnjeDoba.equals("Summer")){
                cenaPoDanu = 12500;
            }
            cenaPoDanu = cenaPoDanu *1.25;
        }else if (lokacija.equals("London")){
            if(godisnjeDoba.equals("Winter")){
                cenaPoDanu = 24000;
            }else if(godisnjeDoba.equals("Summer")){
                cenaPoDanu = 20250;
            }
        }

        double ukupnaCena= cenaPoDanu * brojDana;
        double preostaliNovac = budzet - ukupnaCena;
        if(preostaliNovac >=0){

            System.out.printf("The budget for the movie is enough! We have %.2f USD left!",preostaliNovac);
        } else {
            preostaliNovac = -preostaliNovac;
            System.out.printf("The director needs %.2f USD more!", preostaliNovac);
        }




    }
}