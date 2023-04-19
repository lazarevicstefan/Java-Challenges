import java.util.*;

public class Vezba07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] unos = scan.nextLine().split(" ");
        Integer[] unosInt = new Integer[unos.length];
        for (int i = 0; i < unos.length; i++) {
            unosInt[i] = Integer.parseInt(unos[i]);
        }
        ArrayList<Integer> nizUnos = new ArrayList<>(List.of(unosInt));
        nizUnos.removeIf(n -> n < 0 );
        Collections.reverse(nizUnos);
        if (nizUnos.size() == 0) {
            System.out.println("empty");
        return;}
        for (Integer a : nizUnos){
            System.out.printf("%d ",a);
        }


    }
}