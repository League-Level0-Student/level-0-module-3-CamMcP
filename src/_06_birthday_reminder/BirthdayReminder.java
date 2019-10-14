
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "August 9th";
		String myBirthday = "June 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String variable = JOptionPane.showInputDialog("Which birthday would you like? " + momsBirthday + " (moms birthday), " + dadsBirthday + " (dads birthday), or " + myBirthday + " (my birthday)? Answer like this: myBirthday.");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, variable);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (variable.equals(momsBirthday)) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (variable.equals(dadsBirthday)) {
			JOptionPane.showMessageDialog(null, dadsBirthday);			
		}
			
		// 6. if user asked for your name
		else if (variable.equals(myBirthday)) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't reconise that birthday.");
		}
	} 
}
