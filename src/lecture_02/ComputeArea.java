package lecture_02;
/*
 * class to compute the area of a circle
 */
public class ComputeArea {
	// main method
	public static void main(String[] args) {
		// declare variables
		double radius;
		double area;
		// assign value to radius
		radius = 20;
		
		//calculate area
		area = radius * radius * 3.14159;
		
		// print result to console
		System.out.println("The area of the circle of radius " + radius + " is " + area);
		
	}

}
