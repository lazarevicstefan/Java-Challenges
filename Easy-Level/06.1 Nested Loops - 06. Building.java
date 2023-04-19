import java.util.Scanner;

public class JudgeLab_06_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojSpratova = Integer.parseInt(sc.nextLine());
        int brojSobaPoSpratu = Integer.parseInt(sc.nextLine());
        int i, j;
        for (i = brojSpratova; i >0; i--) {
            String slovo="";
            if (i== brojSpratova) {
                slovo="L";
            } else if (i % 2 == 0 ) {
                slovo="O";
            } else {
                slovo = "A";
            }
            for (j = 0; j < brojSobaPoSpratu; j++) {
                    System.out.printf("%s%d%d ", slovo,i, j);

                }
            System.out.println();
            }

        }

    }