package Chapter_02;

import acm.graphics.*;
import acm.program.*;

public class drawSnowman extends GraphicsProgram {
	public void run() {
		//Head of Snowman
		add(new GOval(120, 20, 40, 40));
		//Eyes
		add(new GOval(130, 30, 10, 10));
		add(new GOval(142, 30, 10, 10));
		//Nose
		add(new GLabel("v"), 138, 49);
		//Mouth 
		add(new GOval(135, 49, 10, 10));
		
		//Torso of Snowman
		add(new GOval(100, 60, 80, 80));
		
		//Buttons
		add(new GRect(132, 73, 15, 15));
		add(new GRect(132, 93, 15, 15));
		add(new GRect(132, 113, 15, 15));
		
		//Bottom of Snowman
		add(new GOval(80, 140, 120, 120));
		
	}

}
