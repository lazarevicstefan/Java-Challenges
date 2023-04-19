import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak05 {
    static class Student {
        /** Atributi klase **/
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        /** Konstruktor klase dole**/
        public Student (String fn, String ln, int age, String city){
            this.firstName = fn;
            this.lastName = ln;
            this.age = age;
            this.city = city;
        }
        public void predstaviSe(){
//            System.out.printf("Ime i Prezime: %s %s \nGodine: %d\nGrad: %s\n",
//                    this.firstName,this.lastName,this.age,this.city);
            System.out.printf("%s %s is %d years old\n",this.firstName,this.lastName,this.age);
        }
        public void setAge(int newAge){
            this.age = newAge;
        }
        public int getAge(){
            return this.age;
        }
        public void setCity(String newCity){
            this.city = newCity;
        }
        public String getCity(){
            return this.city;
        }
        public static void ispisStudenteIzGrada (ArrayList<Student> studenti , String gradKojiTrazimo){
            for(Student s: studenti){
                if (s.getCity().equals(gradKojiTrazimo)){
                    s.predstaviSe();
                }
            }


        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Student s1 = new Student("Stefan","Lazarevic",27,"Leskovac");
//        s1.predstaviSe();
        ArrayList<Student> studenti = new ArrayList<>();
        while (true){
            String komanda = scan.nextLine();
            if (komanda.equals("end"))break;
            String[] delovi = komanda.split(" ");
            String firstName = delovi[0];
            String lastName = delovi[1];
            int age = Integer.parseInt(delovi[2]);
            String city = "";
            for (int i = 3; i < delovi.length; i++){ /// spajamo sve od pozicije 3 do kraja za grad
                if (i != delovi.length-1) city += delovi[i]+ " ";
                else city += delovi[i];
            }


            Student noviStrudent = new Student(firstName,lastName,age,city);
//            noviStrudent.predstaviSe();
            studenti.add(noviStrudent);
        }
        String gradKojiTrazimo = scan.nextLine();
        Student.ispisStudenteIzGrada(studenti,gradKojiTrazimo);



//        for (Student s : studenti) s.predstaviSe();
    }
}