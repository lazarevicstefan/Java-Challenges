import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int b = Integer.parseInt(scan.nextLine());
        for (int i=1 ; i<=b ; i +=3){
            System.out.println(i);
        }

    }
}