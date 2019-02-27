package practical_01;
// import Scanner class
import java.util.Scanner;

// import DecimalFormat, NumberFormat
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* 
 * program accepts temperature between -58F and 41F, a wind speed greater than or equal to
 * 2 mph, calculates & displays the wind chill temperature 
 */
public class WindChillCalc {
	// main method
	public static void main(String[] args) {
		// create number formatter to 2 decimal places
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for temperature, do-while loop only continues when value is between -58F & 41F
		double fahrenheit;
		do { 
			System.out.println("Enter a fahrenheit temperature between -58F and 41F: ");
			fahrenheit = input.nextDouble();
		} while(fahrenheit < -58 || fahrenheit > 41);
		
		// prompt user for wind speed, do-while loop only continues when value is >= 2mph
		double windSpeed;
		do { 
			System.out.println("Enter a wind speed greater than 2 mph: ");
			windSpeed = input.nextDouble();
		} while(windSpeed < 2);
		double windChill = 35.74 + (0.6215 * fahrenheit) - 35.75 * 
				Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit  * 
				Math.pow(windSpeed, 0.16);
		
		// print result to console using formatter 
		System.out.println("The wind chill temperature is: " + formatter.format(windChill) + "F");
		
		// close Scanner input object
		input.close();
	}

}
