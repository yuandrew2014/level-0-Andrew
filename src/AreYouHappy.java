import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String yes = JOptionPane.showInputDialog("Are You Happy?");
	String happy = "";
	if (yes.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing.");
		System.exit(0);
	}
	else {
		 happy = JOptionPane.showInputDialog("Do you want to be happy?");
		
	}
	 if(happy.equals("no")){
		JOptionPane.showMessageDialog(null, "then do whatever you were doing.");
		
	}
	 else {
		 JOptionPane.showMessageDialog(null, "Change Something ,wino.");
	 }
	
}
}
