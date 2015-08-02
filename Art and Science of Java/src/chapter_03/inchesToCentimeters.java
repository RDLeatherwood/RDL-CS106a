package chapter_03;

import acm.program.*;

public class inchesToCentimeters extends ConsoleProgram{
	public void run(){
		println("This program converts Inches to Centimeters.");
		double inches = readDouble("Enter value in inches: ");
		double cm = inches * CENTIMETERS_PER_INCH;
		println(inches + "in = " + cm + "cm");
		
	}
	private static final double CENTIMETERS_PER_INCH = 2.54;

}
