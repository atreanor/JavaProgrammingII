package lecture_02;
// import Scanner class
import java.util.Scanner;

public class ComputeAvg {
	// main method
	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter three numbers
		System.out.println("Enter the first number: ");
		double number1 = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		double number2 = input.nextDouble();
		
		System.out.println("Enter the third number");
		double number3 = input.nextDouble();
		
		// compute average
		double average = (number1 + number2 + number3) / 3;
		
		// display result
		System.out.println("The average is : " + average);
		
		// close Scanner object
		input.close();
	}

}
