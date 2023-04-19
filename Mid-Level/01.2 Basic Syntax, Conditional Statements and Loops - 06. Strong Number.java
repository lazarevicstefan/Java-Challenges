import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String broj_input = scan.nextLine();
        int brojcifara = broj_input.length();
        int nekibroj = 1;
        int zbir = 0;
        for (int i = 0; i < brojcifara; i++) {
            char faktorijel = broj_input.charAt(i);
            int a = Integer.parseInt(faktorijel+"");
            for(int j=1;j<=a;j++){
                nekibroj = nekibroj * j;


            }
            zbir = zbir + nekibroj;
            nekibroj = 1;



        }
        int s = Integer.parseInt(broj_input);
        if(s == zbir){
            System.out.printf("yes");
        }else System.out.println("no");
    }
}