import java.util.Scanner;

public class Zadatak08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj_input = Integer.parseInt(scan.nextLine());

        for (int i = 0; i<broj_input;i++){
         for(int j = 0; j<=i;j++){
             System.out.print(i+1+" ");
         }
            System.out.println("");
        }
    }
}