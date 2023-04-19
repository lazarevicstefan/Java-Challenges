import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int unos = Integer.parseInt(scan.nextLine());
        for(int i = 0; i<=unos ; i++){
            if (i % 2 == 0){
            double naStepen = Math.pow(2,i);
            System.out.printf("%.0f%n",naStepen);
            }
        }


    }
}