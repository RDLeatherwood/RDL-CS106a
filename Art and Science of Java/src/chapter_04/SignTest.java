package chapter_04;

import acm.program.*;

public class SignTest extends ConsoleProgram {
	
	public void run() {
		println("This Program Classifies an integer by it's sign.");
		int n = readInt("Enter n: ");
		if (n > 0) {
			println("That number is positive");
		} else if (n==0) {
			println("That number is Zero");
		}else {
			println("That number is Negative");
		}
		
	}
	

}
