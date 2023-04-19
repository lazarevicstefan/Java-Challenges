import java.util.Scanner;

public class Exercise_05_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int widthFreeSpace=Integer.parseInt(sc.nextLine());
        int lengthFreeSpace=Integer.parseInt(sc.nextLine());
        int heightFreeSpace=Integer.parseInt(sc.nextLine());
        int zapremina=widthFreeSpace*lengthFreeSpace*heightFreeSpace;
        int brojMesta=0;
        while(true){
            String command=sc.nextLine();

            if(command.equals("Done")){
                int ostaloMesta=zapremina-brojMesta;
                System.out.println(ostaloMesta+" Cubic meters left.");
                return;
            }
            brojMesta=brojMesta+Integer.parseInt(command);
            if(brojMesta>zapremina){
                int fali=brojMesta-zapremina;
                System.out.printf("No more free space! You need %d Cubic meters more.",fali);
                break;
            }

        }

    }
}