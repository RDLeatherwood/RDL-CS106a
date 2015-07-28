import stanford.karel.*;

public class DoubleBeeper extends SuperKarel {

	public void run() {
		move();
		doubleBeepers();
		moveBackwards();

	}

	private void moveBackwards() {
		turnAround();
		move();
		turnAround();

	}

	private void doubleBeepers() {
		while (beepersPresent()) {
			putTwoBeepersNextDoor();
		}
		movePileNextDoorBack();

	}

	private void putTwoBeepersNextDoor() {
		move();
		putBeeper();
		putBeeper();
		moveBackwards();

	}

	private void movePileNextDoorBack() {
		move();
		while (beepersPresent()) {
			moveOneBeeperBack();
		}
		moveBackwards();

	}
	
	private void moveOneBeeperBack() {
		pickBeeper();
		moveBackwards();
		putBeeper();
		move();
		
	}

}
