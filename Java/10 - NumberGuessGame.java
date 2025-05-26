import java.util.*;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess = 0;
        while (guess != numberToGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            if (guess < numberToGuess) System.out.println("Too low!");
            else if (guess > numberToGuess) System.out.println("Too high!");
            else System.out.println("Correct! You guessed the number.");
        }
    }
}