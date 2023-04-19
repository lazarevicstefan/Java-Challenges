import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int levaSUM = 0;
        int desnaSUM = 0;
        for (int i = 0; i<nBroj; i++){
            int broj = Integer.parseInt(scan.nextLine());
            levaSUM = levaSUM + broj;
        }

        for (int i = 0; i<nBroj; i++){
            int broj = Integer.parseInt(scan.nextLine());
            desnaSUM = desnaSUM + broj;
        }
        if (levaSUM == desnaSUM){
            System.out.println("Yes, sum = " + desnaSUM);
        }else{
            int razlika = Math.abs(levaSUM - desnaSUM);
            System.out.println("No, diff = " + razlika);
        }

    }
}