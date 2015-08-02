package Chapter_02;

import acm.program.*;


public class MyProgram extends ConsoleProgram{
	public void run() {
		println(" ");
		double a = readDouble("Enter 1st Number: ");
		double b = readDouble("Enter 2nd Number: ");
		println(a);
		println("Times");
		println(b);
		println("Divide by 2");
		println("Equals...");
		double c = (a * b) / 2;
		println("c = " + c);
	}
	

}
