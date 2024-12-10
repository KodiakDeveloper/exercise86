package bookExercises;

import javax.swing.JOptionPane;

public class Ex86methods {

	public void sum(int a) {

		int sum = 0;

		int randomArray;

		int randomSize = (int) (Math.random() * 100);

		int[] arrayValues = new int[randomSize];

		for (int i = 0; i < arrayValues.length; i++) {

			randomArray = (int) (Math.random() * 100);

			arrayValues[i] = Math.round(randomArray);

		}

		for (int i = 0; i < a; i++) {

			sum += arrayValues[i];

		}

		JOptionPane.showMessageDialog(null, "Sum of the first " + a + " values " + "\nSum: " + sum);

	}

}
