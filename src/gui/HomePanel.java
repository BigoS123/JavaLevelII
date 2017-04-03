package gui;

import javax.swing.JPanel;

import app.Application;

import javax.swing.JButton;

public class HomePanel extends JPanel {

	private JButton btnBackToLoginPanel;
	
	public HomePanel() {
		setLayout(null);
		this.setBounds(0, 0, 434, 262);
		btnBackToLoginPanel = new JButton("Back to Login Panel");
		btnBackToLoginPanel.setBounds(78, 209, 270, 80);
		add(btnBackToLoginPanel);
	
	}

	public JButton getBtnBackToLoginPanel() {
		return btnBackToLoginPanel;
	}

	public void setBtnBackToLoginPanel(JButton btnBackToLoginPanel) {
		this.btnBackToLoginPanel = btnBackToLoginPanel;
	}

}
