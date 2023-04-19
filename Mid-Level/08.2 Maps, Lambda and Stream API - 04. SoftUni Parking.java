import java.util.LinkedHashMap;
import java.util.Scanner;

public class Domaci04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String tablice = "";
        LinkedHashMap<String,String> automobiliITablice = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String komanda = scan.nextLine();
            String[] delovi = komanda.split(" ");
            String nazivKomanda = delovi[0];
            String username = delovi[1];
            if (nazivKomanda.equals("register")) {
                tablice = delovi[2];
                if(!automobiliITablice.containsKey(username)){
                    automobiliITablice.put(username,tablice);
                    System.out.printf("%s registered %s successfully\n",username,tablice);
                }else {
                    String tabliceTrazene = automobiliITablice.get(username);
                    System.out.printf("ERROR: already registered with plate number %s\n", tabliceTrazene);
                }
            }else {
                if (automobiliITablice.containsKey(username)){
                    System.out.printf("%s unregistered successfully\n",username);
                    automobiliITablice.remove(username);
                }else {
                    System.out.printf("ERROR: user %s not found\n",username);
                }
            }
        }
        automobiliITablice
                .entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s => %s\n",e.getKey(),e.getValue()));
    }
}