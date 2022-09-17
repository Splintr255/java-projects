import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_of_dice;
        int dice_1;
        int dice_2;
        int dice_3;

        //set up a random generator
        Random random = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        dice_1 = random.nextInt(0,6) + 1;
        dice_2 = random2.nextInt(0,6) + 1;
        dice_3 = random3.nextInt(0,6) + 1;


        //get input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of dice to roll: ");
        num_of_dice = input.nextInt();

        if (num_of_dice == 1) {
            System.out.println("Your dice landed on:");
            System.out.println(dice_1);
        } else if (num_of_dice == 2) {
            System.out.println("Your dice landed on:");
            System.out.println(dice_1);
            System.out.println(dice_2);
        } else if (num_of_dice == 3) {
            System.out.println("Your dice landed on:");
            System.out.println(dice_1);
            System.out.println(dice_2);
            System.out.println(dice_3);
        } else {
            System.out.println("That is not 1-3. Please try again.");
        }


    }
}