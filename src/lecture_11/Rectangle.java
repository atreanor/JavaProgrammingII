package lecture_11;
/*
 * Rectangle class extends GeometricObject class represents a Rectangle, variables width 
 * & height methods - accessors & mutators, calculate area & perimeter
 */
public class Rectangle extends GeometricObject {
	// variables height & width of rectangle
	private double height;
	private double width;
	
	// Class constuctor with default values
	public Rectangle() {
		this(1.0, 1.0);
	}
	
	// Class constructor with specified height & width
	public Rectangle(double newHeight, double newWidth) {
		this.height = newHeight;
		this.width = newWidth;
	}
	
	// Class constructor with specified height, width, colour & filled
	public Rectangle(double newHeight, double newWidth, String newColour, boolean newFilled) {
		this.height = newHeight;
		this.width = newWidth;
		setColour(newColour);
		setFilled(newFilled);
	}
	
	// Returns width of this rectangle
	public double getWidth() {
		return width;
	}
	
	// Sets width of this rectangle
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	// Returns height of this rectangle
	public double getHeight() {
		return height;
	}
	
	// Sets the height of this rectangle
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	
	// Calculate & return the area of this rectangle
	public double getArea() {
		return height * width;
	}
	
	// Calculate & return the perimeter of this rectangle
	public double getPerimeter() {
		return 2 * (height + width);
	}
}
