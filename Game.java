import java.util.Scanner;
import java.util.Random;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    // Get user's name
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(name);
    
    // Create an instance of the Random object
    Random rand = new Random();
    
    // Call method nextInt and pass in upper range (exclusive)
    int number = rand.nextInt(101);
    System.out.println(number);

    int numberOfGuesses = 0;

    boolean guessed = false;

    while (!guessed) {
      System.out.print("Enter your guess: ");
      int guess = input.nextInt();
      numberOfGuesses++;

      if (guess == number) {
        System.out.print("You won! Your total guesses: ");
        System.out.println(numberOfGuesses);
        break;
      } if (guess < number) {
        System.out.println("Too low!");
      } else if (guess > number) {
        System.out.println("Too high!");
      }

    }
  }
}
