import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Domaci06 {
    static class User {
        private String name;
        private int id;
        private int age;
        public User(String name,int id,int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }
        public User(String text){
            String[] delovi = text.split(" ");
            this.name = delovi[0];
            this.id = Integer.parseInt(delovi[1]);
            this.age = Integer.parseInt(delovi[2]);
        }
        public int getAge(){ return this.age; }

        @Override
        public String toString() {
            return String.format("%s with ID: %d is %d years old.",this.name,this.id,this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
//        User k1 = new User("Stefan",123456,27);
//        System.out.println(k1);
        while (true){
            String text = scan.nextLine();
            if (text.equals("End"))break;
            User privremeni = new User(text);
            list.add(privremeni);
        }
        list.sort(Comparator.comparingInt(User::getAge));
        for (User s : list) System.out.println(s);



    }
}