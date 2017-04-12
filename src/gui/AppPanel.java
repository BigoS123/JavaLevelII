package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AppPanel extends JPanel {
	protected JButton btnBack;

	public AppPanel() {
		super();
		this.setBounds(0, 0, 1366, 766);
		setLayout(null);
	
		btnBack = new JButton("Back");
		btnBack.setBounds(0, 212, 204, 50);
		add(btnBack);
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

}
