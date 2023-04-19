import java.util.Scanner;

public class main {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int brojStepeniInput = Integer.parseInt(scan.nextLine());
        String dobaDanaInput = scan.nextLine();
        String odeca = "";
        String obuca = "";
        if(brojStepeniInput >=10 && brojStepeniInput <=18){
            if (dobaDanaInput.equals("Morning")){
                odeca = "Sweatshirt";
                obuca = "Sneakers";
            }else if (dobaDanaInput.equals("Afternoon")||dobaDanaInput.equals("Evening") ){
                odeca = "Shirt";
                obuca = "Moccasins";
            }
        } else if (brojStepeniInput >18 && brojStepeniInput <=24){
            if (dobaDanaInput.equals("Morning")||dobaDanaInput.equals("Evening")){
                odeca = "Shirt";
                obuca = "Moccasins";
            }else if (dobaDanaInput.equals("Afternoon")){
                odeca = "T-Shirt";
                obuca = "Sandals";
            }
        }else if (brojStepeniInput >=25){
                if (dobaDanaInput.equals("Morning")){
                    odeca = "T-Shirt";
                    obuca = "Sandals";
                }else if (dobaDanaInput.equals("Afternoon")){
                    odeca = "Swim Suit";
                    obuca = "Barefoot";
                }else if(dobaDanaInput.equals("Evening")){
                    odeca = "Shirt";
                    obuca = "Moccasins";
                }
            }
            System.out.printf("It's %d degrees, get your %s and %s.",brojStepeniInput,odeca,obuca);

        }
    }