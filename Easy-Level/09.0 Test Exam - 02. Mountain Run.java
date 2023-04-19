import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rekordUSekundamaInput = Double.parseDouble(scan.nextLine());
        double distancauMetrimaInput = Double.parseDouble(scan.nextLine());
        double vremeZaJedanMetaruSekundiInput = Double.parseDouble(scan.nextLine());

        double vremePotrebno = distancauMetrimaInput * vremeZaJedanMetaruSekundiInput;

        double dodatoVreme = Math.floor(distancauMetrimaInput /50);
        dodatoVreme = dodatoVreme *30;
        double ukupnoVreme = vremePotrebno + dodatoVreme;

        if(rekordUSekundamaInput<=ukupnoVreme){
            double vreme = ukupnoVreme - rekordUSekundamaInput;
            System.out.printf("No! He was %.2f seconds slower.",vreme);
        }else{

            System.out.printf("Yes! The new record is %.2f seconds.",ukupnoVreme);
        }


    }
}