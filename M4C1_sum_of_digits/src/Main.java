import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base_ten = 10;
        int user_input;
        int my_sum = 0;
        int new_user_input;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 0-1000");
        user_input = input.nextInt();
        new_user_input = user_input;
        input.close();

            //math calculating
        if (user_input < 1001) {
            while (user_input > 0) {
                int individual_int = user_input % base_ten; //pull out the base 10 nums
                my_sum += individual_int; // add it to a sum number
                user_input = user_input / base_ten; //remove the number from the long user input int

                System.out.println("The sum of the digits " + new_user_input + " is " + my_sum);
            }
        } else {
            System.out.println("I asked for a number from 0-1000 :/");
        }
    }
}