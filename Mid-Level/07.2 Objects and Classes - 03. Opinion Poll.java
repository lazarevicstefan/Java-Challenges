import java.util.ArrayList;
import java.util.Scanner;

public class Domaci03 {
    static class Person {
    private String ime;
    private int godineOsobe;
    public Person(String ime,int godineOsobe){
        this.ime = ime;
        this.godineOsobe = godineOsobe;
    }
    @Override
    public String toString() {
        return String.format("%s - %d", this.ime,this.godineOsobe);
    }
    public boolean isOlderThan30 (){ return this.godineOsobe > 30; }
    public Person(String text){
        String[] delovi = text.split(" ");
        String ime = delovi[0];
        int godine = Integer.parseInt(delovi[1]);
        this.ime = ime;
        this.godineOsobe = godine;
    }


}
    public static void main(String[] args) {
//        Person p1 = new Person("Stefan",27);
//        System.out.println(p1);
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> lista = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String text  = scan.nextLine();
            Person trenutni = new Person(text);
            lista.add(trenutni);
        }
        for(Person p : lista){
            if (p.isOlderThan30()) System.out.println(p);
        }


    }
}