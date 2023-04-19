import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadatak01 {
    public static void ispisiMapu( TreeMap<Double,Integer> unos){
        for (Map.Entry<Double, Integer> ulaz : unos.entrySet()){
            double kljuc = ulaz.getKey();
            Integer vrednost = ulaz.getValue();
            System.out.printf("%.0f -> %d\n",kljuc,vrednost);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nums = Arrays.stream(scan.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();


        TreeMap<Double, Integer> ponavljanjeBrojeva = new TreeMap<>();

        for (double d : nums) {
            if (!ponavljanjeBrojeva.containsKey(d)){
                ponavljanjeBrojeva.put(d,1);
            }
            else {
                int trenutnoStasnje = ponavljanjeBrojeva.get(d);
                ponavljanjeBrojeva.put(d,trenutnoStasnje+1);
            }
        }
        ispisiMapu(ponavljanjeBrojeva);

    }
}