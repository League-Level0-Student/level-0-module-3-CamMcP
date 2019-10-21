package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obey {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Answer the following questions in all lowercase, okay?");
String shape = JOptionPane.showInputDialog("Which shape do you want rover to draw? A square, triangle, or Circle?");	
String color = JOptionPane.showInputDialog("What color do you want? Red, orange, yellow, green, blue, or purple?");

if () {


}
}
	


public void drawCircle() {
	Robot rover = new Robot();
	rover.penDown();
	for (int i = 0; i < 360; i++) {
		rover.move(1);
		rover.turn(360/360);
	}
	
}

public void drawTriangle() {
	Robot rover = new Robot();
	rover.penDown();
	for (int i = 0; i < 3; i++) {
		rover.turn(45);
		rover.move(100);
	}
	rover.penUp();
}

public void drawSquare() {
	Robot rover = new Robot();
	rover.penDown();
	for (int i = 0; i < 4; i++) {
		rover.move(100);
		rover.turn(90);
	}	
rover.penUp();
}
}