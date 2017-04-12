package gui;

import javax.swing.JPanel;

import app.Application;

import javax.swing.JButton;

public class HomePanel extends AppPanel {


	private JButton btnGoToNextScreen;
	private JButton btnGoToUpgradeCenter;

	public HomePanel() {
		super();

	

		btnGoToNextScreen = new JButton("go to garage");
		btnGoToNextScreen.setBounds(10, 83, 204, 50);
		add(btnGoToNextScreen);

		btnGoToUpgradeCenter = new JButton("go to upgrade center");
		btnGoToUpgradeCenter.setBounds(10, 11, 204, 61);
		add(btnGoToUpgradeCenter);

	}

	public JButton getBtnGoToNextScreen() {
		return btnGoToNextScreen;
	}

	public void setBtnGoToNextScreen(JButton btnGoToNextScreen) {
		this.btnGoToNextScreen = btnGoToNextScreen;
	}

	public JButton getBtnGoToUpgradeCenter() {
		return btnGoToUpgradeCenter;
	}

	public void setBtnGoToUpgradeCenter(JButton btnGoToUpgradeCenter) {
		this.btnGoToUpgradeCenter = btnGoToUpgradeCenter;
	}

}
