package lecture_06;

/*
 * program demonstrates defining & calling a method max that returns the 
 * largest of two integer values
 */
public class TestMax {
	// main method
	public static void main(String[] args) {
		// initialise integers & invoke max
		int a = 67;
		int b = 76;
		int k = max(a, b);
		
		// print result to console
		System.out.println("The max is: " + k);
	}
	// method returns the largest of two integers
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

}
