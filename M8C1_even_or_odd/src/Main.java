import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myNum;
        boolean myNumIsEven;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        myNum = input.nextBoolean();

        myNumIsEven = isEven(myNum);

        System.out.println(myNumIsEven);
    }

    static boolean isEven(int number) {
        boolean isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }

}