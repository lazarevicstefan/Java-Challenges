import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String naziv_zemlje = scan.nextLine();
    switch (naziv_zemlje){
        case "England":
        case "USA":
            System.out.println("English");
            break;
        case "Spain":
        case "Argentina":
        case "Mexico":
            System.out.println("Spanish");
            break;
        default:
            System.out.println("unknown");
    }

    }
}