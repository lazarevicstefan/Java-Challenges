import java.util.Scanner;

public class Vezba01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int brojKorisnika = Integer.parseInt(scan.nextLine());
        int brojLekcija = Integer.parseInt(scan.nextLine());
        int dodatniPoeni = Integer.parseInt(scan.nextLine());

        int[] poseteStudenata = new int[brojKorisnika];
        for (int i = 0; i < brojKorisnika; i++) {
            poseteStudenata[i] = Integer.parseInt(scan.nextLine());
        }
        double trenutniNajveciBonus = Integer.MIN_VALUE;
        int maksimalanBrojPosecenihCasova = Integer.MIN_VALUE;
        for (int i = 0; i < brojKorisnika; i++) {
            double bonusTrenutnog = (double) poseteStudenata[i] / brojLekcija * (5 + dodatniPoeni);
            if (bonusTrenutnog > trenutniNajveciBonus) {
                trenutniNajveciBonus = bonusTrenutnog;
                maksimalanBrojPosecenihCasova = poseteStudenata[i];
            }
        }
        if (brojKorisnika == 0){
        trenutniNajveciBonus = 0 ;
        maksimalanBrojPosecenihCasova = 0;
        }
        System.out.printf("Max Bonus: %d.\n", (int) Math.ceil(trenutniNajveciBonus));
        System.out.printf("The student has attended %d lectures.\n",maksimalanBrojPosecenihCasova);


    }
}