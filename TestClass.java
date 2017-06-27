/**
 * Course: CS 1302
 * Section: W01
 * Professor: Dr. Jose Garrido
 * Name: Jordan Viehmeyer
 * Assignment # 3, Module # 4
 */

public class TestClass {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.setSides(2,33,33);
		tr.setFilled(false);
		tr.setColor("Green");

		System.out.println("Triangle Data");
		System.out.println("\tArea: " + tr.getArea());
		System.out.println("\tPerimeter: " + tr.getPerimeter());
		System.out.println("\tFilled: " + tr.isFilled());
		System.out.println("\tColor: " + tr.getColor());


	}
}
