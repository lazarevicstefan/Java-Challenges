import java.util.Scanner;
public class Zadatak01 {
    public static String takeODD(String  inicijalnaSifra ){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inicijalnaSifra.length(); i++) {
            if (i % 2 != 0) {
                char trenutniKarakter = inicijalnaSifra.charAt(i);
                sb.append(trenutniKarakter);

            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static String cut(String inicijalnaSifra, int pocetak, int duzina){
        String a="";
        if (pocetak + duzina <= inicijalnaSifra.length()){
            a = inicijalnaSifra.substring(pocetak,pocetak+duzina);
            inicijalnaSifra = inicijalnaSifra.replaceFirst(a,"");
            System.out.println(inicijalnaSifra);
        }
        return inicijalnaSifra;
    }
    public static String substitute(String inicijalnaSifra, String menjam, String menjamZa){
        if (inicijalnaSifra.contains(menjam)) {
            while(inicijalnaSifra.contains(menjam)){
                inicijalnaSifra = inicijalnaSifra.replace(menjam,menjamZa);
            }
            System.out.println(inicijalnaSifra);
        }
        else System.out.println("Nothing to replace!");
        return inicijalnaSifra;
    }
    public static void main(String[] args) {

// Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr 
// TakeOdd
// Cut 15 3
// Substitute :: -
// Substitute | ^
// Done

        Scanner scan = new Scanner(System.in);
        String inicijalnaSifra = scan.nextLine();
        while (true){
            String komandaZaSplitovanje = scan.nextLine();
            if (komandaZaSplitovanje.equals("Done")) break;
            String[] deloviKomande = komandaZaSplitovanje.split("\\s+");
            if (deloviKomande[0].equals("TakeOdd"))inicijalnaSifra = takeODD(inicijalnaSifra);
            else if (deloviKomande[0].equals("Cut"))inicijalnaSifra = cut(inicijalnaSifra,Integer.parseInt(deloviKomande[1]),Integer.parseInt(deloviKomande[2]));
            else if (deloviKomande[0].equals("Substitute")) inicijalnaSifra = substitute(inicijalnaSifra,deloviKomande[1],deloviKomande[2]);
        }
        System.out.println("Your password is: " + inicijalnaSifra);
    }
}