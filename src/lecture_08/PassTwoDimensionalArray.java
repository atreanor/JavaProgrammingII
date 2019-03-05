package lecture_08;
// import Scanner class
import java.util.Scanner;

/*
 * Example program to display how to: 
 * - pass a two dimensional array to a method
 * - return a two dimensional array from a method
 */
public class PassTwoDimensionalArray {
	// main method
	public static void main(String[] args) {
		// create Scanner input object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input - no. rows & columns
		System.out.println("Enter no. rows & colums separated by space: ");
		
		// assign input values to variables & create 2D array
		int numRows = input.nextInt();
		int numCols = input.nextInt();
		int[][] m = createArray(numRows, numCols);
		
		// print array to console
		displayArray(m);
		System.out.println();
		
		// sum all elements & print result to console
		int sum = getSum(m);
		System.out.println("The sum of all elements is: " + sum);
		
		// close Scanner input object
		input.close();
	}
	
	// creates a 2D array of n rows & n columns, sets elements to random integers between 0-9
	public static int[][] createArray(int nR, int nC) {
		int[][] arr = new int[nR][nC];
		
		// Fill arr with random values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10);		
			}
		}
		return arr;
	}
	
	// displays the 2D array to console
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			// print on newline for visual purposes
			System.out.println();
		}
	}
	
	// calculates & returns the sum of all elements in a 2D array
	public static int getSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}
