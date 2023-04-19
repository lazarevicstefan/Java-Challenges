import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        int ukupno = 0;
        int nesto = 1;
        for (int i = 0;i< broj;i++){

                System.out.println(nesto);
                ukupno = ukupno +nesto;
                nesto = nesto +2;
            }
        System.out.printf("Sum: %d",ukupno);;
        }


    }