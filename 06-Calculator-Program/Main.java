import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first_num, second_num, result;
        String operator;

        System.out.println("Calculator Program");

        System.out.print("Enter the first number: ");
        first_num = scanner.nextDouble();
        
        // Consume the leftover newline character after nextDouble()
        scanner.nextLine();     // Without this, nextLine() below would read an empty line


        System.out.print("Enter the operator '+','-','*','/','^': ");
        operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        second_num = scanner.nextDouble();

        switch (operator) {
            case "+":
                result = (first_num) + (second_num);
                System.out.println("The Result: " + result);       
                break;
            case "-":
                result = (first_num) - (second_num);
                System.out.println("The Result: " + result);
                break;
            case "*":
                result = (first_num) * (second_num);
                System.out.println("The Result: " + result);
                break;
            case "/":
                if (second_num == 0) {
                    System.out.println("Denominator cannot be '0'");
                    break;
                }
                result = (first_num) / (second_num);
                System.out.println("The Result: " + result);
                break;
            case "^":
                result = Math.pow(first_num, second_num);
                System.out.println("The Result: " + result);
                break;

            default:
                System.out.println("You have entered a wrong operator");
                break;       
        }

        

        scanner.close();
    }
    
}
