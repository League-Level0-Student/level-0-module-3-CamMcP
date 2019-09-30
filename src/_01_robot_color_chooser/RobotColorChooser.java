//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot john = new Robot();
for (int i = 0; i < 16; i++) {
	
		//3. Ask the user what color they would like the robot to draw
	String banana =	JOptionPane.showInputDialog("Which of the six colors of the rainbow would you like me to draw in? Tell me in all lowercase.");
		//5. Use an if/else statement to set the pen color that the user requested
if (banana.equals( "red")) {
	john.setPenColor(Color.red);
} 
else if (banana.equals("orange")) {
	john.setPenColor(Color.orange);
}
else if (banana.equals("yellow")) {
	john.setPenColor(Color.yellow);
}
else if (banana.equals("green")) {
	john.setPenColor(Color.green);
}
else if (banana.equals("blue")) {
	john.setPenColor(Color.blue);
}
else if (banana.equals("purple")) {
	john.setPenColor(255, 0, 255);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
john.setRandomPenColor();
}
   //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		john.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		john.setSpeed(1000);
		john.penDown();
		
			john.move(250);
			john.turn(90);
			john.move(250);
			john.turn(90);
			john.move(250);
			john.turn(90);
			john.move(250);
			john.turn(90);
		
}
	}
}
