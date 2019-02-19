package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program prompts user to add two digits together, repeats this until
 * the user gets equation correct. *use a do-while loop*
 */

public class RepeatAdditionQuiz2 {
	// main method
	public static void main(String[] args) {
		// create two random digits for quiz
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		// calculate correct answer
		int result = num1 + num2;
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		int guess; // initiate variable
		
		do {
			// prompt user for result
			System.out.println("What is " + num1 + " + " + num2 + " ? ");
			guess = input.nextInt();
			
			// check result, if incorrect prompt new attempt, else print result to console
			if (guess != result) {
				System.out.println("wrong answer, try again.");
			}
			else {
				System.out.println("Correct! " + num1 + " + " + num2 + " = " + result);
				break;
			}
		} 
		while (result != guess); // do executes while trailing condition true
		
		// close Scanner input object
		input.close();
		
	}

}
