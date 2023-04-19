import java.util.Scanner;

public class JudgeLab_06_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prviBroj=Integer.parseInt(sc.nextLine());
        int drugiBroj=Integer.parseInt(sc.nextLine());
        int magicniBroj=Integer.parseInt(sc.nextLine());
        int i;
        int j;
        int brojac=0;
        for(i=prviBroj; i<=drugiBroj; i++){
            for(j=prviBroj; j<=drugiBroj;j++){
                int zbir=i+j;
                brojac++;
                if(zbir==magicniBroj) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", brojac, i, j, zbir);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", brojac, magicniBroj);

    }
}