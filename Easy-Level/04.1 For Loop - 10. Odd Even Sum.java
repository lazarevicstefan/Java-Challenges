import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int brojevi = 0;
        int ukupnoParni = 0;
        int ukupnoNeparni = 0;

        for (int i = 1 ; i <= nBroj ; i++){
            int ternutniBroj = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0){
                ukupnoParni = ukupnoParni + ternutniBroj;
            }else {
                ukupnoNeparni = ukupnoNeparni + ternutniBroj;
            }
        }
        int razlika = Math.abs(ukupnoParni - ukupnoNeparni);
        if (razlika == 0){
            System.out.println("Yes");
        }else {
                System.out.println("No");
    }
        if (ukupnoParni == ukupnoNeparni){
            System.out.println("Sum = " + ukupnoParni);
        }else {

            System.out.println("Diff = " + razlika);
        }


    }
}