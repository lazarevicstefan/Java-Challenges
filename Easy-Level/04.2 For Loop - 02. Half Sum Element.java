import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int MAXbroj = Integer.MIN_VALUE;
        int ukupno = 0;
        for(int i = 1 ; i <= nBroj ; i++ ){
            int broj = Integer.parseInt(scan.nextLine());
            ukupno = ukupno + broj;
            if (broj > MAXbroj){
                MAXbroj = broj;
            }
        }

        int ostalo = ukupno - MAXbroj;
        if ( ostalo == MAXbroj){
            System.out.println("Yes");
            System.out.println("Sum = " + MAXbroj);
        }else{
            int razlika = Math.abs(ostalo - MAXbroj);
            System.out.println("No");
            System.out.println("Diff = " + razlika);
        }

    }
}