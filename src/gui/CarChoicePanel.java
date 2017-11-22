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
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class CarChoicePanel extends AppPanel implements PanelView {

	private static CarChoicePanel instance;

	private JRadioButton rdbtnBmw;
	private JRadioButton rdbtnAudi;
	private JRadioButton rdbtnBugatti;
	private JLabel lblCarScrenTitle;
	private JLabel lblLookOfCar;
	private JButton btnConfirmChoice;
	private JTextField txtFieldAcceleration;
	private JLabel lblAcceleration;
	private JTextField txtFieldHandling;
	private JTextField txtFieldBraking;

	private JTextField txtFieldTopSpeed;

	private JLabel lblHandling;

	private JLabel lblBraking;

	private JLabel lblTopSpeed;

	public CarChoicePanel() {
		super();

		rdbtnBmw = new JRadioButton("BMW");
		rdbtnBmw.setBounds(79, 506, 109, 23);
		add(rdbtnBmw);

		rdbtnAudi = new JRadioButton("AUDI");
		rdbtnAudi.setBounds(611, 506, 109, 23);
		add(rdbtnAudi);

		rdbtnBugatti = new JRadioButton("BUGATTI");
		rdbtnBugatti.setBounds(1151, 506, 109, 23);
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

		txtFieldAcceleration = new JTextField();
		txtFieldAcceleration.setBounds(89, 546, 86, 20);
		add(txtFieldAcceleration);
		txtFieldAcceleration.setColumns(10);
		txtFieldAcceleration.setEditable(false);

		txtFieldHandling = new JTextField();
		txtFieldHandling.setBounds(89, 566, 86, 20);
		add(txtFieldHandling);
		txtFieldHandling.setColumns(10);
		txtFieldHandling.setEditable(false);

		txtFieldBraking = new JTextField();
		txtFieldBraking.setBounds(89, 586, 86, 20);
		add(txtFieldBraking);
		txtFieldBraking.setColumns(10);
		txtFieldBraking.setEditable(false);

		txtFieldTopSpeed = new JTextField();
		txtFieldTopSpeed.setBounds(89, 606, 86, 20);
		add(txtFieldTopSpeed);
		txtFieldTopSpeed.setColumns(10);
		txtFieldTopSpeed.setEditable(false);
		
		lblAcceleration = new JLabel(Application.appNameResourceBundle.getString("lblAcceleration"));
		lblAcceleration.setBounds(31, 546, 46, 14);
		add(lblAcceleration);
		
		lblHandling = new JLabel(Application.appNameResourceBundle.getString("lblHandling"));
		lblHandling.setBounds(31, 566, 46, 14);
		add(lblHandling);
		
		lblBraking = new JLabel(Application.appNameResourceBundle.getString("lblBraking"));
		lblBraking.setBounds(31, 586, 46, 14);
		add(lblBraking);
		
		lblTopSpeed = new JLabel(Application.appNameResourceBundle.getString("lblTopSpeed"));
		lblTopSpeed.setBounds(31, 606, 46, 14);
		add(lblTopSpeed);
		
		

	}

	public JLabel getLblHandling() {
		return lblHandling;
	}

	public void setLblHandling(JLabel lblHandling) {
		this.lblHandling = lblHandling;
	}

	public JLabel getLblBraking() {
		return lblBraking;
	}

	public void setLblBraking(JLabel lblBraking) {
		this.lblBraking = lblBraking;
	}

	public JLabel getLblTopSpeed() {
		return lblTopSpeed;
	}

	public void setLblTopSpeed(JLabel lblTopSpeed) {
		this.lblTopSpeed = lblTopSpeed;
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

	public JTextField getTxtFieldAcceleration() {
		return txtFieldAcceleration;
	}

	public void setTxtFieldAcceleration(JTextField txtFieldAcceleration) {
		this.txtFieldAcceleration = txtFieldAcceleration;
	}

	public JLabel getLblAcceleration() {
		return lblAcceleration;
	}

	public void setLblAcceleration(JLabel lblAcceleration) {
		this.lblAcceleration = lblAcceleration;
	}

	public JTextField getTxtFieldHandling() {
		return txtFieldHandling;
	}

	public void setTxtFieldHandling(JTextField txtFieldHandling) {
		this.txtFieldHandling = txtFieldHandling;
	}

	public JTextField getTxtFieldBraking() {
		return txtFieldBraking;
	}

	public void setTxtFieldBraking(JTextField txtFieldBraking) {
		this.txtFieldBraking = txtFieldBraking;
	}

	public JTextField getTxtFieldTopSpeed() {
		return txtFieldTopSpeed;
	}

	public void setTxtFieldTopSpeed(JTextField txtFieldTopSpeed) {
		this.txtFieldTopSpeed = txtFieldTopSpeed;
	}

	@Override
	public void initPanelView() {

		CarChoiceController.getInstance().initController();

	}
}
