import java.util.Scanner;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(name);
  }
}
