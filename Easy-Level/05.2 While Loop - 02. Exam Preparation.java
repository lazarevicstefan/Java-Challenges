import java.util.Scanner;

public class Exercise_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nezadovoljavajuceOcene = Integer.parseInt(sc.nextLine());
        int brojacLosihOcena = 0;
        double prosek, zbirOcena = 0, brojacOcena = 0;
        String nazivPoslednjegTaska="";
        while (true) {
            String nazivTaska = sc.nextLine();
            if (nazivTaska.equals("Enough")) {
                break;
            }

            nazivPoslednjegTaska = nazivTaska;
            int ocenaZaTask = Integer.parseInt(sc.nextLine());
            if (ocenaZaTask <= 4) {
                brojacLosihOcena++;
            }
            if (brojacLosihOcena == nezadovoljavajuceOcene) {
                break;
            }


            zbirOcena = zbirOcena + ocenaZaTask;
            brojacOcena++;
        }

            if(brojacLosihOcena==nezadovoljavajuceOcene){
                System.out.printf("You need a break, %d poor grades.", brojacLosihOcena);
            }else {
                prosek = zbirOcena / brojacOcena;
                System.out.printf("Average score: %.2f\n",prosek);
                System.out.printf("Number of problems: %.0f\n",brojacOcena);
                System.out.printf("Last problem: %s\n", nazivPoslednjegTaska);
            }

        }

    }