import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String mesecInput = scan.nextLine();
        int brojNociInput = Integer.parseInt(scan.nextLine());
        double popust = 0.0;
        double apopust = 0.0;
        double cenaStudio = 0.0;
        double cenaAparment = 0.0;
        if(mesecInput.equals("May")||mesecInput.equals("October")){
            cenaAparment = 65;
            cenaStudio = 50;
            if(brojNociInput >7&& brojNociInput <=13){
                popust = 5;
            }else if(brojNociInput >14){
                popust = 30;
                apopust = 10;
            }
            else popust = 0;
        }else if (mesecInput.equals("June")||mesecInput.equals("September")){
            cenaAparment = 68.70;
            cenaStudio = 75.20;
            if(brojNociInput >14){
                popust = 20;
                apopust = 10;
            }
        }else if (mesecInput.equals("July")||mesecInput.equals("August")){
            cenaAparment = 77;
            cenaStudio = 76;
            if(brojNociInput >14){
            apopust = 10;
            }
        }
        double totalStudio = cenaStudio * (100-popust)/100;
        double totalAparment = cenaAparment *(100-apopust)/100;
        double FinS = brojNociInput * totalStudio;
        double FinA = brojNociInput * totalAparment;
        System.out.printf("Apartment: %.2f USD.%n",FinA);
        System.out.printf("Studio: %.2f USD.",FinS);


    }
}