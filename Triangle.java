/**
 * Course: CS 1302
 * Section: W01
 * Professor: Dr. Jose Garrido
 * Name: Jordan Viehmeyer
 * Assignment # 3, Module # 4
 */

public class Triangle extends GeometricObject
{
	private double[] triangleSides = new double[3];

	//Set the length of the triangles sides.
	public void setSides(double side1, double side2, double side3)
	{
		this.triangleSides[0] = side1;
		this.triangleSides[1] = side2;
		this.triangleSides[2] = side3;

	}

	public double getSide(int sideNumber) //Get a particular side number
	{
		if(sideNumber < triangleSides.length)
			return triangleSides[sideNumber];
		else
			return Double.MIN_VALUE;
	}

	public double getPerimeter() //Add all sides of the triangle to get the perimeter.
	{
		return (triangleSides[0] + triangleSides[1] + triangleSides[2]);
	}

	public double getArea() //Calculate area by using A = bh/2
	{
		return ((triangleSides[2] * triangleSides[1]) / 2);
	}



}
