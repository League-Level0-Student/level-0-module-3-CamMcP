package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obey {
	static Robot rover = new Robot();
	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Answer the following questions in all lowercase, okay?");
String shape = JOptionPane.showInputDialog("Which shape do you want rover to draw? A square, triangle, or a circle?");	
String color = JOptionPane.showInputDialog("What color do you want? red, orange, yellow, green, blue, or purple?");

if (color.equals("red")) {
rover.setPenColor(Color.red);
}
else if (color.equals("orange")) {
	rover.setPenColor(Color.orange);
}
else if (color.equals("yellow")) {
	rover.setPenColor(Color.yellow);
}
else if (color.equals("green")) {
	rover.setPenColor(Color.green);
}
else if (color.equals("blue")) {
	rover.setPenColor(Color.blue);
}
else if (color.equals("purple")) {
	rover.setPenColor(new Color(165, 13, 227));
}

if (shape.equals("square") ) {
	drawSquare();
}
else if (shape.equals("triangle")) {
	drawTriangle();
}
else if (shape.equals("circle")) {
	drawCircle();
}

}
	


public static void drawCircle() {
	//Robot rover = new Robot();
	rover.setSpeed(10000);
	rover.penDown();
	for (int i = 0; i < 360; i++) {
		rover.move(1);
		rover.turn(360/360);
	}
	
}

public static void drawTriangle() {
	//Robot rover = new Robot();
	rover.setSpeed(10000);
	rover.penDown();
	for (int i = 0; i < 3; i++) {
		rover.turn(45);
		rover.move(100);
	}
	rover.penUp();
}

public static void drawSquare() {
	//Robot rover = new Robot();
	rover.setSpeed(10000);
	rover.penDown();
	for (int i = 0; i < 4; i++) {
		rover.move(100);
		rover.turn(90);
	}	
rover.penUp();
}
}