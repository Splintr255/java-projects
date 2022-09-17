import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_one;
        int num_two;
        int sum;
        int ask;

        //get random numbers
        Random random_num = new Random();
        num_one = random_num.nextInt(101);
        num_two = random_num.nextInt(101);
        sum = num_one + num_two;
        System.out.println(sum);

        //gain the input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sum of " + num_one + " and " + num_two);
        ask = input.nextInt();

        if(ask == sum){
            System.out.println("Congrats you are correct!");
        } else {
            System.out.println("You have sadly been mistaken.");
        }
    }
}