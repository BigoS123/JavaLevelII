package util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gui.MainFrame;

public class RacingGameUtil {

	public static void showErrorMessage(JFrame frame, String errorMessage, String errorTitle) {
		JOptionPane.showMessageDialog(frame, errorMessage, errorTitle, JOptionPane.ERROR_MESSAGE);
	}

}
