/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * Karel finds the middle of the world, places a beeper down, and just sits there
 * 
 * Karel then does a small victory dance (2x victoryLap();
 * 
 * Works on any size world, even or odd.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {

		fillBeepers();
		takeBeepersFromEnds();
		takeBeepersFromMiddle();
		victoryLap();
		victoryLap();

	}

	/*
	 * Fills entire row of beepers to help find the middle
	 */
	private void fillBeepers() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();

		}

	}

	/*
	 * Removes beepers from the two ends
	 */
	private void takeBeepersFromEnds() {
		while (frontIsClear()) {
			move();

		}
		if (frontIsBlocked()) {
			pickBeeper();
			turnAround();

		}
		while (frontIsClear()) {
			move();

		}
		pickBeeper();
		turnAround();

	}

	/*
	 * Remove the remaining beepers from the middle until there are no more,
	 * forcing Karel to be in the middle of the world. Karel then turns around,
	 * takes a step back, and then places one last beeper
	 */
	private void takeBeepersFromMiddle() {
		move();
		while (beepersPresent()) {
			move();
		}
		turnAround();
		move();
		pickBeeper();
		move();
		if (beepersPresent()) {
			takeBeepersFromMiddle();
		} else {
			turnAround();
			move();
			putBeeper();
		}

	}

	/*
	 * obligatory victory dance! This dance just has Karel go up and down the
	 * world once
	 */
	private void victoryLap() {
		while (notFacingNorth()) {
			turnLeft();
		}
		while (frontIsClear()) {
			move();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}

	}

}
