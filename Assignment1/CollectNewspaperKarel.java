/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.Karel;

public class CollectNewspaperKarel extends Karel {

	public void run() {

		moveToPaper();
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
		moveToPaper();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();

	}

	// Moves Karel directly to the newspaper from the starting
	// point of the map.
	private void moveToPaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}

	// Allows Karel to turn right with one command
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();

	}

}
