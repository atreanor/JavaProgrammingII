package lecture_03;

import java.util.Scanner;

// import Scanner class
/*
 * program prompts user to enter a year as an integer value & checks if it is a leap year
 * - a leap year is divisible by 4, but not by 100, or it is divisible by 400
 */
public class LeapYear {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for year
		System.out.println("Enter a year in format #YYYY: ");
		int year = input.nextInt();
		
		// check if year is leap year & print result
		boolean leap = (year % 4 == 0) && !(year % 100 == 0) || (year % 400 ==0);
		System.out.println("Is " + year + " a leap year? Answer: " + leap);
		
		// close input object
		input.close();
	}

}
