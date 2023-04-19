import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pocetniBroj = Integer.parseInt(scan.nextLine());
        int krajnjiBroj = Integer.parseInt(scan.nextLine());

        String pocetniBrojText = "" + pocetniBroj;
        String krajnjiBrojText = "" + krajnjiBroj;

        int hiljadePocetni = Integer.parseInt("" + pocetniBrojText.charAt(0));
        int stotinePocetni = Integer.parseInt("" + pocetniBrojText.charAt(1));
        int deseticePocetni = Integer.parseInt("" + pocetniBrojText.charAt(2));
        int jedinicePocetni = Integer.parseInt("" + pocetniBrojText.charAt(3));

        int hiljadeKrajnji = Integer.parseInt("" + krajnjiBrojText.charAt(0));
        int stotineKrajnji = Integer.parseInt("" + krajnjiBrojText.charAt(1));
        int deseticeKrajnji = Integer.parseInt("" + krajnjiBrojText.charAt(2));
        int jediniceKrajnji = Integer.parseInt("" + krajnjiBrojText.charAt(3));


        for (int hiljade = hiljadePocetni; hiljade <= hiljadeKrajnji; hiljade++) {
            for (int stotine = stotinePocetni; stotine <= stotineKrajnji; stotine++) {
                for (int desetice = deseticePocetni; desetice <= deseticeKrajnji; desetice++) {
                    for (int jedinice = jedinicePocetni; jedinice <= jediniceKrajnji; jedinice++) {
                        if (hiljade % 2 != 0 && stotine % 2 != 0 && desetice % 2 != 0 && jedinice % 2 != 0) {
                            System.out.printf("%d%d%d%d ", hiljade, stotine, desetice, jedinice);

                        }
                    }
                }
            }
        }


    }
}