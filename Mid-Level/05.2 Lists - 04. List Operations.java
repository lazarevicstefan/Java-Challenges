import java.util.ArrayList;
import java.util.Scanner;

public class Domaci04 {
    public static void unesiListu (ArrayList<Integer> brojevi, String text){
        String[] delovi = text.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }

    }
    public static void ispisiListu (ArrayList<Integer> brojevi){
        for(int broj : brojevi){
            System.out.printf("%d ",broj);
        }
        System.out.println();
    }
    public static void add(ArrayList<Integer> brojevi , int broj){
        brojevi.add(broj);
    }
    public static void insert(ArrayList<Integer> brojevi , int broj , int index){
        brojevi.add(index,broj);
    }
    public static void remove(ArrayList<Integer> brojevi , int index){
        brojevi.remove(index);
    }
    public static void shiftLeft (ArrayList<Integer> brojevi, int turnleft){
        for (int i = 0; i < turnleft; i++) {
            int a = brojevi.get(0);
            brojevi.remove(0);
            brojevi.add(brojevi.size(), a);
        }
    }
    public static void shiftRight (ArrayList<Integer> brojevi, int turnright){
        for (int i = 0; i < turnright; i++) {
            int a = brojevi.get(brojevi.size()-1);
            brojevi.remove(brojevi.size()-1);
            brojevi.add(0,a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        ArrayList<Integer> brojevi = new ArrayList<>();
        unesiListu(brojevi,text);
        while (true){
            String[] komanda = scan.nextLine().split(" ");
            if (komanda[0].equals("End")) break;

            switch (komanda[0]){
                case "Add":
                    add(brojevi,Integer.parseInt(komanda[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(komanda[2])> brojevi.size()-1|| Integer.parseInt(komanda[2])<0){
                        System.out.println("Invalid index");
                        break;
                    }
                    insert(brojevi,Integer.parseInt(komanda[1]),Integer.parseInt(komanda[2]));
                    break;
                case "Remove":
                    if (Integer.parseInt(komanda[1])> brojevi.size()-1|| Integer.parseInt(komanda[1])<0){
                        System.out.println("Invalid index");
                        break;
                    }
                    remove(brojevi,Integer.parseInt(komanda[1]));
                    break;
                case "Shift":
                    switch (komanda[1]){
                        case "right":
                            shiftRight(brojevi,Integer.parseInt(komanda[2]));
                            break;
                        case "left":
                            shiftLeft(brojevi,Integer.parseInt(komanda[2]));
                            break;
                    }
                    break;
            }
        }
        ispisiListu(brojevi);
    }
}