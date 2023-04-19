import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String vrstaDana = scan.nextLine();
        int brojGodina = Integer.parseInt(scan.nextLine());
        int cenaKarte = 0;
        switch(vrstaDana){
            case "Weekday":
                if(brojGodina < 0 || brojGodina > 122){
                    System.out.printf("Error!");
                    return;
                }else if(brojGodina <= 18){
                    cenaKarte = 12;
                }else if(brojGodina <= 64){
                    cenaKarte = 18;
                }else if(brojGodina <= 122){
                    cenaKarte = 12;
                }
                break;
            case "Weekend":
                if(brojGodina < 0 || brojGodina > 122){
                    System.out.printf("Error!");
                    return;
                }else if(brojGodina <= 18){
                    cenaKarte = 15;
                }else if(brojGodina <= 64){
                    cenaKarte = 20;
                }else if(brojGodina <= 122){
                    cenaKarte = 15;
                }
                break;
            case "Holiday":
                if(brojGodina < 0 || brojGodina > 122){
                    System.out.printf("Error!");
                    return;
                }else if(brojGodina <= 18){
                    cenaKarte = 5;
                }else if(brojGodina <= 64){
                    cenaKarte = 12;
                }else if(brojGodina <= 122){
                    cenaKarte = 10;
                }
                break;
            default:
                System.out.println("Error!");

        }
        char dolar = '$';
        System.out.printf("%d%c",cenaKarte,dolar);

    }
}