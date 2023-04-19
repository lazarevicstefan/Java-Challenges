import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int numbofpagesinput = Integer.parseInt(scan.nextLine());
        int pagesinput = Integer.parseInt(scan.nextLine());
        int daysinput = Integer.parseInt(scan.nextLine());

                int total = numbofpagesinput / pagesinput;
                int totala = total / daysinput ;
                System.out.println(totala);
        }
    }

