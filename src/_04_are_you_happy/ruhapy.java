package _04_are_you_happy;
import javax.swing.JOptionPane;

public class ruhapy {
public static void main(String[] args) {
	
String input = JOptionPane.showInputDialog("Are you happy? Enter with a uppercase first letter, but the rest lowercase.");
if (input.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep on doing what you are doing.");
}
if (input.equals("No")) {
	String input2 = JOptionPane.showInputDialog(null, "Do you want to be happy? Enter answer like last time.");
	if (input2.equals("No")) {
		JOptionPane.showMessageDialog(null, "Keep on going along, i guess.");
	}	
	if (input2.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Then you need to change, if you truly do want to be happy.");
	}
	
}





































}
}
