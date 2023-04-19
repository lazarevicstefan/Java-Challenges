import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String projectInput = scan.nextLine();
        int rowInput = Integer.parseInt(scan.nextLine());
        int columnsInput = Integer.parseInt(scan.nextLine());

//        Premiere – premiere screening, at a price of 12.00 USD.
//        Normal – standard screening, at a price of 7.50 USD.
//        Discount – screening for children, and students at a reduced to a price of 5.00 USD.
        double total = 0.0;
        if (projectInput.equals("Premiere")){
            total = rowInput * columnsInput * 12.00;
        }else if (projectInput.equals("Normal")){
            total = rowInput * columnsInput * 7.50;
        }else if (projectInput.equals("Discount")){
            total = rowInput * columnsInput * 5.00;
        }
        System.out.printf("%.2f USD",total);
    }
}