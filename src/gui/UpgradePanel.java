package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import controller.HomeController;
import controller.UpgradeController;

public class UpgradePanel extends AppPanel implements PanelView {

	
	private static UpgradePanel instance;
	
private JButton btnUpgradeEngine;
private JButton btnUpgradeBody;
private JButton btnBuySpoiler;
private JButton btnBuyTurbo;
private JToggleButton tglbtnToggleTurbo;
private JButton btnUpgradeBrakes;
private JButton btnUpgradeSuspention;
private JButton btnUpgradeTyres;
private JButton btnBuySkirts;
private JLabel lblSetBalanceBetween;
private JSlider slider;
private JButton btnBack;


	public UpgradePanel() {
		super();

		btnUpgradeEngine = new JButton("Upgrade Engine");
		btnUpgradeEngine.setBounds(5, 5, 109, 23);
		add(btnUpgradeEngine);

		btnUpgradeBody = new JButton("Reduce Body Weight");
		btnUpgradeBody.setBounds(119, 5, 133, 23);
		add(btnUpgradeBody);

		btnBuySpoiler = new JButton("Buy Spoiler");
		btnBuySpoiler.setBounds(257, 5, 85, 23);
		add(btnBuySpoiler);

		btnBuyTurbo = new JButton("Buy Turbo");
		btnBuyTurbo.setBounds(347, 5, 81, 23);
		add(btnBuyTurbo);

		tglbtnToggleTurbo = new JToggleButton("Toggle Turbo");
		tglbtnToggleTurbo.setEnabled(false);
		tglbtnToggleTurbo.setBackground(Color.WHITE);
		tglbtnToggleTurbo.setBounds(45, 33, 95, 23);
		add(tglbtnToggleTurbo);

		btnUpgradeBrakes = new JButton("Upgrade Brakes");
		btnUpgradeBrakes.setBounds(145, 33, 109, 23);
		add(btnUpgradeBrakes);

		btnUpgradeSuspention = new JButton("Upgrade Suspention");
		btnUpgradeSuspention.setBounds(259, 33, 129, 23);
		add(btnUpgradeSuspention);

		btnUpgradeTyres = new JButton("Upgrade Tyres");
		btnUpgradeTyres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpgradeTyres.setBounds(4, 61, 103, 23);
		add(btnUpgradeTyres);

		btnBuySkirts = new JButton("Buy Skirts");
		btnBuySkirts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuySkirts.setBounds(112, 61, 79, 23);
		add(btnBuySkirts);

		lblSetBalanceBetween = new JLabel("Set Balance Between Speed and Acceleration");
		lblSetBalanceBetween.setBackground(Color.ORANGE);
		lblSetBalanceBetween.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSetBalanceBetween.setBounds(196, 66, 235, 13);
		add(lblSetBalanceBetween);

		slider = new JSlider();
		slider.setBounds(228, 90, 200, 26);
		add(slider);
		lblSetBalanceBetween.setLabelFor(slider);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(5, 210, 135, 41);
		add(btnBack);
	}
	public static UpgradePanel getInstance(){
		if(instance == null){
			instance = new UpgradePanel();
		}
		return instance;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	public JButton getBtnUpgradeEngine() {
		return btnUpgradeEngine;
	}

	public void setBtnUpgradeEngine(JButton btnUpgradeEngine) {
		this.btnUpgradeEngine = btnUpgradeEngine;
	}

	public JButton getBtnUpgradeBody() {
		return btnUpgradeBody;
	}

	public void setBtnUpgradeBody(JButton btnUpgradeBody) {
		this.btnUpgradeBody = btnUpgradeBody;
	}

	public JButton getBtnBuySpoiler() {
		return btnBuySpoiler;
	}

	public void setBtnBuySpoiler(JButton btnBuySpoiler) {
		this.btnBuySpoiler = btnBuySpoiler;
	}

	public JButton getBtnBuyTurbo() {
		return btnBuyTurbo;
	}

	public void setBtnBuyTurbo(JButton btnBuyTurbo) {
		this.btnBuyTurbo = btnBuyTurbo;
	}

	public JToggleButton getTglbtnToggleTurbo() {
		return tglbtnToggleTurbo;
	}

	public void setTglbtnToggleTurbo(JToggleButton tglbtnToggleTurbo) {
		this.tglbtnToggleTurbo = tglbtnToggleTurbo;
	}

	public JButton getBtnUpgradeBrakes() {
		return btnUpgradeBrakes;
	}

	public void setBtnUpgradeBrakes(JButton btnUpgradeBrakes) {
		this.btnUpgradeBrakes = btnUpgradeBrakes;
	}

	public JButton getBtnUpgradeSuspention() {
		return btnUpgradeSuspention;
	}

	public void setBtnUpgradeSuspention(JButton btnUpgradeSuspention) {
		this.btnUpgradeSuspention = btnUpgradeSuspention;
	}

	public JButton getBtnUpgradeTyres() {
		return btnUpgradeTyres;
	}

	public void setBtnUpgradeTyres(JButton btnUpgradeTyres) {
		this.btnUpgradeTyres = btnUpgradeTyres;
	}

	public JButton getBtnBuySkirts() {
		return btnBuySkirts;
	}

	public void setBtnBuySkirts(JButton btnBuySkirts) {
		this.btnBuySkirts = btnBuySkirts;
	}

	public JLabel getLblSetBalanceBetween() {
		return lblSetBalanceBetween;
	}

	public void setLblSetBalanceBetween(JLabel lblSetBalanceBetween) {
		this.lblSetBalanceBetween = lblSetBalanceBetween;
	}

	public JSlider getSlider() {
		return slider;
	}

	public void setSlider(JSlider slider) {
		this.slider = slider;
	}

	@Override
	public void initPanelView() {
		UpgradeController.getInstance().initController();
		
	}


}
