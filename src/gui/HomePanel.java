package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

public class HomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setLayout(null);
		setBounds(100, 100, 1366, 768);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(78, 209, 270, 80);
		add(btnNewButton);

	}

}
