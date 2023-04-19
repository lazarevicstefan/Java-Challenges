import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double year = Double.parseDouble(scan.nextLine());
        String genger = scan.nextLine();
        if ("m".equals(genger)){
            if(year >=16){
            System.out.println("Mr.");
            }else System.out.println("Master");
        }else if ("f".equals(genger)){
            if(year >=16){
                System.out.println("Ms.");
            }else System.out.println("Miss");
        }




        }
    }