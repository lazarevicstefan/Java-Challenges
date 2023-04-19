import java.util.Scanner;

public class Domaci02 {
    public static int prebrojSamoglasnike(String text){
       int brojac = 0;
       int n = text.length();
        for (int i = 0; i <n; i++) {
            char trenutniKarakter = text.charAt(i);
            if(trenutniKarakter == 'a' || trenutniKarakter == 'A' ||
               trenutniKarakter == 'e' || trenutniKarakter == 'E' ||
               trenutniKarakter == 'i' || trenutniKarakter == 'I' ||
               trenutniKarakter == 'o' || trenutniKarakter == 'O' ||
               trenutniKarakter == 'u' || trenutniKarakter == 'U'){
                brojac++;
            }
        }
        return brojac;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(prebrojSamoglasnike(text));
    }
}