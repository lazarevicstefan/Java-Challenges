import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int brojPosetioca=Integer.parseInt(sc.nextLine());
        int brojBack=0;
        int brojChest=0;
        int brojLegs=0;
        int brojAbs=0;
        int brojProteinShake=0;
        int brojProteinBar=0;
        int brojWorkout=1;
        int brojProtein=1;
        for(int i=1; i<=brojPosetioca; i++){
            String aktivnost=sc.nextLine();
            if(aktivnost.equals("Back")){
                brojBack++;
            }
            if(aktivnost.equals("Chest")){
                brojChest++;
            }
            if(aktivnost.equals("Legs")){
                brojLegs++;
            }
            if(aktivnost.equals("Abs")){
                brojAbs++;
            }
            if(aktivnost.equals("Protein shake")){
                brojProteinShake++;
            } if(aktivnost.equals("Protein bar")){
                brojProteinBar++;
            }


        }
        brojWorkout=brojBack+brojChest+brojLegs+brojAbs;
        brojProtein=brojProteinBar+brojProteinShake;

        double procenatWokrout=(double) brojWorkout/brojPosetioca*100;
        double procenatProtein=(double) brojProtein/brojPosetioca*100;

        System.out.printf("%d - back\n",brojBack);
        System.out.printf("%d - chest\n",brojChest);
        System.out.printf("%d - legs\n",brojLegs);
        System.out.printf("%d - abs\n",brojAbs);
        System.out.printf("%d - protein shake\n",brojProteinShake);
        System.out.printf("%d - protein bar\n",brojProteinBar);

        System.out.printf("%.2f%% - work out\n",procenatWokrout);
        System.out.printf("%.2f%% - protein",procenatProtein);

    }
}