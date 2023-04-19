import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Domaci04 {
    static class Student{
        private String firstName;
        private String lastName;
        private double grade;
    public Student(String firstName,String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public Student (String text){
        String[] delovi = text.split(" ");
        this.firstName = delovi[0];
        this.lastName = delovi[1];
        this.grade = Double.parseDouble(delovi[2]);
    }
    public double getGrade(){
        return this.grade;
    }
        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> lista = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();
            Student trenutni = new Student(text);
            lista.add(trenutni);
        }

        lista.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        for (Student s:lista) System.out.println(s);

    }
}