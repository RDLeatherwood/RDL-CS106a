/*
 * Karel Fills beepers every other row like a checker board.  
 * Works on any size world
 * 
 * Works in both even and odd sized worlds
 * 
 * Also works in all worlds with a row length of 1
 * 
 * When finished, Karel does 2 victory laps returns to the home position of 1/1
 * 
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		fillRow();
		fillRemainingRows();
		returnKarel();

	}

	/*
	 * Karel fills the row of beepers in every other place. Also checks if the
	 * front is blocked in order to work on a world with a row length of 1
	 */
	private void fillRow() {
		if (frontIsBlocked()) {
			turnLeft();

		}
		if (frontIsClear()) {
			everyOtherBeeper();
		}

		while (frontIsClear()) {
			move();
			everyOtherBeeper();

		}

	}

	/*
	 * Makes Karel fill every other beeper on the board This method normally
	 * only works on even number worlds created a check for if the front Is not
	 * clear (Which would mean an odd number world) the program switches to the
	 * altOtherBeeper method
	 */
	private void everyOtherBeeper() {

		putBeeper();
		if (frontIsClear()) {
			move();
		} else
			altOtherBeeper();

	}

	/*
	 * Makes Karel run the alternate everyOtherBeeper method This allows Karel
	 * to run on odd number worlds
	 */
	private void altOtherBeeper() {
		if (facingEast()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnLeft();
			}

		} else {
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
			}
		}

	}

	/*
	 * Fills the remaining rows of the world
	 */
	private void fillRemainingRows() {

		if (facingEast()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnLeft();
			}

		} else {
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
			}

		}
		while (frontIsClear()) {
			fillRow();
			fillRemainingRows();
		}

	}

	/*
	 * Returns Karel does two victory laps and then returns to the starting position!
	 */

	private void returnKarel() {
		victoryLap();
		victoryLap();
		while (notFacingSouth()) {
			turnLeft();
		}
		while (frontIsClear()) {
			move();
		}
		while (notFacingWest()) {
			turnLeft();
		}
		while (frontIsClear()) {
			move();
		}
		while (notFacingEast()) {
			turnLeft();
		}

	}
/*
 * Karel goes around the outside of the map once for a victory lap!
 */
	private void victoryLap() {
		while (notFacingEast()){
			turnLeft();
					}
		while (frontIsClear()) {
			move();
		}
		while (notFacingSouth()){
			turnLeft();
					}
		while (frontIsClear()) {
			move();
		}
		while (notFacingWest()){
			turnLeft();
					}
		while (frontIsClear()) {
			move();
		}
		while (notFacingNorth()){
			turnLeft();
					}
		while (frontIsClear()) {
			move();
		}
		
		

	}
}
