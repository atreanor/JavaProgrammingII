package lecture_06;

/*
 * program to assign grade letters to scores & print to console using return method
 */

public class TestReturnMethod {
	// main method
	public static void main(String[] args) {
		// initialise variables, invoke getGradeLetter & print result to console
		double score1 = 90.2;
		char ch1 = getGradeLetter(score1);
		System.out.println(score1 + " is a grade letter of: " + ch1);

		double score2 = 80.8;
		char ch2 = getGradeLetter(score2);
		System.out.println(score2 + " is a grade letter of: " + ch2);
	}
	
	// method converts double score to a grade letter & returns char A - F
	public static char getGradeLetter(double score) {
		if (score >= 90.0) {
			return 'A';
		}
		else if (score >= 80.0) {
			return 'B';
		}
		else if (score >= 70.0) {
			return 'C';
		}
		else if (score >= 60.0) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
}