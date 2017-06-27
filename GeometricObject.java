/**
 * Course: CS 1302
 * Section: W01
 * Professor: Dr. Jose Garrido
 * Name: Jordan Viehmeyer
 * Assignment # 3, Module # 4
 */

public abstract class GeometricObject
{
	String color;
	boolean filled;
	java.util.Date dateCreated;

	protected GeometricObject(){this.dateCreated = new java.util.Date();}

	protected GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		this.dateCreated = new java.util.Date();
	}

	public String getColor(){ return color;}

	public void setColor(String color) {this.color = color;}
	public void setFilled(boolean filled) {this.filled = filled;}
	public boolean isFilled(){return filled;}
	public java.util.Date getDateCreated() {return dateCreated;}

	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

}
