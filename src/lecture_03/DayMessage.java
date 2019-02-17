package lecture_03;
// import Scanner class
import java.util.Scanner;

public class DayMessage {
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter number for day of week, 0-7: ");
		int day = input.nextInt();
		
		// switch statement displays weekday/weekend for day of week
		switch (day) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Weekday - keep up the good work!"); break;
		case 6:
		case 7: System.out.println("Weekend - time to party!");
		}
		
		// close input object
		input.close();
		
	}

}
