import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String haha = JOptionPane.showInputDialog("Do you want dad's, mom's, or my birthday?");
		// 3. Print out what the user typed
		if (haha.equals("mom")) {
			JOptionPane.showMessageDialog(null, "January 24th, 01");
		} else if (haha.equals("dad")) {
			JOptionPane.showInputDialog("June 9th, 01");
		} else if (haha.equals("you")) {
			JOptionPane.showMessageDialog(null, "september 14th, 999999999");
		} else {
			JOptionPane.showMessageDialog(null,
					"That was not an option you DimWit you are soo dumb. You can clearly see that the options are me, mom, and dad. Shame on you! Know get yourself some bling! Run like the wind!!");
		}

		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
