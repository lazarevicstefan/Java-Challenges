import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String nazivdanaInput = scan.nextLine();
        if(nazivdanaInput.equals("banana")||nazivdanaInput.equals("apple")||nazivdanaInput.equals("kiwi")||nazivdanaInput.equals("cherry")||nazivdanaInput.equals("lemon")||nazivdanaInput.equals("grapes")){
            System.out.println("fruit");
        }else if (nazivdanaInput.equals("tomato")||nazivdanaInput.equals("cucumber")||nazivdanaInput.equals("pepper")||nazivdanaInput.equals("carrot")){
            System.out.println("vegetable");
        }else System.out.print("unknown");

        }

    }