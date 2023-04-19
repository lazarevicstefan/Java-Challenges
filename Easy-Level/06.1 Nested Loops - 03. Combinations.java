import java.util.Scanner;

public class JudgeLab_06_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int prvi, drugi, treci;
        int brojac=0;
        for(prvi=0; prvi<=n;prvi++){
            for(drugi=0; drugi<=n; drugi++){
                for(treci=0; treci<=n; treci++){
                    if(prvi+drugi+treci==n){
                        brojac++;

                    }
                }
            }
        }
        System.out.println(brojac);
    }
}