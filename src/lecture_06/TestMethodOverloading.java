package lecture_06;
/*
 * program demonstrates method overloading
 */
public class TestMethodOverloading {
	// main method
	public static void main(String[] args) {
		// invoke method max with integer parameters
		int n1 = 8;
		int n2 = 9;
		System.out.println("The max value is " + max(n1, n2));
		
		// invoke method max with double parameters
		double d1 = 88.21;
		double d2 = 91.30;
		System.out.println("The max value is " + max(d1, d2));
				
		// invoke method max with three double parameters
		double d3 = 67.25;
		System.out.println("The value is " + max(d1, d2, d3));
	}
	
	// return the max of two int values
	public static int max(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

	// return the max of double values
	public static double max(double num1, double num2) {
		return (num1 > num2) ? num1 : num2;
	}

	// return the max of three double values
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
}
