import java.util.Scanner;

public class Exercise_04_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfTournaments=Integer.parseInt(sc.nextLine());
        int initialPoints=Integer.parseInt(sc.nextLine());
        int stringPoints=0;
        int totalPoints=0;
        int sumPoints=0;
        double averagePoints;
        double percentageofWon=0;
        int brojac=0;
        for(int i=1; i<=numberOfTournaments; i++){
            String stage=sc.nextLine();
            if(stage.equals("W")){
                brojac++;
                stringPoints=2000;
                totalPoints=totalPoints+stringPoints;
                percentageofWon=(double)brojac/numberOfTournaments*100;
            }else if(stage.equals("F")){
                stringPoints=1200;
                totalPoints=totalPoints+stringPoints;
            }else if(stage.equals("SF")){
                stringPoints=720;
                totalPoints=totalPoints+stringPoints;
            }
        }
        sumPoints=initialPoints+totalPoints;
        averagePoints=Math.floor((double)totalPoints/numberOfTournaments);
        System.out.println("Final points: "+sumPoints);
        System.out.printf("Average points: %.0f\n",averagePoints);
        System.out.printf("%.2f%%",percentageofWon);
    }
}