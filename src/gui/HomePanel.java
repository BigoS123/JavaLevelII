package gui;

import javax.swing.JPanel;

import app.Application;

import javax.swing.JButton;

public class HomePanel extends JPanel {

	private JButton btnBackToLoginPanel;
	private JButton btnGoToNextScreen;
	
	public HomePanel() {
		this.setBounds(0, 0, 434, 262);
		setLayout(null);
		btnBackToLoginPanel = new JButton("Back to Login Panel");
		btnBackToLoginPanel.setBounds(78, 209, 270, 80);
		add(btnBackToLoginPanel);
		
		btnGoToNextScreen = new JButton("go to garage");
		btnGoToNextScreen.setBounds(78, 118, 270, 80);
		add(btnGoToNextScreen);
	
	}

	public JButton getBtnBackToLoginPanel() {
		return btnBackToLoginPanel;
	}

	public void setBtnBackToLoginPanel(JButton btnBackToLoginPanel) {
		this.btnBackToLoginPanel = btnBackToLoginPanel;
	}

	public JButton getBtnGoToNextScreen() {
		return btnGoToNextScreen;
	}

	public void setBtnGoToNextScreen(JButton btnGoToNextScreen) {
		this.btnGoToNextScreen = btnGoToNextScreen;
	}
}
