import java.util.Scanner;

public class JudgeLab_05_0601 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int trenutniMaksimum=Integer.MIN_VALUE;
        while(true){
            String unos=sc.nextLine();
            if(unos.equals("Stop")){
                break;
            }
            int n=Integer.parseInt(unos);
            if(n>trenutniMaksimum){
                trenutniMaksimum=n;
            }
        }
        System.out.println(trenutniMaksimum);
    }
}