import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int newNumber;

        int random_no = random.nextInt(1,101);
        int turns = 5;
        // System.out.println("The Random number: " + random_no);

        while (turns > 0) {
            System.out.println("No of turns left = " + turns);
            System.out.print("Enter a number: ");
            newNumber = scanner.nextInt();
            if (random_no < newNumber) {
                System.out.println("Your Guess is high try again");
                
            }
            else if (random_no == newNumber) {
                System.out.println("You have entered the correct number");
                break;
            }
            else{
                System.out.println("Your Guess is low try again");
            }
            turns--;
        }
        if (turns == 0) {
            System.out.println("You are out of turns YOU LOSE!!");
            System.out.println("The correct number is " + random_no);
        }
        
        System.out.println("The Game is over");

        scanner.close();
    }
    
}
