import java.util.Scanner;

public class Exercise_05_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ZELjeNA_DISTANCA=10000;
        int ukupnoPresaoDistancu=0;

        while(true){
            String goHome=sc.nextLine();
            if(goHome.equals("Going home")){
                int distanaDoKuce=Integer.parseInt(sc.nextLine());
                ukupnoPresaoDistancu=ukupnoPresaoDistancu+distanaDoKuce;
                if(ukupnoPresaoDistancu>=ZELjeNA_DISTANCA){
                    System.out.println("Goal reached! Good job!");
                    int preko_koraka=ukupnoPresaoDistancu-ZELjeNA_DISTANCA;
                    System.out.printf("%d steps over the goal!", preko_koraka);
                }else{
                    int nedostaje_koraka=ZELjeNA_DISTANCA-ukupnoPresaoDistancu;
                    System.out.printf("%d more steps to reach goal.", nedostaje_koraka);
                }
                break;
            }
            int distanca=Integer.parseInt(goHome);
            ukupnoPresaoDistancu=ukupnoPresaoDistancu+distanca;
            if(ukupnoPresaoDistancu>=ZELjeNA_DISTANCA){
                System.out.println("Goal reached! Good job!");
                int preko_koraka=ukupnoPresaoDistancu-ZELjeNA_DISTANCA;
                System.out.printf("%d steps over the goal!", preko_koraka);
                return;
            }



        }
    }
}