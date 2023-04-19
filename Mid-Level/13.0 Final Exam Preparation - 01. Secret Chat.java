import java.util.Scanner;

public class Domaci01 {
    public static String inserSpace (String tekst, int pozicija){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            if (i == pozicija) sb.append(" ");
            sb.append(tekst.charAt(i));
        }

        return sb.toString();
    }
    public static String okreniUnazad (String tekst){
        int i = tekst.length();
        StringBuilder sb = new StringBuilder();
        for (int j = i-1; j >= 0 ; j--) {
            sb.append(tekst.charAt(j));
        }
        return sb.toString();
    }
    public static String reverse (String tekst, String podstringZaZamenu){
        if (tekst.contains(podstringZaZamenu)){
            tekst = tekst.replaceFirst(podstringZaZamenu,"");
            tekst = tekst + okreniUnazad(podstringZaZamenu);
        }
        return tekst;
    }
    public static void main(String[] args) {

// heVVodar!gniV
// ChangeAll:|:V:|:l
// Reverse:|:!gnil
// InsertSpace:|:5
// Reveal

        Scanner scan = new Scanner(System.in);
        String sifrovanTekst = scan.nextLine();

        while(true){
            String unos = scan.nextLine();
            if (unos.equals("Reveal")) break;
            String[] delovi = unos.split(":\\|:");
            String komanda = delovi[0];
            switch (komanda){
                case "InsertSpace":
                    sifrovanTekst = inserSpace(sifrovanTekst, Integer.parseInt(delovi[1]));

                    break;
                case "Reverse":
                    String podString = delovi[1];
                    if (!sifrovanTekst.contains(podString)){
                        System.out.println("error");
                    continue;
                    }
                    sifrovanTekst = reverse(sifrovanTekst,podString);
                    break;
                case "ChangeAll":
                    String podString2 = delovi[1];
                    String zamena = delovi[2];
                    sifrovanTekst = sifrovanTekst.replaceAll(podString2,zamena);
                    break;
            }


            System.out.println(sifrovanTekst);
        }
        System.out.printf("You have a new text message: %s",sifrovanTekst);
    }
}