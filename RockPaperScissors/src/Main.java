import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("This is a rock paper scissors game!" + "\n");
        System.out.print("Choose 1 for rock, 2 for paper, 3 for scissors, or 4 to exit the game." + "\n");
        int user, rock, paper, scissors, playerwins, computerwins, draws;
        user = input.nextInt();

        rock = 1;
        paper = 2;
        scissors = 3;

        playerwins = 0;
        computerwins = 0;
        draws = 0;

        do {
            int computer = (int) ((Math.random() * 3) + 1);

            while (user != rock && user != paper && user != scissors) {
                if (user == 4){
                    System.out.println("Final Score:" + " Wins:" + playerwins + "     Losses:" + computerwins + "     Draws:" + draws);
                    java.lang.System.exit(-0);
                }
                System.out.print("Invalid Answer" + "\n");
                System.out.print("Choose 1 for rock, 2 for paper or 3 for scissors to play again, or 4 to exit the game." + "\n");
                user = input.nextInt();

            }
            if (user == rock && computer == rock) {

                System.out.println("Your choice: Rock     Computer Choice: Rock");
                System.out.println("It's a tie!" + "\n");
                ++draws;
            }

            if (user == rock && computer == paper) {

                System.out.println("Your choice: Rock     Computer Choice: Paper");
                System.out.println("You lose!" + "\n");
                ++computerwins;
            }

            if (user == rock && computer == scissors) {

                System.out.println("Your choice: Rock     Computer Choice: Scissors");
                System.out.println("You win!" + "\n");
                ++playerwins;

            }

            if (user == paper && computer == rock) {

                System.out.println("Your choice: Paper     Computer Choice: Rock");
                System.out.println("You win!" + "\n");
                ++playerwins;
            }

            if (user == paper && computer == paper) {

                System.out.println("Your choice: Paper     Computer Choice: Paper");
                System.out.println("It's a tie!" + "\n");
                ++draws;
                System.out.println("Wins:" + playerwins + "     Losses:" + computerwins + "     Draws:" + draws + "\n");
            }

            if (user == paper && computer == scissors) {

                System.out.println("Your choice: Paper     Computer Choice: Scissors");
                System.out.println("You lose!" + "\n");
                ++computerwins;
            }

            if (user == scissors && computer == rock) {

                System.out.println("Your choice: Scissors     Computer Choice: Rock");
                System.out.println("You lose!" + "\n");
                ++computerwins;
            }

            if (user == scissors && computer == paper) {

                System.out.println("Your choice: Scissors     Computer Choice: Paper");
                System.out.println("You win!" + "\n");
                ++playerwins;
            }

            if (user == scissors && computer == scissors) {

                System.out.println("Your choice: Scissors     Computer Choice: Scissors");
                System.out.println("It's a tie!" + "\n");
                ++draws;
            }
            System.out.println("Wins:" + playerwins + "     Losses:" + computerwins + "     Draws:" + draws  + "\n");
            System.out.println("Choose 1 for rock, 2 for paper or 3 for scissors to play again, or 4 to exit the game.");
            user = input.nextInt();
        } while (user != 4);
        System.out.println("Final Score:" + " Wins:" + playerwins + "     Losses:" + computerwins + "     Draws:" + draws);
    }
}


