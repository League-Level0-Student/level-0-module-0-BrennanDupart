package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	public static void main(String[] args) {
		
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int V1 = 0;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	V1 = ran.nextInt(4);
		// 3. Print your variable to the console
	System.out.print(V1);
		// 4. Get the user to enter something that they think is awesome
	String input = JOptionPane.showInputDialog("Enter something awesome");
	
		// 5. If your variable is  0
	if(V1 == 0) {
	 JOptionPane.showMessageDialog(null, "That's awesome!");
	}
			// -- tell the user whatever they entered is awesome!
	else if (V1 == 1) {
		JOptionPane.showMessageDialog(null, "That is ok");
	}
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	else if (V1 == 2) {
		JOptionPane.showMessageDialog(null, "That is boring");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	else if (V1 == 3) {
		JOptionPane.showMessageDialog(null, "Ok Vanilla");
	}
			// -- invent your own message to give to the user (be nice).

}}
