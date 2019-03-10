package lecture_09;

/*
 * Class to test SimpleCircle class
 */
public class TestSimpleCircle {
	// main method
	public static void main(String[] args) {
		// create c1 - a circle with radius of 1
		SimpleCircle c1 = new SimpleCircle();
		System.out.println("Radius: " + c1.radius);
		System.out.println("Area: " + c1.getArea() +"\n");
		
		// create c2 - a circle with radius of 25
		SimpleCircle c2 = new SimpleCircle(25);
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea() +"\n");
		
		// Update radius of c2
		c2.radius = 100;
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea() +"\n");
	}

}
