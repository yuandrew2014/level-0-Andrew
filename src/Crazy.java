import java.net.URI;

import javax.swing.JOptionPane;

public class Crazy {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String ha = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
		int a = Integer.parseInt(ha);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (a >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crasy cat loser");
		}
		else if(a <= 3 && a > 0){
			playVideo(ha);
		}
		else if(a == 0){
			playTrash(ha);
		}
		// 4. If they have 3 or less, call the method below to show them a cat
		// video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like
		// a Human

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI("https://goo.gl/s2FGD4");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		static void playTrash(String videoURL) {
			try {
				URI uri = new URI("https://goo.gl/uy5axB");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
