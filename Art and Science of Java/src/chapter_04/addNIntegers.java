package chapter_04;

/*
 * This Program adds a user specified number of integers and then prints the 
 * sum at the end.
 * 
 */

import acm.program.*;

public class addNIntegers extends ConsoleProgram {
	// Specifies the number of values
	// private static final int NVALUES = 10;

	// Runs the program
	public void run() {
		// Asks the user how many numbers needed to be added together
		// then fills the NVALUES value.
		println("How many numbers did you need to add together?");
		int NVALUES = readInt();

		println("This program adds " + NVALUES + " integers.");
		int total = 0;
		for (int i = 0; i < NVALUES; i++) {
			int value = readInt(" + ");
			total += value;
		}
		println("Your total is " + total + ".");
	}

}
