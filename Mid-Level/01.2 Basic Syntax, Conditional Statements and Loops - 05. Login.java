import java.util.Scanner;

public class Zadatak04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst  = scan.nextLine();
        int duzina = tekst.length();
        String pass = "";
        int brojac = 0;
for (int i =0; i<duzina;duzina--){
    int b = duzina -1;
    char g = tekst.charAt(b);
    pass = pass + g;
}
        while (true){
            String pokusaj = scan.nextLine();
            if(pass.equals(pokusaj)){
                System.out.printf("User %s logged in.",tekst);
                break;
            }
            brojac ++;
            if (brojac ==4){
                System.out.printf("User %s blocked!",tekst);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
    }
}