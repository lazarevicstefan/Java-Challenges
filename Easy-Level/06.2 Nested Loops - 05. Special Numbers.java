import java.util.Scanner;

public class Exercise_06_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int broj=Integer.parseInt(sc.nextLine());
        for(int i=1111;i<=9999;i++){
            int trenutniBroj=i;
            String tekst=trenutniBroj + "";
            int n=tekst.length();
            boolean pretpostavkaDaJeSpecijalan=true;

            for(int j=0; j<n;j++) {
                char trenutniKarakter = tekst.charAt(j);
                int cifra = Integer.parseInt(trenutniKarakter + "");
                if(cifra==0){
                    pretpostavkaDaJeSpecijalan=false;
                    break;
                }
                if (cifra!=0 && broj % cifra != 0) {
                    pretpostavkaDaJeSpecijalan = false;

                    break;
                }
            }
            if(pretpostavkaDaJeSpecijalan){
                System.out.printf("%d ", trenutniBroj);
            }
        }


    }
}