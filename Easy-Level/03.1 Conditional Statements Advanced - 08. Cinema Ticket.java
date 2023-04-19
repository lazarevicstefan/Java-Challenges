import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String nazivdanaInput = scan.nextLine();
        if(nazivdanaInput.equals("Monday")||nazivdanaInput.equals("Tuesday")||nazivdanaInput.equals("Friday")){
            System.out.println(12);
        }else if (nazivdanaInput.equals("Wednesday")||nazivdanaInput.equals("Thursday")){
            System.out.println(14);
        }else if (nazivdanaInput.equals("Saturday")||nazivdanaInput.equals("Sunday")) {
            System.out.println(16);
        }else System.out.print("");

        }

    }