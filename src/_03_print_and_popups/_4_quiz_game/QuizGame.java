package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String prompt = JOptionPane.showInputDialog("How many wheels does an A320 have?");
		if (prompt.equals("6")) {
			score+=1;
			JOptionPane.showMessageDialog(null, "correct");
		
	
    }
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			score+=-1;
		}
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String V1 = JOptionPane.showInputDialog("How Old is Gabe?");
		if (V1.equals("14")) {
			JOptionPane.showMessageDialog(null, "correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
			score+=-1;
		}
		String V2 = JOptionPane.showInputDialog("How old is Brandon?");
		if (V2.equals("13")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			score+=-1;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, score);
		
	}
}
