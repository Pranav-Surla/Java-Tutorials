import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double principal, amount, rate_of_interest, time;
        int no_of_compounds_per_year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Rate of interest(%): ");
        rate_of_interest = scanner.nextDouble() / 100;
        System.out.print("Enter the Total Duration(Years): ");
        time = scanner.nextDouble();
        System.out.print("Enter the no of compounds per year: ");
        no_of_compounds_per_year = scanner.nextInt();


        amount = principal * Math.pow(1 + rate_of_interest/no_of_compounds_per_year , no_of_compounds_per_year * time);
        System.out.println("The total Amount : " + amount);
        

        scanner.close();


    }
    
}
