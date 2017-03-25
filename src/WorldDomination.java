import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String nothing = JOptionPane.showInputDialog("Do you want to sleep.");
		// 2. If they say "yes", tell them they will rule the world.
		if (nothing.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Nighty Night");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck having blood shot eyes sucker!!!!");
		}
		JOptionPane.showMessageDialog(null, "This is the worst program ever.");
		JOptionPane.showMessageDialog(null, "--____________--");
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
