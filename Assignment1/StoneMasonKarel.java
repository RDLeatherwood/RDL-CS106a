
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		fillStone();
		moveToNext();
	}
	


	private void fillStone() {
		if (facingEast()) {
			turnLeft();
			}
		if (noBeepersPresent()){
			putBeeper();
			
		}
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()){
				putBeeper();
				
			}
				}
		if (frontIsBlocked()){
			turnAround();
			if (facingSouth()) {
				while(frontIsClear()) {
					move();
				}
				turnLeft();
			}
		}
		
		
	}
	private void moveToNext() {
		move();
		move();
		move();
		move();
		fillStone();
		if (frontIsClear()) {
			moveToNext();
			
		}
		
		
	}
}
