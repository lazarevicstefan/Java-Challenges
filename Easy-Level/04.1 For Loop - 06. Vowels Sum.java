import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String unos = scan.nextLine();
        int ukupnibroj = 0;
        int brojkaraktera = unos.length();
        for(int i = 0; i <brojkaraktera;i++){
            char slovo = unos.charAt(i);
            if(slovo == 'a'){
                ukupnibroj +=  1;
            }else if (slovo == 'e'){
                ukupnibroj += 2;
            }else if (slovo == 'i'){
                ukupnibroj += 3;
            }else if (slovo == 'o'){
                ukupnibroj += 4;
            }else if (slovo == 'u'){
                ukupnibroj += 5;
            }

        }
System.out.println(ukupnibroj);
    }
}