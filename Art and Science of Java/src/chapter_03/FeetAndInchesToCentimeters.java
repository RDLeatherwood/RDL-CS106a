package chapter_03;

import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram{
	public void run(){
		println("This program converts Feet & Inches to Centimeters.");
		int feet = readInt("Enter value in Feet: ");
		int inches = readInt("Enter value in inches: ");
		int cm = inches * CENTIMETERS_PER_INCH;
		int in = feet * INCHES_PER_FOOT;
		println(feet + "ft " +inches + "in = " + in + cm + "cm");
		
	}
	private static final double CENTIMETERS_PER_INCH = 2.54;
	private static final double INCHES_PER_FOOT = 12;

}
