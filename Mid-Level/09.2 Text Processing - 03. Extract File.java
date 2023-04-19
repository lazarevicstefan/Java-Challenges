import java.util.Scanner;

public class Domaci03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] delovi = scan.nextLine().split("\\\\");
        String[] file = delovi[delovi.length-1].split("\\.");
        String name = file[0];
        String extension = file[1];
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}