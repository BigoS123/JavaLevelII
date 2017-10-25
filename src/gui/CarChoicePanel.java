package gui;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import app.Application;
import controller.CarChoiceController;
import controller.HomeController;
import controller.LoginController;

public class CarChoicePanel extends AppPanel implements PanelView {

	private static CarChoicePanel instance;
	
	private JRadioButton rdbtnBmw;
	private JRadioButton rdbtnAudi;
	private JRadioButton rdbtnBugatti;
	private JLabel lblCarScrenTitle;
	private JLabel lblLookOfCar;
	private JButton btnConfirmChoice;
	
	public CarChoicePanel() {
		super();

		
		rdbtnBmw = new JRadioButton("BMW");
		rdbtnBmw.setBounds(79, 556, 109, 23);
		add(rdbtnBmw);
		
		rdbtnAudi = new JRadioButton("AUDI");
		rdbtnAudi.setBounds(611, 556, 109, 23);
		add(rdbtnAudi);
		
		rdbtnBugatti = new JRadioButton("BUGATTI");
		rdbtnBugatti.setBounds(1151, 556, 109, 23);
		add(rdbtnBugatti);
		
		lblCarScrenTitle = new JLabel(Application.appNameResourceBundle.getString("lblCarScrenTitle"));
		lblCarScrenTitle.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblCarScrenTitle.setBounds(79, 11, 504, 69);
		add(lblCarScrenTitle);

		
		lblLookOfCar = new JLabel(Application.appNameResourceBundle.getString("lblLookOfCar"));
		lblLookOfCar.setBounds(79, 61, 229, 23);
		add(lblLookOfCar);
		
		btnConfirmChoice = new JButton(Application.appNameResourceBundle.getString("btnConfirmChoice"));
		btnConfirmChoice.setBounds(1058, 650, 202, 50);
		add(btnConfirmChoice);
		
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
		return lblCarScrenTitle;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblCarScrenTitle = lblNewLabel;
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


	@Override
	public void initPanelView() {
		
		CarChoiceController.getInstance().initController();

		
	}

	
}
