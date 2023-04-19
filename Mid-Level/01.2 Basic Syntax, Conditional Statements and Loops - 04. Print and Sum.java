import java.util.Scanner;

public class Zadatak04 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int broj_od = Integer.parseInt(scan.nextLine());
            int broj_do = Integer.parseInt(scan.nextLine());
            int zbir = 0;
            for (int i = broj_od; i <= broj_do;i++){
                System.out.print(i+" ");
                zbir = zbir + i;
        }
        System.out.println("");
        System.out.println("Sum: "+zbir);
    }
}