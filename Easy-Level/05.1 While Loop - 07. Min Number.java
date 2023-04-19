import java.util.Scanner;

public class JudgeLab_05_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int trenutniMinimum=Integer.MAX_VALUE;
        while(true){
            String unos=sc.nextLine();
            if(unos.equals("Stop")){
                break;
            }
            int n=Integer.parseInt(unos);
            if(n<trenutniMinimum){
                trenutniMinimum=n;
            }
        }
        System.out.println(trenutniMinimum);
    }
}