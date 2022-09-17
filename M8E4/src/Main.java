import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice;
            int random;

            //generate a random choice
            Random rand = new Random();
            random = rand.nextInt(0, 3); //generates the choice

            //gain input from the user
            Scanner input = new Scanner(System.in);
            System.out.println("Please choose rock paper or scissors (0 = rock, 1 = paper, 2 = scissors)");
            choice = input.nextInt();

            //if statement choices
            if (choice == 0 && random == 0) {        //draw
                System.out.println("We both chose rock. It's a draw.");
            } else if (choice == 1 && random == 1) { //draw
                System.out.println("We both chose paper. It's a draw.");
            } else if (choice == 2 && random == 2) { //draw
                System.out.println("We both chose scissors. It's a draw.");
            } else if (choice == 0 && random == 1) { //paper beats rock - lose
                System.out.println("You chose rock, I chose paper. Paper wraps rock, you lose.");
            } else if (choice == 0 && random == 2) { //rock crushes scissors - win
                System.out.println("You chose rock, I chose scissors. Rock crushes scissors, you win!");
            } else if (choice == 1 && random == 0) { //paper beats rock - win
                System.out.println("You chose paper, I chose rock. Paper covers rock, you win!");
            } else if (choice == 1 && random == 2) { //paper gets cut by scissors - lose
                System.out.println("You chose paper, I chose scissors. Paper cuts scissors, you lose.");
            } else if (choice == 2 && random == 0) { //scissors is crushed by rock - lose
                System.out.println("You chose scissors, I chose rock. Scissor is crushed by rock, you lose.");
            } else if (choice == 2 && random == 1) { //scissors cuts paper - win
                System.out.println("You chose scissors, I chose paper. Scissors cuts paper, you win!");
            } else {
                System.out.println("I said 'rock, paper, scissors,' aka 0, 1, 2. :/ ");
            }
        }
    }
}