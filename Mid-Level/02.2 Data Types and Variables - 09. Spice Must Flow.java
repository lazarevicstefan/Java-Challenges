import java.util.Scanner;

public class Domaci09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int zbir = 0;
        int brojac = 0;
        while (true){
         if (n >=100){
             zbir = zbir +n;
             zbir = zbir - 26;
             n = n -10;
             brojac++;
         }   else {
             if(zbir >=26){
          zbir = zbir - 26;}
             break;
         }
        }
        System.out.println(brojac);
        System.out.println(zbir);
    }
}