package chapter_04;

import acm.program.*;

public class cardRank extends ConsoleProgram {
	public void run(){
		println("This Program converts integers into Card Ranks.");
		int n = readInt("Enter a number between 1 an 13: ");
		if (n > 13) {
			println("Please enter a number between 1 and 13.");
			
		} 
		switch (n) {
		case 1: println("Ace"); break;
		case 11: println("Jack"); break;
		case 12: println("Queen"); break;
		case 13: println("King"); break;
		default: println(n);
		
		
		}
	}

}
