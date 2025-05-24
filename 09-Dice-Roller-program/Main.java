import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int no_of_Dices;
        int total=0;
        int i;

        System.out.println("Enter the no of dices you want: ");
        no_of_Dices = scanner.nextInt();

        if (no_of_Dices > 0) {
            System.out.println("You have rolled "+ no_of_Dices + " of Dices");

            for(i = 0; i < no_of_Dices; i++){
                int roll = random.nextInt(1, 7);
                printdie(roll);
                System.out.println("You have rolled: "+ roll);
                total = total + roll;
                
            } 
            
            
        }
        else{
            System.out.println("You should roll some dices greater than 0");
        }

        scanner.close();


    }
    static void printdie(int roll){

        String dice1 =   "-----\r\n" + //
                        "|   |\r\n" + //
                        "| o |\r\n" + //
                        "|   |\r\n" + //
                        "-----\r\n" + //
                        "";
        String dice2 = "-----\r\n" + //
                        "|o  |\r\n" + //
                        "|   |\r\n" + //
                        "|  o|\r\n" + //
                        "-----\r\n" + //
                        "";
        String dice3 = "-----\r\n" + //
                        "|o  |\r\n" + //
                        "| o |\r\n" + //
                        "|  o|\r\n" + //
                        "-----";
        String dice4 = "-----\r\n" + //
                        "|o o|\r\n" + //
                        "|   |\r\n" + //
                        "|o o|\r\n" + //
                        "-----\r\n" + //
                        "";
        String dice5 = "-----\r\n" + //
                        "|o o|\r\n" + //
                        "| o |\r\n" + //
                        "|o o|\r\n" + //
                        "-----\r\n" + //
                        "";
        String dice6 = "-----\r\n" + //
                        "|o o|\r\n" + //
                        "|o o|\r\n" + //
                        "|o o|\r\n" + //
                        "-----\r\n" + //
                        "";              
        switch (roll) {
            case 1:System.out.println(dice1);
                break;
            case 2:System.out.println(dice2);
                break;
            case 3:System.out.println(dice3);
                break;
            case 4:System.out.println(dice4);
                break;
            case 5:System.out.println(dice5);
                break;
            case 6:System.out.println(dice6);
                break;
        
            default:
            System.out.println("Wrong roll");
                break;
        }                   
    }
    
}
