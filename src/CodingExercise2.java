/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int ages = Integer.parseInt(age);
	int year = 2016;
	int birthdate = year - ages;
	if (ages < 30) {
		System.out.println("You were born in " + birthdate);
	}
	
	if (ages > 30) {
		System.out.println("You are to old to play this game");
	}
}
}

