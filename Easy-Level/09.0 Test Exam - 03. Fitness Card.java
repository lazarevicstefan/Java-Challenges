import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budzetInput = Double.parseDouble(scan.nextLine());
        String polInput = scan.nextLine();
        int godineInput = Integer.parseInt(scan.nextLine());
        String sportInput = scan.nextLine();

        double cena = 0;
        double popust = 1;

        if (godineInput <=19){
            popust = 0.80;
        }

        if (sportInput.equals("Gym")){
            if(polInput.equals("m")){
                cena = 42;

            }else if(polInput.equals("f")){
                cena = 35;
            }
        }else if(sportInput.equals("Boxing")){
            if(polInput.equals("m")){
                cena = 41;
            }else if(polInput.equals("f")){
                cena = 37;
            }
        }else if(sportInput.equals("Yoga")){
            if(polInput.equals("m")){
                cena = 45;
            }else if(polInput.equals("f")){
                cena = 42;
            }
        }else if(sportInput.equals("Zumba")){
            if(polInput.equals("m")){
                cena = 34;
            }else if(polInput.equals("f")){
                cena = 31;
            }
        }else if(sportInput.equals("Dances")){
            if(polInput.equals("m")){
                cena = 51;
            }else if(polInput.equals("f")){
                cena = 53;
            }
        }else if(sportInput.equals("Pilates")){
            if(polInput.equals("m")){
                cena = 39;
            }else if(polInput.equals("f")){
                cena = 37;
            }
        }
        double ukupnaCena = cena * popust;
        double mesec = budzetInput / ukupnaCena;

        if(ukupnaCena <=budzetInput){
            // System.out.printf("You purchased a %.0f month pass for %s.",mesec,sportInput);
            System.out.printf("You purchased a 1 month pass for %s.",sportInput);
        }else{
            double total = ukupnaCena - budzetInput;
            System.out.printf("You don't have enough money! You need $%.2f more.",total);
        }





    }
}