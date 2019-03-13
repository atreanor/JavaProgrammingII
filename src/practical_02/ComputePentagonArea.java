package practical_02;
// import Scanner class

import java.util.Scanner;

/*
 * Program reads length of centre of pentagon to vertex from console, checks 
 * input is > 0, calculates area & prints to console.
 */
public class ComputePentagonArea {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input length
		System.out.println("Enter length of centre of pentagon to vertex: ");
		double length = input.nextDouble();
		
		// check input validity, calculate area & print result
		if (length > 0) {
			double side = 2 * length * Math.sin(Math.PI / 5);
			double area = 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
		
			System.out.println("Area of pentagon: " + area);
		}
		else {
			// print error message to console
			System.out.println("The length of cetnre of pentagon to vertex must be greater than 0.");
		}
		// close Scanner input object
		input.close();
	}

}
