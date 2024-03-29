//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String input = JOptionPane.showInputDialog("Guess my number. It is between 1 and 100.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guess = Integer.parseInt(input);
		
			// 5. if the guess is correct
		if (guess == random) {
			JOptionPane.showMessageDialog(null, "You have guesed my number correctly. You win!");	
			System.exit(0);
		}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		
			// 7. if the guess is high
		if (guess > random) {
			JOptionPane.showMessageDialog(null, "You are too high. Try again, and guess lower.");
		}
		
				// 8. Tell them it's too high
			// 9. if the guess is low
	if (guess < random) {
		JOptionPane.showMessageDialog(null, "You are too low. Go again, and aim higher.");
	}
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "It seems you are out of guesses. Better luck next time!");
	}

}


