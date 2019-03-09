package lecture_09;
/*
 * Class to demonstrate the roles of instance & static variables & their uses:
 * - a static variable numberOfObjects counts no. of objects created
 * - a static method getNumberOfObjects() returns no. of objects created
 */
public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects;
	
	// Class constructor - radius of 1 & increment numberOfObjects
	CircleWithStaticMembers(){
		radius = 1.0;
		numberOfObjects++;
	}
	
	// Class constructor - with specified radius
	CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	// Return the no. of objects created
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	// Return the area 
	double getArea() {
		return radius * radius * Math.PI;
	}
}
