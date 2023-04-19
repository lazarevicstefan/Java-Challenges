import java.util.Scanner;

public class Exercise_05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimensionOfCakeWidth = Integer.parseInt(sc.nextLine());
        int dimensionOfCakeLength = Integer.parseInt(sc.nextLine());
        int NumberOfPieces = dimensionOfCakeWidth * dimensionOfCakeLength;
        int PieceSize = 1;
        int brojacUzetihParcica = 0;
        while (true) {
            String command = sc.nextLine();
            int parciciKojiSuOstali = NumberOfPieces - brojacUzetihParcica;
            if (command.equals("STOP")) {
                System.out.println(""+parciciKojiSuOstali+ " pieces are left.");
                return;
            }
            brojacUzetihParcica=brojacUzetihParcica+Integer.parseInt(command);
            if (NumberOfPieces < brojacUzetihParcica) {
                int parciciKojiFale = brojacUzetihParcica - NumberOfPieces;
                System.out.printf("No more cake left! You need %d pieces more.", parciciKojiFale);
                break;
            }
            }

        }
    }