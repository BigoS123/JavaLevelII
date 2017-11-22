package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

import app.Application;
import constants.RacingGameConstants;

public class AppPanel extends JPanel {
	protected JButton btnBack;

	public AppPanel() {
		super();
		this.setBounds(RacingGameConstants.PANEL_POSITION_X, RacingGameConstants.PANEL_POSITION_Y,
				 RacingGameConstants.PANEL_WIDTH, RacingGameConstants.PANEL_HEIGHT);
		setLayout(null);
		btnBack = new JButton(Application.appNameResourceBundle.getString("btnBack"));
		btnBack.setBounds(RacingGameConstants.BTN_BACK_POSITION_X, RacingGameConstants.BTN_BACK_POSITION_Y, RacingGameConstants.BTN_BACK_WIDTH, RacingGameConstants.BTN_BACK_HEIGHT);
		add(btnBack);
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

}
