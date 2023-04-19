import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Domaci02 {
    public static class Article{
    private String title;
    private String content;
    private String author;
    public Article(String title, String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Article(String text){
        String[] delovi = text.split(", ");
        this.title = delovi[0];
        this.content = delovi[1];
        this.author = delovi[2];
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",this.title,this.content,this.author);
    }
    public void edit(String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newName){
        this.title = newName;
    }
}
    public static void main(String[] args) {
//        Article prvi = new Article("title","content", "author");
//        System.out.println(prvi);
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        Article trenutni = new Article(text);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String komanda = scan.nextLine();
            String[] deloviKomande = komanda.split(": ");
            komanda = deloviKomande[0];
            String novaVrednost = deloviKomande[1];
            switch (komanda){
                case "Edit":
                    trenutni.edit(novaVrednost);
                    break;
                case "ChangeAuthor":
                    trenutni.changeAuthor(novaVrednost);
                    break;
                case "Rename":
                    trenutni.rename(novaVrednost);
                    break;
            }
        }
        System.out.println(trenutni);
    }
}