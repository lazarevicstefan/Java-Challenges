import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Domaci01 {
    public static boolean isValidUserName (String username){
        int n = username.length();
        if (n<3 || n>16) return false;
        for (int i = 0; i < n; i++) {
            char trenutni = username.charAt(i);
        if (!Character.isLetterOrDigit(trenutni) && trenutni != '-' && trenutni != '_') return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> username = (ArrayList<String>) Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        for (String a : username){
            if (isValidUserName(a)) System.out.println(a);
        }



    }
}