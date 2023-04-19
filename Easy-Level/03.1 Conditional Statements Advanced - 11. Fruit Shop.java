import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String fruitInput = scan.nextLine();
        String dayInWeek = scan.nextLine();
        Double kolicinaInput = Double.parseDouble(scan.nextLine());
        double cena = -1;

        if (dayInWeek.equals("Monday")||dayInWeek.equals("Tuesday")||dayInWeek.equals("Wednesday")
                ||dayInWeek.equals("Thursday")||dayInWeek.equals("Friday")){
            if(fruitInput.equals("banana")){
                cena = 2.50;
            }else if (fruitInput.equals("apple")){
                cena = 1.20;
            }else if (fruitInput.equals("orange")){
                cena = 0.85;
            }else if (fruitInput.equals("grapefruit")){
                cena = 1.45;
            }else if (fruitInput.equals("kiwi")){
                cena = 2.70;
            }else if (fruitInput.equals("pineapple")){
                cena = 5.50;
            }else if (fruitInput.equals("grapes")){
                cena = 3.85;
            }else System.out.println("error");

        }else if (dayInWeek.equals("Saturday")||dayInWeek.equals("Sunday")){
            if(fruitInput.equals("banana")){
                cena = 2.70;
            }else if (fruitInput.equals("apple")){
                cena = 1.25;
            }else if (fruitInput.equals("orange")){
                cena = 0.90;
            }else if (fruitInput.equals("grapefruit")){
                cena = 1.60;
            }else if (fruitInput.equals("kiwi")){
                cena = 3.00;
            }else if (fruitInput.equals("pineapple")){
                cena = 5.60;
            }else if (fruitInput.equals("grapes")){
                cena = 4.20;
            }
        }else System.out.println("error");
        if (cena != -1){
        double total = cena * kolicinaInput;
        System.out.printf("%.2f",total);}

        }

    }