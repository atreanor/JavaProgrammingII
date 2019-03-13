package practical_02;
// import Scanner class
import java.util.Scanner;

/*
 * Program reads from console 3 lengths of a triangle, checks if triangle is
 * valid, if so it calculates & prints result to console
 */
public class ValidTriangleCheck {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input of 3 lengths & assign values to variables
		System.out.println("Enter three lengths of triangle serparated by spaces: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// check if triangle is valid & calculate perimeter, else print error message
		if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2) {
			System.out.println("This is not a valid triangle.");
		}
		else {
			System.out.println("The perimeter of triangle is: " + (side1 + side2 + side3));
		}
		
		// close Scanner input object
		input.close();
	}

}
