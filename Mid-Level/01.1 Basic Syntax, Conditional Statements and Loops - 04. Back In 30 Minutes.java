import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sati = Integer.parseInt(scan.nextLine());
        int minuti = Integer.parseInt(scan.nextLine());
        if (minuti>30){
            sati ++;
            minuti = 60-(30+minuti);
            minuti = -minuti;

        }else {
            minuti = minuti + 30;
        }
        if(sati>=24){
        sati = 0;}
        System.out.printf("%d:%02d",sati,minuti);
    }
}