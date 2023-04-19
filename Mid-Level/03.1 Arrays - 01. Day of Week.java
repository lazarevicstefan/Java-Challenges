import java.util.Scanner;

public class Vezba01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int unos = Integer.parseInt(scanner.nextLine());
int a = days.length;
        if(unos > a ){
            System.out.println("Invalid day!");
        }else if(unos <= 0){
            System.out.println("Invalid day!");
        }else System.out.println(days[unos-1]);            
    }
}