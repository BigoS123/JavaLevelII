package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

import constants.RacingGameConstants;

public class AppPanel extends JPanel {
	protected JButton btnBack;

	public AppPanel() {
		super();
		this.setBounds(RacingGameConstants.PANEL_POSITION_X, RacingGameConstants.PANEL_POSITION_Y,
				 RacingGameConstants.PANEL_WIDTH, RacingGameConstants.PANEL_HEIGHT);
		setLayout(null);
		btnBack = new JButton("Back");
		btnBack.setBounds(RacingGameConstants.BUTTON_POSITION_X, RacingGameConstants.BUTTON_POSITION_Y, RacingGameConstants.BUTTON_WIDTH, RacingGameConstants.BUTTON_HEIGHT);
		add(btnBack);
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

}
