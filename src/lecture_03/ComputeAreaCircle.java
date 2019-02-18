package lecture_03;
// import Scanner class
import java.util.Scanner;

/*
 * program to calculate area of circle:
 * - prompt user to enter radius
 * - if radius >= 0, calculate area & print output
 * - if radius < 0, display suitable message
 */
public class ComputeAreaCircle {
	// main method
	public static void main(String[] args) {
		
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter radius
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// if radius >= 0, calculate area & print output
		if (radius >= 0) {
			double area = Math.pow(radius, 2) * Math.PI;
			System.out.println("The area is : " + area);
		} // otherwise, display suitable message
		else {
			System.out.println("The radius must be >= 0.");
		}
		// close Scanner object
		input.close();
	}

}
