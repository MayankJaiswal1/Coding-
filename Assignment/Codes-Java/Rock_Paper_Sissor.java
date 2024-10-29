import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Sissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] str = {"Rock", "Paper", "Sissor"};
        String userChoice = sc.nextLine();
        String ComputerChoice = str[random.nextInt(3)];
        if(userChoice.equals(ComputerChoice)){
            System.out.println("tie");
        }else if(userChoice.equalsIgnoreCase("Rock") && ComputerChoice.equals("Sissor") ||
        userChoice.equalsIgnoreCase("Paper") && ComputerChoice.equals("Rock") ||
        userChoice.equalsIgnoreCase("Sissor") && ComputerChoice.equals("Paper")
        ){
            System.out.println("you win");
        }else{
            System.out.println("computer win");
        }
    }
}
