import java.util.Scanner;

public class Exercise_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double neededMoney = Double.parseDouble(sc.nextLine());
        double stanjeNovca = Double.parseDouble(sc.nextLine());
        int brojacDana = 0;
        int brojacUzastopnihDanaTrosenja=0;
        while (true) {
            String saveOrSpend = sc.nextLine();
            double iznosKojiseTrosiIliCuva = Double.parseDouble(sc.nextLine());
            brojacDana++;
            if (saveOrSpend.equals("save")) {
                 brojacUzastopnihDanaTrosenja=0;
                stanjeNovca = stanjeNovca + iznosKojiseTrosiIliCuva;
                if(stanjeNovca>=neededMoney){
                    System.out.printf("You saved the money for %d days.", brojacDana);
                    return;
                }
            } else if (saveOrSpend.equals("spend")) {
                brojacUzastopnihDanaTrosenja++;
                if(brojacUzastopnihDanaTrosenja==5){
                    System.out.println("You can't save the money.");
                    System.out.println(brojacDana);
                    return;
                }
                stanjeNovca = stanjeNovca - iznosKojiseTrosiIliCuva;
                if(stanjeNovca<0){
                    stanjeNovca=0;
                }
            } else {
                System.out.println("Los unos nije save/spend");


            }
        }
    }
}