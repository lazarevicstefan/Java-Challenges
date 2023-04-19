import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nivo=sc.nextLine();
        String vrstaKarte=sc.nextLine();
        int brojKupljenihKarata=Integer.parseInt(sc.nextLine());
        char karakter=sc.nextLine().charAt(0);
        double cenaJedneKarte=0;

        switch(nivo){
            case "Quarter final":
                if(vrstaKarte.equals("Standard")) {
                    cenaJedneKarte=55.50;
                } else if(vrstaKarte.equals("Premium")){
                        cenaJedneKarte=105.2;
                    }else if(vrstaKarte.equals("VIP")){
                        cenaJedneKarte=118.90;
                }

                break;
            case "Semi final":
                if(vrstaKarte.equals("Standard")) {
                    cenaJedneKarte=75.88;
                } else if(vrstaKarte.equals("Premium")){
                    cenaJedneKarte=125.22;

                }else if(vrstaKarte.equals("VIP")){
                    cenaJedneKarte=300.40;

                }
                break;
            case "Final":
                if(vrstaKarte.equals("Standard")) {
                    cenaJedneKarte=110.10;
                } else if(vrstaKarte.equals("Premium")){
                    cenaJedneKarte=160.66;

                }else if(vrstaKarte.equals("VIP")){
                    cenaJedneKarte=400;

                }
                break;
        }
        double ukupnoCena=brojKupljenihKarata*cenaJedneKarte;
        if(ukupnoCena>4000 && (karakter=='Y' || karakter=='N')){
            ukupnoCena=ukupnoCena*0.75;

        }else if(ukupnoCena>2500 && karakter=='Y'){
            ukupnoCena=ukupnoCena*0.90+brojKupljenihKarata*40;
        }else if(ukupnoCena>2500 && karakter=='N') {
            ukupnoCena = ukupnoCena * 0.90;
        }else if(ukupnoCena<=2500 && karakter=='Y'){
                ukupnoCena=ukupnoCena+brojKupljenihKarata*40;
        }else if(ukupnoCena<=2500 && karakter=='N') {
            ukupnoCena = ukupnoCena ;
        }
        System.out.printf("%.2f",ukupnoCena);
        }
    }