import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenWidth(10);
		String colors = JOptionPane.showInputDialog("What color would the robot to draw? (Orange,Yellow,blue)");
		if (colors.equalsIgnoreCase("orange")) {
			r2d2.setPenColor(Color.orange);
		}
		if (colors.equalsIgnoreCase("yellow")) {
			r2d2.setPenColor(Color.yellow);
		}else if (colors.equalsIgnoreCase("blue")) {
			r2d2.setPenColor(Color.blue);
		}
	
		
		for (int i = 0; i < 4; i++) {
			r2d2.move(100);
			r2d2.turn(90);
		}
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape

	}
}
