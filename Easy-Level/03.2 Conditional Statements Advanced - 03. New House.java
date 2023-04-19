import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String cveceInput = scan.nextLine();
        int kolicinaInput = Integer.parseInt(scan.nextLine());
        int budzetInput = Integer.parseInt(scan.nextLine());
        double cenaRoses = 5;
        double cenaDahlias = 3.80;
        double cenaTulips = 2.8;
        double cenaNarcissus = 3;
        double cenaGladiolus = 2.5;
        double cena = -1;
        double popust = 0.0;
        if (cveceInput.equals("Roses")){
            if(kolicinaInput >80){
                popust = 10;
            }
            cena = cenaRoses * (100-popust) /100;
        }else if (cveceInput.equals("Dahlias")){
            if(kolicinaInput > 90){
                popust = 15;
            }
            cena = cenaDahlias *(100-popust) / 100;
        }else if(cveceInput.equals("Tulips")){
            if(kolicinaInput > 80){
                popust = 15;
            }
            cena = cenaTulips *(100-popust) / 100;
        }else if(cveceInput.equals("Narcissus")){
            if(kolicinaInput < 120){
                popust = -15;
            }
            cena = cenaNarcissus *(100-popust) / 100;
        }else if(cveceInput.equals("Gladiolus")){
            if(kolicinaInput < 80){
                popust = -20;
            }
            cena = cenaGladiolus *(100-popust) / 100;
        }
        double totalCena = cena * kolicinaInput;
        if (budzetInput >= totalCena){
            double ostatak = budzetInput - totalCena;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.",kolicinaInput,cveceInput,ostatak);
        }else {
            double nedostaje = totalCena - budzetInput;
            System.out.printf("Not enough money, you need %.2f USD more.",nedostaje);
        }


       }
    }