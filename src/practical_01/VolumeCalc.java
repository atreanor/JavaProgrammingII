package practical_01;
// import Scanner class
import java.util.Scanner;
/*
 * program reads radius & length of cylinder from console & computes area & volume
 */

public class VolumeCalc {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter radius & length of cyclinder separated by space: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		// calculate area
		double area = Math.PI * Math.pow(radius, 2);
		double volume = area * length;
		
		// Print results to console
		System.out.print("The area is: " + area + "\nThe volume is: " + volume);
		
		// close Scanner input object
		input.close();
	}

}
