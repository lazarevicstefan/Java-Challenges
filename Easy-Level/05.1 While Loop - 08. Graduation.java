import java.util.Scanner;

public class JudgeLab_05_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ime=sc.nextLine();
        int brojacRazreda=1;
        int brojPonavljanja=0;
        double prosek=0, zbirZaProsek=0, brojacZaProsek=0;
        while(true){
            double prosekTrenutneGodine=Double.parseDouble(sc.nextLine());
            if(prosekTrenutneGodine<4) {
                brojPonavljanja++;
                if (brojPonavljanja >= 2) {
                    System.out.printf("%s has been excluded at %d grade", ime, brojacRazreda);
                    return;
                }
            }
                else{
                    zbirZaProsek=zbirZaProsek+prosekTrenutneGodine;
                    brojacZaProsek++;
                    brojacRazreda++;
                    if(brojacRazreda==13){
                        break;
                    }
                }
            }
        prosek=zbirZaProsek/brojacZaProsek;
        System.out.printf("%s graduated. Average grade: %.2f",ime, prosek);

        }


}