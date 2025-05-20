import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            double weight, New_weight;
            System.out.println("Weight converter calculator");

            System.out.println("Enter '1' convertion from the LBS to KG");
            System.out.println("Enter '2' convertion from KG to LBS");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();


            if(choice==1){

                New_weight = weight/2.2046;
                System.out.printf("The converted weight is %.2fkg",New_weight);

            }
            else if(choice==2){
                New_weight = weight*2.2046;
                System.out.printf("The converted weight is %.2flbs",New_weight);

            }
            else{
                System.out.println("You have entered wrong choice");

            }

            scanner.close();
        
    }
    
}
