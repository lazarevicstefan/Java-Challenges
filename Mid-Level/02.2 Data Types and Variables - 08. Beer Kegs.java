import java.util.Scanner;

public class Domaci08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short n = Short.parseShort(scan.nextLine());
        double trenutnival = Integer.MIN_VALUE;
        String trenutniString = "";
        for (int i = 0; i < n; i++) {
            String model_keg = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double sad = Math.PI * (radius*radius) *height;
            if (trenutnival > sad ){
                
            }else{
                trenutnival = sad;
                trenutniString = model_keg;
            }
        }
        System.out.println(trenutniString);
    }
}