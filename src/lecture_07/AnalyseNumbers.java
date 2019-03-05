package lecture_07;
// import Scanner class
import java.util.Scanner;

/*
 * Program reads from console n numbers, computes their average & 
 * calculates how many numbers are above average
 */
public class AnalyseNumbers {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for n, create array of size n
		System.out.println("How many numbers should be read: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		double sum = 0;
		
		// prompt user for numbers, add to array & compute sum
		System.out.println("Enter numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// calculate average & numbers above average
		int aboveAvg = 0;
		double average = sum / n;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average) {
				aboveAvg++;
			}
		}

		// print result to console
		System.out.println("Average number: " + average + 
				"\nNo. Above Average: " + aboveAvg);
		
		// close Scanner input object
		input.close();
	}

}
