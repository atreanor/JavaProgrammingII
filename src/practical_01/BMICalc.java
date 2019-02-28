package practical_01;
// import Scanner class
import java.util.Scanner;

/*
 * program reads weight in pounds & height in inches from console. Calculates BMI &
 * prints result to console.
 */
public class BMICalc {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input weight & height
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		// calculate BMI & print to console
		double bmi = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);
		System.out.println("Your BMI is: " + bmi);
		
		// close Scanner input object
		input.close();
	}

}
