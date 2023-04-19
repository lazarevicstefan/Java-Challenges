import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double recorsinput = Double.parseDouble(scan.nextLine());
        double distanceinput = Double.parseDouble(scan.nextLine());
        double timeinput = Double.parseDouble(scan.nextLine());

        double musttoswim = distanceinput * timeinput;

        double totalmust = Math.floor(distanceinput / 15);
        double totalsec = totalmust * 12.5;

        double totaltime = musttoswim + totalsec;
        double total = totaltime - recorsinput;

        if (recorsinput > totaltime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totaltime);

        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",total);

        }



    }
}