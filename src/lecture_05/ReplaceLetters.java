package lecture_05;
// import Scanner class
import java.util.Scanner;

/*
 * program reads a line of text from console, replaces every lowercase letter
 * with an uppercase & uppercase with lowercase
 */

public class ReplaceLetters {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter a line
		System.out.println("Enter a line of text & hit enter: ");
		
		// assign input to variable
		String text = input.nextLine();
		StringBuilder textConv  = new StringBuilder();
		
		// iterate over input, change uppercase to lower & vice versa
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				textConv.append(Character.toLowerCase(text.charAt(i)));
			}
			else if (Character.isLowerCase(text.charAt(i))){
				textConv.append(Character.toUpperCase(text.charAt(i)));
			}
			else {
				textConv.append(text.charAt(i));
			}
		}
		// print result to console
		System.out.println("Converted line: " + textConv);
		
		// close Scanner input object
		input.close();
	}

}
