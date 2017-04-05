package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

public class GaragePanel extends JPanel {
	private JButton btnBackToHome;

	public GaragePanel() {
		super();
		this.setBounds(0, 0, 434, 262);
		setLayout(null);
		
		btnBackToHome = new JButton("Back to home panel");
		btnBackToHome.setBounds(10, 56, 257, 58);
		add(btnBackToHome);
	}

	public JButton getBtnBackToHome() {
		return btnBackToHome;
	}

	public void setBtnBackToHome(JButton btnBackToHome) {
		this.btnBackToHome = btnBackToHome;
	}

}
