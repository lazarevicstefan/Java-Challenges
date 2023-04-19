import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int vremeispitaH = Integer.parseInt(scan.nextLine());
        int vremeispitaM = Integer.parseInt(scan.nextLine());
        int vremedolaskaH = Integer.parseInt(scan.nextLine());
        int vremedolaskaM = Integer.parseInt(scan.nextLine());
        int vremeIspitaMinuti = vremeispitaH * 60 + vremeispitaM;
        int vremeDolaskaMinuti = vremedolaskaH * 60 + vremedolaskaM;
        int razlikaUVremenu = vremeIspitaMinuti - vremeDolaskaMinuti;
        if (razlikaUVremenu < 0){
            System.out.println("Late");
            razlikaUVremenu = -razlikaUVremenu;
            if(razlikaUVremenu <=59){
            System.out.println(razlikaUVremenu +" minutes after the start");
            }else {
                int sati = razlikaUVremenu /60 ;// daje nam samo sati
                int minuti = razlikaUVremenu % 60 ; // daje nam ostatak koji je minuti
                System.out.printf("%d:%02d hours after the start",sati,minuti);
            }
        }else if (razlikaUVremenu <=30){
            if (razlikaUVremenu == 0){
                System.out.println("On time");
            }else{
            System.out.println("On time");
            System.out.println(razlikaUVremenu +" minutes before the start");}
        }else {
            System.out.println("Early");
            if(razlikaUVremenu <=59){
                System.out.println(razlikaUVremenu +" minutes before the start");
            }else {
                int sati = razlikaUVremenu /60 ;// daje nam samo sati
                int minuti = razlikaUVremenu % 60 ; // daje nam ostatak koji je minuti
                System.out.printf("%d:%02d hours before the start",sati,minuti);
            }
        }



    }
}