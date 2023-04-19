import java.util.Scanner;

public class Exercise_06_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        int brojac=1;
        Boolean daLidaPrekidam=false;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a;j++){
                if(i>=j){
                    System.out.printf("%d ",brojac);
                    if(brojac==a){
                        daLidaPrekidam=true;
                        break;
                    }
                    brojac++;
                }
            }
            if (daLidaPrekidam) break;
            System.out.println();
        }


    }
}