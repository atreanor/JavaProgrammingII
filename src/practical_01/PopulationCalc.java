package practical_01;
import java.util.Calendar;
// import Scanner class
import java.util.Scanner;

/*
 * program prompts user for input year & calculates projected population - rules: one birth
 * every 7 seconds, one death every 13 seconds, one new immigrant every 45 seconds. Assume
 * each year has 365 days.
 */

public class PopulationCalc {
	// main method
	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter a future year, format YYYY: ");
		int year = input.nextInt(); 
		
		// get current year
		Calendar now = Calendar.getInstance();
		int currentYear = now.get(Calendar.YEAR);
		System.out.println("year1 " + currentYear);
		
		// calculate population
		int diff = year - currentYear; 
		double birthsPerYear = 365 * 24 * 60 * 60 / 7;
		double deathsPerYear = 365 * 24 * 60 * 60 / 13;
		double immigrantsPerYear = 365 * 24 * 60 * 60 / 45;
		double populationChange = diff * (birthsPerYear - deathsPerYear + immigrantsPerYear); 
		
		// print result to console
		System.out.println("The population in " + diff + " years time is projected to increase by: " + populationChange);
		
		// close Scanner input object
		input.close();
	}

}
