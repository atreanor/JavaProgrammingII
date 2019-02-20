package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program reads line from console, replaces every occurrence of the 
 * letter 'x' with the underscore character
 */

public class ReplaceX {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user to type a line of text
		System.out.println("Enter a line of text & hit enter: ");
		String text = input.nextLine();
		
		// initialise new StringBuilder for converted string
		StringBuilder textConv = new StringBuilder(); 
		
		// iterate over string, replacing each 'x' with '_'
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'x') {
				textConv.append('_'); 
			}
			else {
				textConv.append(text.charAt(i));
			}
		}
		// print result to console
		System.out.println(textConv);
		
		// Close Scanner input object
		input.close();
	}

}
