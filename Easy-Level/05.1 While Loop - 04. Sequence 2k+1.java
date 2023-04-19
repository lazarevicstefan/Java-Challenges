import java.util.Scanner;

public class JudgeLab_05_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int broj=1;
        while(broj<=n){
            System.out.println(broj);
            broj=broj*2+1;
        }
    }
}