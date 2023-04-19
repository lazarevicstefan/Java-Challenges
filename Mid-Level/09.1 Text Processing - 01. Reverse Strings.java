import java.util.Scanner;

public class Zadatak01 {
    public static StringBuilder okreniString (String tekst){
        int n = tekst.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0 ; i--) {
            sb.append(tekst.charAt(i));
        }
        return  sb;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String unos = scan.nextLine();
            if(unos.equals("end"))break;
            System.out.printf("%s = %s\n",unos,okreniString(unos));
        }
    }
}