import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int satinput = Integer.parseInt(scan.nextLine());
        String dayInput = scan.nextLine();
            switch (dayInput) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    if(satinput >=10 && satinput <=18) {
                        System.out.println("open");
                    }else {
                        System.out.println("closed");
                    }

                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;

            }
        }
    }