import java.util.Scanner;

public class Exercise_06_003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int zbirProstih=0;
        int zbirOnihKojiNisuProsti=0;
        while(true){
            String tekst=sc.nextLine();
            if(tekst.equals("stop")) break;
            int broj=Integer.parseInt(tekst);
            if(broj<0){
                System.out.println("Number is negative.");
                continue;
            }
            boolean jeProst=true;
            for(int i=2; i<broj; i++){
                if(broj % i==0){
                    jeProst=false;
                    break;
                }

            }
            if(jeProst){
                zbirProstih=zbirProstih+broj;
            }else{
                zbirOnihKojiNisuProsti=zbirOnihKojiNisuProsti+broj;
            }

        }
        System.out.printf("Sum of all prime numbers is: %d\n",zbirProstih);
        System.out.printf("Sum of all non prime numbers is: %d",zbirOnihKojiNisuProsti);

    }
}