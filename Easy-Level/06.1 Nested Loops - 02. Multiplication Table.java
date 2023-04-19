public class JudgeLab_06_02 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                int proizvod=i*j;
                System.out.printf("%d * %d = %d\n",i,j,proizvod);
            }
        }
    }
}