import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Asha Dosa Bank ");

        Double current_balance = 0.0;
        Double deposit, withdraw;
        int i=0;



        while (i != 4) {
            
            System.out.println("The choices:");
            System.out.println("1) Net Amount");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            i = scanner.nextInt();


            if (i == 1) {

                System.out.println("The current balance: " + current_balance);
            }
            else if(i == 2){
                System.out.print("How much amount you would like to Deposit: ");
                deposit = scanner.nextDouble();
                current_balance = current_balance + deposit;
                System.out.println("The Deposit of amount "+ deposit+ " is successful");

            }
            else if (i == 3) {
                System.out.print("How much amount you would like to withdraw: ");
                withdraw = scanner.nextDouble();
                if (withdraw > current_balance) {
                    System.out.println("******************************");
                    System.out.println("YOU HAVE INSUFFICIENT BALANCE");
                    System.out.println("******************************");
                    
                }
                else{
                current_balance = current_balance - withdraw;
                System.out.println("The withdrawl of amount "+ withdraw + " is successfull");
                }
            }
            else if (i == 4.0) {
                System.out.println("Thank you for using our bank!!!");
                
            }
            else {
                System.out.println("YOU HAVE ENTERED A WRONG CHOICE!!");
            }
        
        
        }
        scanner.close();
    }

} 