import java.util.Scanner;
import java.util.Random;
public class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"ROCK","PAPER","SCISSORS" };
        String user_choice, computer_choice;
        String play_again;

        do{

        System.out.print("Enter your choice(Rock,Paper,Scissors): ");
        user_choice = scanner.nextLine().toUpperCase();

        print_choice(user_choice);



        if (!user_choice.equals("ROCK") &&
        !user_choice.equals("PAPER") &&
        !user_choice.equals("SCISSORS")) {
            System.out.println("YOU HAVE ENTERED A WRONG CHOICE!!");
            play_again = "yes";
            continue;
        }

        computer_choice = choices[random.nextInt(3)];
        System.out.println("Computer choice: "+ computer_choice);
        print_choice(computer_choice);
        
        if (user_choice.equals(computer_choice)) {
            System.out.println("Its a tie");
            
        }
        else if (user_choice.equals("ROCK") && computer_choice.equals("SCISSORS")) {
            System.out.println("You Win");
            
        }
        else if (user_choice.equals("PAPER")&& computer_choice.equals("ROCK")) {
            System.out.println("You Win");
        }
        else if (user_choice.equals("SCISSORS")&& computer_choice.equals("PAPER")) {
            System.out.println("You Win");
        }
        else{
            System.out.println("You Lose");
        }

        System.out.print("Do you want to play again(yes/no): ");
        play_again = scanner.nextLine().toLowerCase();

        }while(play_again.equals("yes"));
        System.out.println("Thanks for playing");

        scanner.close();
        
    }

    static void print_choice(String choice){
        String rock =
        "    _______\n"
        + "---'   ____)\n"
        + "      (_____)\n"
        + "      (_____)\n"
        + "      (____)\n"
        + "---.__(___)\n";

        String paper =
        "     _______\n"
        + "---'    ____)____\n"
        + "           ______)\n"
        + "          _______)\n"
        + "         _______)\n"
        + "---.__________)\n";

        String scissors =
        "    _______\n"
        + "---'   ____)____\n"
        + "          ______)\n"
        + "       __________)\n"
        + "      (____)\n"
        + "---.__(___)\n";



        if(choice.equals("ROCK")){
            System.out.println(rock);
        }
        else if(choice.equals("SCISSORS")){
            System.out.println(scissors);
        }
        else if(choice.equals("PAPER")){
            System.out.println(paper);
        }
        else{
            System.out.println("*** INVALID CHOICE ***");
        }
    }
    
}
