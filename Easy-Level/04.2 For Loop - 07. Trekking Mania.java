import java.util.Scanner;

public class Exercise_04__07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfGroupOfClimbers=Integer.parseInt(sc.nextLine());
        String mountain="";
        double percentageForMountin=1;
        int sumOfAllClimbers=0;
        int brojacPlanina1=0;
        int brojacPlanina2=0;
        int brojacPlanina3=0;
        int brojacPlanina4=0;
        int brojacPlanina5=0;

        for(int i=1; i<=numberOfGroupOfClimbers; i++) {
            int numberOfClimbers = Integer.parseInt(sc.nextLine());
            sumOfAllClimbers=sumOfAllClimbers+numberOfClimbers;
            if(numberOfClimbers<=5){
                mountain="Mount Fuji";
                brojacPlanina1=brojacPlanina1+numberOfClimbers;
            }else if(numberOfClimbers>=6 && numberOfClimbers<=12){
                mountain="Mont Blanc";
                brojacPlanina2=brojacPlanina2+numberOfClimbers;
            }else if(numberOfClimbers>=13 && numberOfClimbers<=25){
                mountain="Kilimanjaro";
                brojacPlanina3=brojacPlanina3+numberOfClimbers;
            }else if(numberOfClimbers>=26 && numberOfClimbers<=40){
                mountain="K2";
                brojacPlanina4=brojacPlanina4+numberOfClimbers;
            }else{
                mountain="Everest";
                brojacPlanina5=brojacPlanina5+numberOfClimbers;
            }

        }
        double broj1=(double)brojacPlanina1/sumOfAllClimbers*100;
        double broj2=(double)brojacPlanina2/sumOfAllClimbers*100;
        double broj3=(double)brojacPlanina3/sumOfAllClimbers*100;
        double broj4=(double)brojacPlanina4/sumOfAllClimbers*100;
        double broj5=(double)brojacPlanina5/sumOfAllClimbers*100;
        System.out.printf("%.2f%%\n",broj1);
        System.out.printf("%.2f%%\n",broj2);
        System.out.printf("%.2f%%\n",broj3);
        System.out.printf("%.2f%%\n",broj4);
        System.out.printf("%.2f%%\n",broj5);





    }
}