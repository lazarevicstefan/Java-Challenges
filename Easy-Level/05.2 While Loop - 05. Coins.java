import java.util.Scanner;

public class Exercise_05_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double iznosKusura=Double.parseDouble(sc.nextLine())*1000;
        int brojacNovcica=0;
        while(true){
            if(iznosKusura==0){
                break;
        }
            if(iznosKusura>=2000){
                iznosKusura=iznosKusura-2000;
            }else if(iznosKusura>=1000){
                iznosKusura=iznosKusura-1000;
            }else if(iznosKusura>=500){
                iznosKusura=iznosKusura-500;
            }else if(iznosKusura>=200){
                iznosKusura=iznosKusura-200;
            }else if(iznosKusura>=100){
                iznosKusura=iznosKusura-100;
            }else if(iznosKusura>=50){
                iznosKusura=iznosKusura-50;
            }else if(iznosKusura>=20){
                iznosKusura=iznosKusura-20;
            }else if(iznosKusura>=10){
                iznosKusura=iznosKusura-10;
            }
            brojacNovcica++;
        }
        System.out.println(brojacNovcica);
    }
}