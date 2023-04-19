import java.util.Scanner;

public class Exercise_06_066 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  brojacStandard=0, brojacKid=0, brojacStudentskih=0, brojacKupljenihKarataUkupno=0;
        while(true) {
            String nazivFilma = sc.nextLine();
            if (nazivFilma.equals("Finish")) break;
            int brojSlobodnihMesta = Integer.parseInt(sc.nextLine());
            int brojKupljenihKarataZaPOjedinacnu = 0;

            while (brojKupljenihKarataZaPOjedinacnu < brojSlobodnihMesta) {
                String nazivVrsteKarte = sc.nextLine();
                if (nazivVrsteKarte.equals("End")) {
                    break;
                }
                brojKupljenihKarataZaPOjedinacnu++;
                if (nazivVrsteKarte.equals("student")) {
                    brojacStudentskih++;
                } else if (nazivVrsteKarte.equals("kid")) brojacKid++;
                else if (nazivVrsteKarte.equals("standard")) brojacStandard++;
            }
            brojacKupljenihKarataUkupno=brojacKupljenihKarataUkupno+brojKupljenihKarataZaPOjedinacnu;
            double procenatPopunjenosti = brojKupljenihKarataZaPOjedinacnu * 100.0 / brojSlobodnihMesta;
            System.out.printf("%s - %.2f%% full.\n", nazivFilma, procenatPopunjenosti);
        }
            double procenatStudent=brojacStudentskih*100.0/brojacKupljenihKarataUkupno;
            double procenatStandard=brojacStandard*100.0/brojacKupljenihKarataUkupno;
            double procenatKid=brojacKid*100.0/brojacKupljenihKarataUkupno;
            System.out.printf("Total tickets: %d\n", brojacKupljenihKarataUkupno );
            System.out.printf("%.2f%% student tickets.\n", procenatStudent);
            System.out.printf("%.2f%% standard tickets.\n", procenatStandard);
            System.out.printf("%.2f%% kids tickets.\n", procenatKid);


    }
}