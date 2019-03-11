package lecture_11;
// import Date class
import java.util.Date;

/*
 * Class represents a geometric object
 */
public class GeometricObject {
	// class variables
	private String colour;
	private boolean filled;
	private Date dateCreated;
	
	// Class constructor - default values: colour: white, filled: false
	GeometricObject() {
		this("white", false);
	}
	
	// Class constructor - with specified colour & filled values
	GeometricObject(String newColour, boolean newFilled) {
		this.colour = newColour;
		this.filled = newFilled;
		dateCreated = new Date();
	}
	
	// Returns the colour
	public String getColour() {
		return colour;
	}

	// Sets a new colour
	public void setColour(String newColour) {
		this.colour = newColour;
	}
	
	// Returns the filled property
	public boolean isFilled() {
		return filled;
	}
	
	// Sets a new filled property
	public void setFilled(boolean newFilled) {
		this.filled = newFilled;
	}
	
	// Returns the dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Returns a String representation of this object
	public String toString() {
		return "Colour: " + colour + "\nFilled: " + filled + "\nDate Created: "
				+ dateCreated;
	}
}
