import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak04 {
    static class Song {
        private String type;
        private String name;
        private String time;

        public Song(String type, String name, String time){
            this.type = type;
            this.name = name;
            this.time = time;
        }
        public static void ispisiTYPE(ArrayList<Song> lista , String type){
            for(Song s: lista){
                if (s.type.equals(type)) System.out.println(s.name);
            }
        }
        public static void ispisiTYPEall(ArrayList<Song>lista){
            for(Song s: lista){
                System.out.println(s.name);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Song> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();
            String[] delovi = text.split("_");
            Song pesma = new Song(delovi[0],delovi[1],delovi[2]);
            lista.add(pesma);
        }
        String komanda = scan.nextLine();
        if (komanda.equals("all")) Song.ispisiTYPEall(lista);
        else Song.ispisiTYPE(lista,komanda);
    }
}