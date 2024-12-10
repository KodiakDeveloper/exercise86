package bookExercises;

import javax.swing.JOptionPane;

public class Ex86 {

	public static void main(String[] args) {

		String userAnswer;

		int userInput;

		Ex86methods ex = new Ex86methods();

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Insert the value, this value will be used as a limit to calculate"
							+ " the sum of the first values in the array."));

			ex.sum(userInput);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
