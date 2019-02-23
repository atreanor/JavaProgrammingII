package lecture_06;
/*
 * program to illustrate that parameters are passed by value
 */
public class TestPassByValue {
	//main method
	public static void main(String[] args) {
		// initialise x, print before & after value to console.
		int x = 2;
		System.out.println("Before the call.. x is: " + x);
		foo(x); // invoke method on foo
		System.out.println("After the call.. x is: " + x);

	}
	public static void foo(int n) {
		// print to console, change value, print to console
		System.out.println("\tThe value of n inside foo is: " + n);
		n *= 10;
		System.out.println("\tThe value of n inside foo is: " + n);
	}

}
