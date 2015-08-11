package chapter_04;
/*
 * This program reads integers one per line until the
 * user enters a special sentinel value to signal the end of the input
 * At that time the program prints out the sum of the numbers entered so far
 */

import acm.program.*;

public class AddIntegerList extends ConsoleProgram{
	//Specifies the value of the sentinel
	private static final int SENTINEL = 0;
	
	//runs the program
	public void run(){
		println("This program adds a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list");
		int total = 0;
		while (true){
			int value = readInt("Number: ");
			if (value == SENTINEL) break;
			total += value;
			
		}
		println("The total is " + total + ".");
	}
	

}
