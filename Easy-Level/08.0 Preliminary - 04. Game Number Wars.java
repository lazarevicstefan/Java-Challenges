import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String prvi=sc.nextLine();
        String drugi=sc.nextLine();
        int poeniPrvi=0;
        int poeniDrugi=0;
        boolean daLiSuKarteJednake=true;
        while(daLiSuKarteJednake){
            String tekst=sc.nextLine();
            if(tekst.equals("End of game")){
                System.out.printf("%s has %d points\n%s has %d points", prvi,poeniPrvi,drugi,poeniDrugi);

                return;
            }
            int cardPrvi=Integer.parseInt(tekst);
            int cardDrugi=Integer.parseInt(sc.nextLine());
            if(cardPrvi>cardDrugi){
                poeniPrvi=poeniPrvi+(cardPrvi-cardDrugi);

            }else if(cardPrvi<cardDrugi){
                poeniDrugi=poeniDrugi+(cardDrugi-cardPrvi);

            }
            if(cardPrvi==cardDrugi){
                daLiSuKarteJednake=false;
//                System.out.printf("Number wars!\n%s is winner with %d points",prvi,poeniPrvi);
                 cardPrvi=Integer.parseInt(sc.nextLine());
                 cardDrugi=Integer.parseInt(sc.nextLine());
                if(cardPrvi>cardDrugi){
                    poeniPrvi=poeniPrvi;
                    System.out.printf("Number wars!\n%s is winner with %d points",prvi,poeniPrvi);
                }else if(cardPrvi<cardDrugi){
                    poeniDrugi=poeniDrugi;
                    System.out.printf("Number wars!\n%s is winner with %d points",drugi,poeniDrugi);
                }
            }

        }




    }
}