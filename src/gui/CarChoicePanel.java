package gui;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.CarChoiceController;
import controller.HomeController;
import controller.LoginController;

public class CarChoicePanel extends AppPanel implements PanelView {

	private static CarChoicePanel instance;
	
	private JRadioButton rdbtnBmw;
	private JRadioButton rdbtnAudi;
	private JRadioButton rdbtnBugatti;
	private JLabel lblNewLabel;
	private JLabel lblLookOfCar;
	private JButton btnConfirmChoice;
	private JButton btnBackToHome;
	
	public CarChoicePanel() {
		super();

		
		rdbtnBmw = new JRadioButton("BMW");
		rdbtnBmw.setBounds(25, 198, 109, 23);
		add(rdbtnBmw);
		
		rdbtnAudi = new JRadioButton("AUDI");
		rdbtnAudi.setBounds(193, 198, 109, 23);
		add(rdbtnAudi);
		
		rdbtnBugatti = new JRadioButton("BUGATTI");
		rdbtnBugatti.setBounds(340, 198, 109, 23);
		add(rdbtnBugatti);
		
		lblNewLabel = new JLabel("CHOSE YOUR CAR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(79, 11, 504, 69);
		add(lblNewLabel);

		
		lblLookOfCar = new JLabel("Look of car doesn't affect statistics");
		lblLookOfCar.setBounds(79, 61, 229, 23);
		add(lblLookOfCar);
		
		btnConfirmChoice = new JButton("Confirm choice");
		btnConfirmChoice.setBounds(309, 228, 125, 34);
		add(btnConfirmChoice);
		
		btnBackToHome = new JButton("Back to home screen");
		btnBackToHome.setBounds(177, 228, 125, 34);
		add(btnBackToHome);
		
	}
	public static CarChoicePanel getInstance() {
		if (instance == null) {
			instance = new CarChoicePanel();
		}
		return instance;
	}

	public JRadioButton getRdbtnBmw() {
		return rdbtnBmw;
	}

	public void setRdbtnBmw(JRadioButton rdbtnBmw) {
		this.rdbtnBmw = rdbtnBmw;
	}

	public JRadioButton getRdbtnAudi() {
		return rdbtnAudi;
	}

	public void setRdbtnAudi(JRadioButton rdbtnAudi) {
		this.rdbtnAudi = rdbtnAudi;
	}

	public JRadioButton getRdbtnBugatti() {
		return rdbtnBugatti;
	}

	public void setRdbtnBugatti(JRadioButton rdbtnBugatti) {
		this.rdbtnBugatti = rdbtnBugatti;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLblLookOfCar() {
		return lblLookOfCar;
	}

	public void setLblLookOfCar(JLabel lblLookOfCar) {
		this.lblLookOfCar = lblLookOfCar;
	}

	public JButton getBtnConfirmChoice() {
		return btnConfirmChoice;
	}

	public void setBtnConfirmChoice(JButton btnConfirmChoice) {
		this.btnConfirmChoice = btnConfirmChoice;
	}

	public JButton getBtnBackToHome() {
		return btnBackToHome;
	}

	public void setBtnBackToHome(JButton btnBackToHome) {
		this.btnBackToHome = btnBackToHome;
	}

	@Override
	public void initPanelView() {
		
		CarChoiceController.getInstance().initController();

		
	}

	
}
