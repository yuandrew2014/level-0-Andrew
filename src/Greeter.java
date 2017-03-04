import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String wut = JOptionPane.showInputDialog("What is you name");
		JOptionPane.showMessageDialog(null, wut
				+ ", wut up. According to your personal data, you are 9999999999999999999999999999999999999999999999999999 years old.");
	}
}
