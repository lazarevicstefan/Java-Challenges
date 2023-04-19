import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vezbe05 {
    public static String parniBrojevi (String[] broj){
        String parniBrojevi = "";
        for (int i = 0; i < broj.length; i++) {
            if (Integer.parseInt(broj[i]) % 2 == 0){
                parniBrojevi = parniBrojevi + broj[i] + " ";
            }
        }
        return parniBrojevi;
    }
    public static String neparniBrojevi (String[] broj){
        String neparniBrojevi = "";
        for (int i = 0; i < broj.length; i++) {
            if (Integer.parseInt(broj[i]) % 2 == 1){
                neparniBrojevi = neparniBrojevi + broj[i] + " ";
            }
        }
        return neparniBrojevi;
    }
    public static String getSum (String[] broj){
        String sum = "";
        int sumint = 0;
        for (int i = 0; i < broj.length; i++) {
                sumint = sumint + Integer.parseInt(broj[i]);
        }
        sum = String.valueOf(sumint);
        return sum;
    }
    public static String filter (String[] broj, String znak, int granica){
        String ispis = "";
        if (znak.equals("<")){
            for (int i = 0; i < broj.length; i++) {
                if (Integer.parseInt(broj[i]) < granica){
                    ispis = ispis + broj[i] + " ";
                }
            }
        }else if(znak.equals(">")){
            for (int i = 0; i < broj.length; i++) {
                if (Integer.parseInt(broj[i]) > granica){
                    ispis = ispis + broj[i] + " ";
                }
            }
        }else if(znak.equals(">=")){
            for (int i = 0; i < broj.length; i++) {
                if (Integer.parseInt(broj[i]) >= granica){
                    ispis = ispis + broj[i] + " ";
                }
            }
        }else if(znak.equals("<=")){
            for (int i = 0; i < broj.length; i++) {
                if (Integer.parseInt(broj[i]) <= granica){
                    ispis = ispis + broj[i] + " ";
                }
            }
        }
        return ispis;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] unos = scan.nextLine().split(" ");
        ArrayList<String> listaBrojeva = new ArrayList<>(Arrays.asList(unos));

        while (true){
            String[] komanda = scan.nextLine().split(" ");
            if (komanda[0].equals("end"))return;
            switch (komanda[0]){
                case "Contains":
                    boolean rez = listaBrojeva.contains(komanda[1]);
                    if(rez) System.out.println("Yes");
                    else System.out.println("No such number");
                    break;
                case "Print":
                    if (komanda[1].equals("even")) System.out.println(parniBrojevi(unos));
                    else System.out.println(neparniBrojevi(unos));
                    break;
                case "Get":
                    if (komanda[1].equals("sum")){
                        System.out.println(getSum(unos));
                    }
                    break;
                case "Filter":
                    int a = Integer.parseInt(komanda[2]);
                    System.out.println(filter(unos,komanda[1],a));
                    break;
            }
        }
    }
}