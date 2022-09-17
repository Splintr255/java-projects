import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        String randomWord;
        String userGuess;
        int wordIndex;
        int commaIndex = 0;
        int wrongGuessCount = 0;
        boolean quit;
        boolean gameOver;
        boolean invalidEntry;
        String playAgain;
        String usedLetters;
        /**
         * The following string is a list of 28 words separated by commas
         * individual words for the game will be extracted as substrings
         */
        String wordList = " ,Ski,Arctic,Mittens,Slippery,Storm,Windy,Cold,Shiver,Blizzard," +
                "Fireplace,Quilt,Sleet,Snowman,Sled,Sweater,Boots,Hail,Gust,Icy,Frozen,Hoodie," +
                "Melt,Scarf,Gloves,Icicle,Dreary,Flannel,Log,";

        do {
            usedLetters = "";
            quit = false;
            gameOver = false;
            invalidEntry = false;
            wrongGuessCount = 0;
            StringBuilder wordTemplate = new StringBuilder(); // _ _ _ _ _
            /**
             *  The following code is used to extract a word from the list
             *  A random number is generated representing one of the words
             *  in the list.  The comma proceeding the word and following the word
             *  are located and used to extract the word as a substring
             */

            wordIndex = randomGenerator.nextInt(28);
            //System.out.println("word index: " + wordIndex);
            for (int i = 0; i <= wordIndex; i++) {
                commaIndex = wordList.indexOf(",", commaIndex + 1);
                //System.out.println("CommaIndex = " + commaIndex);
            }
            //System.out.println("comma index: " + commaIndex);
            randomWord = wordList.substring(commaIndex + 1, wordList.indexOf(",", commaIndex + 1));
            randomWord = randomWord.toLowerCase();
            System.out.println("The mystery word is " + randomWord.length() + " letters long");
            for (int i = 0; i < randomWord.length(); i++) {
                wordTemplate.append("_ ");
            }
            //System.out.println("Random word = " + randomWord);
            do {
                System.out.println("Please guess a letter");

                do {
                    userGuess = inputScanner.nextLine();
                    userGuess = userGuess.toLowerCase();
                    /**
                     * The following code checks the user entry to make sure that
                     * it is an alphabetic letter and that the letter has not
                     * been guessed before
                     */
                    if (usedLetters.contains(userGuess)) {
                        System.out.println("Sorry, you already tried a " + userGuess + " please guess another letter");
                        invalidEntry = true;
                    } else if (!Character.isAlphabetic(userGuess.charAt(0))) {
                        System.out.println("You didn't enter a letter, please try again");
                        invalidEntry = true;
                    } else if (userGuess.length() > 1) {
                        System.out.println("You must enter only one letter.");
                        invalidEntry = true;
                    } else {
                        invalidEntry = false;
                        usedLetters = usedLetters.concat(userGuess);
                    }
                }while(invalidEntry);
                /**
                 * Check to see if the word contains the guessed letter
                 * If it does, replace the underscore characters in the wordTemplate
                 * with the correct letter.  If the word does not contain the
                 * character, increment the wrong guess count
                 */
                if (randomWord.contains(userGuess)) {
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (randomWord.charAt(i) == userGuess.charAt(0)) {
                            System.out.println("i = " + i);
                            wordTemplate.replace(i * 2, (i * 2)+ 1, userGuess);
                            System.out.println("Found the letter " + userGuess + " in the mystery word\n");
                        }
                    }
                }
                else {
                    wrongGuessCount++;
                    System.out.println("Sorry, there are no letters " + userGuess + " in the mystery word\n");
                }
                System.out.println("Mystery Word: " + wordTemplate);
                System.out.println();


                /**
                 * Print out the hangman figure.  A switch statement is used to print out the proper
                 * characters depending on the current status of wrongGuessCount
                 */
                System.out.println("   --------");
                System.out.println("   |      |");
                switch (wrongGuessCount) {
                    case 0:
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        break;
                    case 1:
                        System.out.println("   |      O");
                        System.out.println("   |");
                        System.out.println("   |");
                        break;
                    case 2:
                        System.out.println("   |      O");
                        System.out.println("   |      |");
                        System.out.println("   |");
                        break;
                    case 3:
                        System.out.println("   |      O");
                        System.out.println("   |     \\|");
                        System.out.println("   |");
                        break;
                    case 4:
                        System.out.println("   |      O");
                        System.out.println("   |     \\|/");
                        System.out.println("   |");
                        break;
                    case 5:
                        System.out.println("   |      O");
                        System.out.println("   |     \\|/");
                        System.out.println("   |      |");
                        break;
                    case 6:
                        System.out.println("   |      O");
                        System.out.println("   |     \\|/");
                        System.out.println("   |      |");
                        System.out.println("   |     /");
                        break;
                    case 7:
                        System.out.println("   |      O");
                        System.out.println("   |     \\|/");
                        System.out.println("   |      |");
                        System.out.println("   |     / \\");
                        break;

                }
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("-----------\n");
                /**
                 * If there are no more underscores in wordTemplate then the
                 * "indexOf" method will return a -1. This means that the
                 * user guessed all letters and won.
                 */
                if (wordTemplate.indexOf("_") == -1) {
                    System.out.println("Congratulations, you won!!!");
                    gameOver = true;
                }
                /**
                 * If the wrongGuessCount reaches 7 then the entire stick figure
                 * will be built and the user loses the game.
                 */
                if (wrongGuessCount == 7) {
                    System.out.println("Sorry, too many wrong guesses.  You lose :(");
                    System.out.println("The correct word was: " + randomWord);


                    gameOver = true;
                }
            } while (!gameOver);
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = inputScanner.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                quit = true;
            }
        }while(!quit);


    }
}