import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter adjective1: ");
        String adj1 = scanner.nextLine();
        System.out.print("Enter adjective2: ");
        String adj2 = scanner.nextLine();
        System.out.print("Enter verb1: ");
        String verb1 = scanner.nextLine();
        System.out.print("Enter verb2: ");
        String verb2 = scanner.nextLine();
        System.out.print("Enter noun1: ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter noun2: ");
        String noun2 = scanner.nextLine();


        System.out.println("\nOne " + adj1 + " morning, a "+ adj2+ " traveler decided to "+ verb1 + " through the forest. Along the way,");
        System.out.println(" they discovered a mysterious "+ noun1 +". Curious, they chose to " + verb2 + " closer."); 
        System.out.println("Suddenly, a " + noun2 + " appeared, changing everything.");

        scanner.close();
    }
}