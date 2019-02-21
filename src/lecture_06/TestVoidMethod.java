package lecture_06;

/*
 * program to assign grade letters to scores & print to console
 */

public class TestVoidMethod {
	// main method
	public static void main(String[] args) {
		// initialise variables, print to console & invoke GradeLetter
		double score1 = 88.2;
		System.out.print(score1 + " is a grade letter of: ");
		GradeLetter(score1);
		
		double score2 = 65.8;
		System.out.print(score2 + " is a grade letter of: ");
		GradeLetter(score2);
	}
	
	public static void GradeLetter(double score) {
		if (score >= 90.0) {
			System.out.println("A");
		}
		else if (score >= 80.0) {
			System.out.println("B");
		}
		else if (score >= 70.0) {
			System.out.println("C");
		}
		else if (score >= 60.0) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
