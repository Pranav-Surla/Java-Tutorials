import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatue, New_temperature;
        String choice;

        System.out.println("Temperature Converter");
        
        System.out.print("Enter to which metric it should be converted to? (C or F): ");
        choice = scanner.next().toUpperCase();

        System.out.print("Enter the temperature: ");
        temperatue = scanner.nextDouble();

        New_temperature = (choice.equals("C")) ? ((temperatue - 32) * 5/9) : ((temperatue * 9/5) + 32);
        System.out.println("The converted Temperature: " + New_temperature + "°" + choice);

        scanner.close();
    }
}
