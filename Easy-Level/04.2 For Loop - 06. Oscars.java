import java.util.Scanner;

public class Exercise_04_062 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String actorName=sc.nextLine();
        double pointsFromAcademy=Double.parseDouble(sc.nextLine());
        int numberOfEvaluator=Integer.parseInt(sc.nextLine());
        double sumPointsOfOneEvaluator=0;
        double total=0;
        double razlika=0;
        double razlika2;
        for(int i=1; i<=numberOfEvaluator;i++){
            String nameOfEvaluator=sc.nextLine();
            double evaluatorPoints=Double.parseDouble(sc.nextLine());
            int textLength=nameOfEvaluator.length();
            total=(double)(total+((textLength*evaluatorPoints)/2));
            sumPointsOfOneEvaluator=(double)pointsFromAcademy+total;
            if(sumPointsOfOneEvaluator>=1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,sumPointsOfOneEvaluator);
                return;

        }




        }
         if(sumPointsOfOneEvaluator<1250.5){
            razlika=1250.5-sumPointsOfOneEvaluator;
            System.out.printf("Sorry, %s you need %.1f more!", actorName,razlika);
        }
    }
}