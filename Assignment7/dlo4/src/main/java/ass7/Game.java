package ass7;

import java.util.Scanner;
import java.util.Random;

//Create a game of rock paper scissors
// The game should allow user to play multiple rounds
// The game should keep track of the score
// The game should allow user to quit at any time
// The game should display the score at the end of each round
// The game should display the final score at the end of the game
// AI PROMPT: Create a method to get the user's choice
// - Print a message asking for the user's choice
// - Get the user's choice from the console and convert it to lowercase
// - Validate input to make sure it is either rock, paper, or scissors
// - If the input is invalid, print an error message and ask for the user's choice again

public class Game {
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        int userScore = 0;
        int computerScore = 0;

        while (true) {
            String userChoice = getUserChoice();
            if (userChoice.equals("quit")) {
                break;
            }
            String computerChoice = getComputerChoice();
            System.out.println("You chose " + userChoice + ", the computer chose " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }
            System.out.println("Your score: " + userScore + ", Computer score: " + computerScore);
        }
        System.out.println("Your final score: " + userScore + ", Computer final score: " + computerScore);
    }

    private String getUserChoice() {
        System.out.print("Enter your choice (rock, paper, scissors, or quit): ");
        return scanner.nextLine().toLowerCase();
                    }

    private String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}