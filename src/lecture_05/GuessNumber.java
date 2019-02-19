package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program randomly generates number between 0-100 inclusive, user is prompted to guess
 * number, each time the program will inform the user if the guess is too high or too low
 */
public class GuessNumber {
	// main method
	public static void main(String[] args) {
		// randomly generate number between 0-100 inclusive
		int num = (int)(Math.random() * 101);
		// System.out.println("random number: " + num); // test
		
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for guess
		System.out.println("Welcome to GuessNumber... \n\nI have randomly selected a number between 0 - 100 inclusive.");
		System.out.println("Can you guess my number? I will instruct you, too high or too low each guess. \n\nType your guess & hit enter: ");
		
		// assign guess
		int guess = input.nextInt();
		
		// check guess, instruct user too high/low & prompt for guess
		while (num != guess) {
			if (guess > num) {
				System.out.println("Too high! Guess again: ");
				guess = input.nextInt();
			}
			else if (guess < num) {
				System.out.println("Too low! Guess again: " );
				guess = input.nextInt();
			}
		}
		// display correct result
		System.out.print("Congratulations! You have guessed my random number of " + num);
		
		// close Scanner input object
		input.close();
	}

}
