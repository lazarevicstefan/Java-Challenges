import java.util.Scanner;

public class Exercise_05_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String knjigaKojuTrazim=sc.nextLine();
        int brojacKnjiga=0;
        while(true){
            String trenutnaKnjiga=sc.nextLine();

            if(trenutnaKnjiga.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", brojacKnjiga);
                break;
            }

            if(trenutnaKnjiga.equals(knjigaKojuTrazim)){

                System.out.printf("You checked %d books and found it.", brojacKnjiga);
                break;
            }
            brojacKnjiga++;

        }
    }
}