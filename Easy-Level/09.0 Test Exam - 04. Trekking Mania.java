import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int brojGrupaInput = Integer.parseInt(scan.nextLine());

        double ukupnoLjudi = 0;
        double ukupno1 = 0;
        double ukupno2 = 0;
        double ukupno3 = 0;
        double ukupno4 = 0;
        double ukupno5 = 0;

        for(int i = 1; i <= brojGrupaInput; i++){
            int grupaInput = Integer.parseInt(scan.nextLine());
            ukupnoLjudi = ukupnoLjudi + grupaInput;
            if (grupaInput > 0 && grupaInput<=5){
                ukupno1 = ukupno1 + grupaInput;
            }else if (grupaInput<=12){
                ukupno2 = ukupno2 + grupaInput;
            }else if (grupaInput<=25){
                ukupno3 = ukupno3 + grupaInput;
            }else if (grupaInput<=40){
                ukupno4 = ukupno4 + grupaInput;
            }else {
                ukupno5 = ukupno5 + grupaInput;
            }
        }
        double total1 = (ukupno1/ukupnoLjudi)*100;
        double total2 = (ukupno2/ukupnoLjudi)*100;
        double total3 = (ukupno3/ukupnoLjudi)*100;
        double total4 = (ukupno4/ukupnoLjudi)*100;
        double total5 = (ukupno5/ukupnoLjudi)*100;

        System.out.printf("%.2f%%\n",total1);
        System.out.printf("%.2f%%\n",total2);
        System.out.printf("%.2f%%\n",total3);
        System.out.printf("%.2f%%\n",total4);
        System.out.printf("%.2f%%\n",total5);

    }
}