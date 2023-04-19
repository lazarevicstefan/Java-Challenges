import java.util.Scanner;

public class Exercise_06_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int brojClanovaZirija=Integer.parseInt(sc.nextLine());
        double finalniProsek=0 , zbirZaFinalniProsek=0, brojacZaFinalniProsek=0;
        while(true) {
            String nazivOblasti = sc.nextLine();
            if(nazivOblasti.equals("Finish")){
                break;
            }
            double zbirOcena=0;
            double brojacOcena=0;
            for(int i=1; i<=brojClanovaZirija;i++){
                double ocena=Double.parseDouble(sc.nextLine());
                zbirOcena=zbirOcena+ocena;
                brojacOcena++;

            }
            double prosek=zbirOcena/brojacOcena;
            System.out.printf("%s - %.2f.\n",nazivOblasti,prosek);
            zbirZaFinalniProsek=zbirZaFinalniProsek+prosek;
            brojacZaFinalniProsek++;

        }
        finalniProsek=zbirZaFinalniProsek/brojacZaFinalniProsek;
        System.out.printf("Student's final assessment is %.2f.",finalniProsek);

    }
}