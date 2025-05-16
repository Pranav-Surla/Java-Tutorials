import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;
        char currency_symbol = '$';

        System.out.print("Enter the name of the item: ");
        item = scanner.nextLine();
        System.out.print("Enter the price of the item: ");
        price = scanner.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("The Total amount is " + currency_symbol + total);

        scanner.close();
        


    }

}
