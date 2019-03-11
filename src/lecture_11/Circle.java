package lecture_11;

/*
 * Circle class extends GeometricObject, calculates area, diameter & perimeter
 * of a circle from radius
 */
public class Circle extends GeometricObject {
	private double radius;
	
	// Class constructor - default values, radius: 1.0
	public Circle(){
		this(1.0);
	}
	
	// Class constructor with specified radius
	public Circle(double newRadius) {
		this.radius = newRadius;
	}
	
	// Class constructor with specified radius, colour & filled
	public Circle(double newRadius, String newColour, boolean newFilled) {
		this.radius = newRadius;
		setColour(newColour);
		setFilled(newFilled);
	}
	
	// Returns the radius of the circle
	public double getRadius() {
		return radius;
	}
	
	// Sets the radius of this circle
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	// Calculates & returns the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// Calculates & returns the perimeter of this circle
	public double getPerimter() {
		return 2 * radius * Math.PI;
	}
	
	// Calculates & returns the diameter of this circle
	public double getDiameter() {
		return 2 * radius;
	}
	
	// prints circle info to console
	public void printCircle() {
		System.out.println("--Circle details-- \nDate Created: " + super.getDateCreated() +
				"\nColour: " + super.getColour() +
				"\nFilled: " + super.isFilled() +
				"\nRadius: " + radius);
	}
}
