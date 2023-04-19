import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broj = Integer.parseInt(scan.nextLine());
        int ukupno = 0;

        for (int i = 1;i<= 10;i++){
            int nesto = broj*i;
            System.out.printf("%d X %d = %d\n",broj,i, nesto);

            }
        }
    }