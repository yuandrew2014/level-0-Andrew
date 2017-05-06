 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
			// 1. ask the user for a guess using a pop-up window, and save their response 
String guess = JOptionPane.showInputDialog("insert a number between 0-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int hi = Integer.parseInt(guess);
if (hi == random) {
	JOptionPane.showMessageDialog(null, "You suck!");
	JOptionPane.showMessageDialog(null, "You win. Now go get some bling.");
}
else if(hi < random){
	JOptionPane.showMessageDialog(null, "Too low, Sucker");
}
else{
	JOptionPane.showMessageDialog(null, "Too high, Dummie");
}
		}
		
			// 5. if the guess is correct
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	}

}
