package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program prompts user to add two digits together, repeats this until
 * the user gets equation correct. *use a while loop*
 */

public class RepeatAdditionQuiz1 {
	// main method
	public static void main(String[] args) {
		// create two random digits for quiz
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		// calculate correct answer
		int result = num1 + num2;
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for result
		System.out.println("What is " + num1 + " + " + num2 + " ? ");
		int guess = input.nextInt();
		
		// check answer, 
		while (guess != result) {
			System.out.println("Wrong answer! Try again: ");
			guess = input.nextInt();
		}
		
		// display correct answer to console
		System.out.println("Well done, that's correct! " + num1 + " + " + num2 + " = " + result);
		
		// close Scanner input object
		input.close();
		
	}

}
