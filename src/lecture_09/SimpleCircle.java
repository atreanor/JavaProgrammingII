package lecture_09;

/*
 * Example class creates a circle of radius 1, or a specified radius 
 * & calculates area
 */
public class SimpleCircle {
	// create radius variable
	double radius;
	
	// class constructor - radius = 1
	public SimpleCircle() {
		radius = 1;
	}

	// class constructor - specified radius double
	public SimpleCircle(double newRadius) {
		radius = newRadius;
	}
	
	// calculate & return area
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
