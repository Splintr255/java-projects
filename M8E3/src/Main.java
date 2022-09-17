import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heads_tails;
        int coin;

        //gain input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Heads or tails? (1 for heads and 0 for tails)");
        heads_tails = input.nextInt();

        //generate the coin toss
        Random rand = new Random();
        coin = rand.nextInt(0,2);

        //generate responses based off choice
        if (coin == 0 && heads_tails == 0) {
            System.out.println("It was Tails! You guessed correct! Nice!");
        } else if (coin == 1 && heads_tails == 1) {
            System.out.println("It was Heads! You guessed correct! Good job!");
        } else if (coin == 0 && heads_tails == 1) {
            System.out.println("It was Tails. Better luck next time");
        } else if (coin == 1 && heads_tails == 0) {
            System.out.println("It was Heads. Better luck next time.");
        } else {
            System.out.println("I asked for 1 or 0 :/");
        }




    }
}