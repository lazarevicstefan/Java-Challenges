import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int controlMinutes=Integer.parseInt(sc.nextLine());
        int secondForControl=Integer.parseInt(sc.nextLine());
        double lenghtOfChute=Double.parseDouble(sc.nextLine());
        int secondFor100Metters=Integer.parseInt(sc.nextLine());
        int secundeUControl=controlMinutes*60+secondForControl;
        double BrojPuta120M=(double)lenghtOfChute/120;
        double umanjenoVreme=BrojPuta120M*2.5;
        double MalkomTime=(lenghtOfChute/100)*secondFor100Metters-umanjenoVreme;
        if(MalkomTime<=secundeUControl){
            System.out.printf("Malcolm Davidson won an Olympic quota!\nHis time is %.3f.", MalkomTime);
        }else{
            double potrebno=MalkomTime-secundeUControl;
            System.out.printf("No, Malcolm failed! He was %.3f second slower.", potrebno);
        }

    }
}