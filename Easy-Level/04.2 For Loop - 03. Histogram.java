import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int kolicinado200 = 0;
        int kolicinaod200do399 = 0;
        int kolicinaod400do599 = 0;
        int kolicinaod600do799 = 0;
        int kolicnaod800 = 0;
        for(int i = 1 ; i <= nBroj ; i++ ){
            int broj = Integer.parseInt(scan.nextLine());
            if (broj < 200){
                kolicinado200++;
            }else if (broj >= 200 && broj <=399){
                kolicinaod200do399++;
            }else if (broj >= 400 && broj <=599){
                kolicinaod400do599++;
            }else if (broj >= 600 && broj <=799){
                kolicinaod600do799++;
            }else if (broj >= 800){
                kolicnaod800++;
            }
        }
        double procenat1 = (double) kolicinado200 / nBroj * 100;
        System.out.printf("%.2f",procenat1);
        System.out.println("%");
        double procenat2 = (double) kolicinaod200do399 / nBroj * 100;
        System.out.printf("%.2f",procenat2);
        System.out.println("%");
        double procenat3 = (double) kolicinaod400do599 / nBroj * 100;
        System.out.printf("%.2f",procenat3);
        System.out.println("%");
        double procenat4 = (double) kolicinaod600do799 / nBroj * 100;
        System.out.printf("%.2f",procenat4);
        System.out.println("%");
        double procenat5 = (double) kolicnaod800 / nBroj * 100;
        System.out.printf("%.2f",procenat5);
        System.out.println("%");

    }
}