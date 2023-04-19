import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String nazivSerijeInput = scan.nextLine();
        int duzinaEpizodeInput = Integer.parseInt(scan.nextLine());
        int duzinaPauzeInput = Integer.parseInt(scan.nextLine());

            double vremeZaRucak = duzinaPauzeInput * 0.125;
            double vremePauze = duzinaPauzeInput * 0.25;
            double preostaloVreme = duzinaPauzeInput - vremeZaRucak - vremePauze;


        if (preostaloVreme >= duzinaEpizodeInput) {
            double freeTime = Math.ceil(preostaloVreme - duzinaEpizodeInput);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.\n",
                    nazivSerijeInput, Math.abs(freeTime));
        } else {
            double freeTime = Math.ceil(duzinaEpizodeInput - preostaloVreme);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.\n",
                    nazivSerijeInput, Math.abs(freeTime));
        }


        }
    }
