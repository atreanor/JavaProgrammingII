package practical_03;
// import Scanner class
import java.util.Scanner;
/*
 * Class to define how many characters in a string
 */
public class HowLongIsString {

	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("Paste String and hit enter: ");
		
		String str = input.nextLine();
		
		// assign length to variable and print to console
		int len = str.length();
		System.out.println("String length: " + len);
		
		// close Scanner input object
		input.close();
	}

}
