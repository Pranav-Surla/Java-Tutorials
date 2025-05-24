import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Questions = {"1. Which of the following is the brain of the computer?",
                              "2. What does RAM stand for?",
                              "3. Which of the following is NOT an input device?",
                              "4. What is the permanent memory built into your computer called?",
                              "5. Which software is used to browse the internet?"};
        
        String[][] options = {{"1) Monitor\n" + //
                            "2) Keyboard\n" + //
                            "3) Central Processing Unit (CPU)\n" + //
                            "4) Mouse"},
                            {"1) Read Access Memory\n" + //
                             "2) Random Access Memory\n" + //
                             "3) Run Access Memory\n" + //
                             "4) Read And Modify"},
                            {"1) Scanner\n" + //
                             "2) Keyboard\n" + //
                             "3) Monitor\n" + //
                             "4) Mouse"},
                            {"1) RAM\n" + //
                             "2) ROM\n" + //
                             "3) Cache\n" + //
                             "4) Hard Drive"},
                            {"1) MS Word\n" + //
                             "2) Google Chrome\n" + //
                             "3) Adobe Photoshop\n" + //
                             "4) VLC Media Player"}};
        int[] answers = {3,2,3,2,2};
        int score = 0;
        int guess;
        System.out.println("Welcome to the Quiz about Computer");

        for(int i = 0; i < Questions.length; i++){
            System.out.println(Questions[i]);

            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.println("Enter your Gusses for the above questions:");
            guess = scanner.nextInt();

            if (guess == answers[i]){

                System.out.println("Correct Answer");
                score++;
                
            }
            else{
               
                System.out.println("Wrong Answer");
            }
            System.out.println("The Final score of your Quiz: " + score);

        }

        scanner.close();
    }
    
}
