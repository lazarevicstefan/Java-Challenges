import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kapacitetInput = Double.parseDouble(scan.nextLine());
        double ukupnoPrtljag = 0;
        int kolikoKofera = 0;
        while(true){
            if(ukupnoPrtljag <= kapacitetInput) {
                String prtljagInput = scan.nextLine();
                if (prtljagInput.equals("End")) {
                    System.out.println("Congratulations! All suitcases are loaded!");
                    System.out.println("Statistic: " + kolikoKofera + " suitcases loaded.");
                    break;
                }
                kolikoKofera++;
                Double input = Double.parseDouble(prtljagInput);
                if (ukupnoPrtljag <= kapacitetInput) {
                    if (kolikoKofera == 3) { //////////// proveriti da li je =
                        input = input * 1.1;
                    }
                    ukupnoPrtljag = ukupnoPrtljag + input;
                } else {
                    System.out.println("No more space!");
                    System.out.println("Statistic: " + kolikoKofera + " suitcases loaded.");
                    break;
                }
            }else {

                System.out.println("No more space!");
                System.out.println("Statistic: " + (kolikoKofera - 1) + " suitcases loaded.");
                break;
            }



        }
    }
}