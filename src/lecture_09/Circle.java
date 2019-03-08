package lecture_09;
/*
 * Circle Class created using private variables, getter & setter methods
 */
public class Circle {
	private double radius;
	private static int numberOfObjects;  
	
	// Class constructor - default radius 1.0
	public Circle() {
		this(1.0);
	}
	
	// Class constructor with a specified radius
	public Circle(double newRadius) {
		this.radius = newRadius;
		numberOfObjects++;
	}
	
	// Returns the radius of this circle
	public double getRadius() {
		return radius;
	}
	
	// Sets a new radius for this circle
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	// Returns the number of circle objects created
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	// Returns the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// Returns a string representation of this circle
	public String toString() {
		return "Radius: " + radius;
	}

}
