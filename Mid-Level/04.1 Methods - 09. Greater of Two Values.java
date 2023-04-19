import java.util.Scanner;

public class Vezba09 {
    public static int getMax(int a, int b){
        if (a > b) return a;
        else return b;
    }
    public static char getMax(char a, char b){
        if (a > b) return a;
        else return b;
    }
    public static String getMax(String a, String b){
        if (a.compareTo(b) > 0){
            return a;
        }else return b ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nazivTipa = scan.nextLine();
        if(nazivTipa.equals("int")){
            int prvi = Integer. parseInt(scan.nextLine());
            int drugi = Integer.parseInt(scan.nextLine());
            int rez = getMax(prvi, drugi);
            System.out.println(rez);
            return;
        }else if(nazivTipa.equals("string")){
            String prvi = scan.nextLine();
            String drugi = scan.nextLine();
            String rez = getMax(prvi,drugi);
            System.out.println(rez);
            return;
        }else if(nazivTipa.equals("char")){
            char prvi = scan.nextLine().charAt(0);
            char drugi = scan.nextLine().charAt(0);
            int rez = getMax(prvi, drugi);
            System.out.printf("%c",rez);
            return;
        }else {

        }
    }
}