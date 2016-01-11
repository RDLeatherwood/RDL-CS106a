package chapter_04;
/*
 * Figure 4.8
 * This program counts backwards from the value START to zero, 
 * as in the countdown preceding a rocket launch.
 */

import acm.program.*;

public class countdown extends ConsoleProgram{

		private static final int START = 10;
		
		public void run() {
			for (int t = START; t >= 0; t--) {
				println(t);
			}
			println ("Liftoff!");
		}
	}


