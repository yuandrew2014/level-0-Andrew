
//copyright to something
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// do nothing and sit around and wait
		String xoxoxoyoulove = JOptionPane.showInputDialog("Who do you hate");
		// Tell them to type that they hate themselves
		JOptionPane.showMessageDialog(null,
				"You totally will punch " + xoxoxoyoulove + "'s teeth out and beat him up like a bully");
		// 3. Ask the user for the name of their best friend
		String friend = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, friend + " is so fat he sits next to everyone in the world");
	}
}
