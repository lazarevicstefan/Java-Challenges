import java.util.Scanner;

// abv>1>1>2>2asdasd
public class Domaci07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int ukupnoNarednihKarakteraZaBrisanje = 0;

        StringBuilder resenje = new StringBuilder();


        for (int i = 0; i < sb.length(); i++) {
            char trenutniKarakter = sb.charAt(i);
//            System.out.println(trenutniKarakter);

            if (trenutniKarakter == '>'){
                ukupnoNarednihKarakteraZaBrisanje = ukupnoNarednihKarakteraZaBrisanje + Integer.parseInt(sb.charAt(i + 1) + "");
                resenje.append(trenutniKarakter);
            }else if (ukupnoNarednihKarakteraZaBrisanje > 0){
                ukupnoNarednihKarakteraZaBrisanje--;
            }else {
                resenje.append(trenutniKarakter);
            }


//
//            if (trenutniKarakter == '>'){
//                int brojKarakteraZaBrisanje = Integer.parseInt(sb.charAt(i + 1) + "");
//                ukupnoNarednihKarakteraZaBrisanje = ukupnoNarednihKarakteraZaBrisanje + brojKarakteraZaBrisanje;
//                System.out.println(ukupnoNarednihKarakteraZaBrisanje);
//                }
//            while (trenutniKarakter != '>' && ukupnoNarednihKarakteraZaBrisanje > 0){
//                sb.deleteCharAt(i);
//                i--;
//                ukupnoNarednihKarakteraZaBrisanje--;
//            }
        }
        System.out.println(resenje);
    }
}