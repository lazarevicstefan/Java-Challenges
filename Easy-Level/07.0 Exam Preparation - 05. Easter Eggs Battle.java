import java.sql.BatchUpdateException;
import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int prviPreostalo = Integer.parseInt(scan.nextLine());
        int drugiPreostalo = Integer.parseInt(scan.nextLine());
        while (true){
            String pobednik = scan.nextLine();
            if(pobednik.equals("End")){
                System.out.printf("Player one has %d eggs left.\n",prviPreostalo);
                System.out.printf("Player two has %d eggs left.\n",drugiPreostalo);

                break;
            }
            if(pobednik.equals("one")){
                drugiPreostalo--;
            }
            if(pobednik.equals("two")){
                prviPreostalo--;
            }

            if(prviPreostalo == 0){
                System.out.print("Player one is out of eggs. ");
                System.out.printf("Player two has %d eggs left.\n",drugiPreostalo);
                break;
            }

            if(drugiPreostalo == 0){
                System.out.print("Player two is out of eggs. ");
                System.out.printf("Player one has %d eggs left.\n",prviPreostalo);
                break;
            }
        }
    }
}