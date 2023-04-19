import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int brojDanaInput = Integer.parseInt(scan.nextLine());
        double svidobici = 0;
        int dobitni = 0;
        int gubitni = 0;
        double total = 0;
        int win = 0;
        int lose = 0;
        for(int i =0; i<brojDanaInput;i++){


            while(true) {

                String utakmica = scan.nextLine();
                if(utakmica.equals("Finish")){
                    if (dobitni > gubitni){
                        total = total + (svidobici * 1.1);
                        win++;
                        dobitni = 0;
                        gubitni = 0;
                        svidobici =0;
                        break;
                    }

                    total = total + svidobici;
                    lose ++;
                    dobitni = 0;
                    gubitni = 0;
                    svidobici =0;
                    break;

                }
                String dobioILIizgubio = scan.nextLine();
                if (dobioILIizgubio.equals("win")) {
                    svidobici = svidobici + 20;
                    dobitni++;
                } else if (dobioILIizgubio.equals("lose")) {
                    gubitni++;
                }
            }

        }
        if (win >lose){
            total = total *1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",total);
        }else{
        System.out.printf("You lost the tournament! Total raised money: %.2f",total);
        }
    }
}