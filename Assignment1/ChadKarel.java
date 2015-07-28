/* File: ChadKarel.java
 * 
 * A program in which Karel cleans up hanging chads from a
 * ballot.  The specifications of this program are set out in
 * "Handout 08: Section Handout #1"
 */

import stanford.karel.*;

public class ChadKarel extends SuperKarel {
	/*
	 * Precondition: Karel stands at the start of the ballot. Postcondition:
	 * Karel is at the end of the ballot and all chad has been cleared.
	 */
	public void run() {

		faceEast();

		moveToBallot();

		checkBallot();

	}

	/*
	 * Forces Karel to face East to ensure he's facing the correct direction
	 */
	private void faceEast() {
		while (notFacingEast()) {
			turnLeft();
		}
	}

	/*
	 * Moves Karel through the ballots, checks them all on the way. Will not
	 * stop when until he reaches a wall
	 */
	private void moveToBallot() {

		while (frontIsClear()) {
			move();
			checkBallot();
		}

	}

	/*
	 * Checks Ballots. If there is not a beeper present in the middle section
	 * Karel will then check the top and bottom areas for beepers. If there is a
	 * beeper present in the middle Karel will skip that spot.
	 */
	private void checkBallot() {
		if (noBeepersPresent()) {
			clearBallot();
		} else
			moveToBallot();

	}

	/*
	 * Karel will check each clear the beepers from the ballot columns. Karel
	 * will also pick up all of the beepers present, not just a single beeper in
	 * each section. Karel will then turn East again.
	 */
	private void clearBallot() {
		turnLeft();
		move();
		pickAllBeepers();
		turnAround();
		move();
		move();
		pickAllBeepers();
		turnAround();
		move();
		faceEast();
	}

	/*
	 * Allows Karel to pick up multiple beepers if more then one beeper is
	 * present.
	 */
	private void pickAllBeepers() {
		while (beepersPresent()) {
			pickBeeper();
		}
	}
}
