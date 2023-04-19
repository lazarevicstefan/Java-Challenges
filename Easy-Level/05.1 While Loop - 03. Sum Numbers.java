import java.util.Scanner;

public class JudgeLab_05_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maksimalnaVrednost=Integer.parseInt(sc.nextLine());
        int trenutniZbir=0;
        while(true){
            int broj=Integer.parseInt(sc.nextLine());
            trenutniZbir=trenutniZbir+broj;
            if(trenutniZbir>=maksimalnaVrednost){
                break;
            }
        }
        System.out.println(trenutniZbir);
    }
}