import javax.swing.JOptionPane;

public class TestFailure {
	public static void main(String[] args) {
		int x = 0;

		String wut = JOptionPane.showInputDialog("What you get on test?");
		if (wut.equals("80")) {
			JOptionPane.showMessageDialog(null, "You did good!");
		} else if (wut.equals("90")) {
			JOptionPane.showMessageDialog(null, "You did awesome!");
		} else if (wut.equals("100")) {
			JOptionPane.showMessageDialog(null, "You did excellent!");
		} else if (wut.equals("70")) {
			JOptionPane.showMessageDialog(null, "You did ok!");
		} else if (wut.equals("60")) {
			JOptionPane.showMessageDialog(null, "You did sort-of bad!");
		} else if (wut.equals("50")) {
			JOptionPane.showMessageDialog(null, "You did bad!");
		} else if (wut.equals("40")) {
			JOptionPane.showMessageDialog(null, "You are stupid!");
		} else if (wut.equals("30")) {
			JOptionPane.showMessageDialog(null, "You are retarded!");
		} else if (wut.equals("20")) {
			JOptionPane.showMessageDialog(null, "Go away!");
		} else if (wut.equals("10")) {
			JOptionPane.showMessageDialog(null, "GDIH!");
		}
	}
}
