import javax.swing.JOptionPane;

public class PrimeNumbe {
public static void main(String[] args) {
	int flag = 0;
	int q = Integer.parseInt(JOptionPane.showInputDialog("Enttttter a numbbeer"));
	for (int i = 2; i < q; i++) {
		if(q % i == 0){
			flag = 1;
		}
		
	}
	if(flag == 0){
		JOptionPane.showMessageDialog(null, "This is a prime number");
	}
	else if(flag == 1){
		JOptionPane.showMessageDialog(null, "This is NOT a prime number");
	}
}

}