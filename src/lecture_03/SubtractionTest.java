package lecture_03;
// import Scanner class
import java.util.Scanner;
/*
 * program to teach child how to learn subtractions:
 * - prompt user to enter 2 values, n1 & n2
 * - if n1 < n2 then swap the numbers
 * - prompt user to answer the question: What is N1 - n2 ?
 * - display whether the answer is correct.
 */
public class SubtractionTest {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter two integers
		System.out.println("Enter two integers separated by space & hit enter: ");
		
		// assign values to variables
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		// if n1 < n2 swap numbers
		if (n1 < n2) {
			int n3 = n2; n2 = n1; n1 = n3;
		}
		System.out.println("What is " + n1 + " - " + n2 + "?");
		int answer = input.nextInt();
		
		// check answer & display result
		if (n1 - n2 == answer) {
			System.out.println("Correct! " + n1 + " - " + n2 + " = " + answer);
		}
		else {
			System.out.println("Incorrect! " + n1 + " - " + n2 + " = " + answer);
		}
		
		// close input object
		input.close();
		
	}

}
