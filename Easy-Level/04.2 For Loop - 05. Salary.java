import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int nBroj = Integer.parseInt(scan.nextLine());
        int plata = Integer.parseInt(scan.nextLine());
        int trenutniZbirKazni = 0;
        for (int i = 1; i <=nBroj ; i++){
            String nazaivSajta = scan.nextLine();
            if (nazaivSajta.equals("Facebook")){
                trenutniZbirKazni = trenutniZbirKazni + 150;
            }else if(nazaivSajta.equals("Instagram")){
                trenutniZbirKazni = trenutniZbirKazni + 100;
            }else if(nazaivSajta.equals("Reddit")){
                trenutniZbirKazni = trenutniZbirKazni + 50;
            }
            if (trenutniZbirKazni >= plata){
                System.out.println("You have lost your salary.");
                return;
            }
        }
        int fin = plata - trenutniZbirKazni;

        System.out.println(fin);

    }
}