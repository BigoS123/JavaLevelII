package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import app.Application;
import controller.LoginController;

public class LoginPanel extends AppPanel implements PanelView {

	private static LoginPanel instance;

	private JTextField textFieldUserLogin;
	private JPasswordField passwordFieldUserPassword;
	private JButton btnLogin;
	private JButton btnAddUser;
	private JLabel lblInsertLogin;
	private JLabel lblWelcomeInRacing;

	private BufferedImage image;

	public LoginPanel() {
		super();

		getBtnBack().setLocation(0, 212);
		getBtnBack().setVisible(false);

		textFieldUserLogin = new JTextField();
		textFieldUserLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldUserLogin.setBackground(new Color(255, 255, 255));
		textFieldUserLogin.setForeground(new Color(0, 0, 0));
		textFieldUserLogin.setBounds(328, 77, 171, 34);
		this.add(textFieldUserLogin);
		textFieldUserLogin.setColumns(10);

		lblInsertLogin = new JLabel(Application.appNameResourceBundle.getString("lblInsertLogin"));
		lblInsertLogin.setForeground(new Color(0, 153, 255));
		lblInsertLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertLogin.setBounds(245, 77, 52, 30);

		add(lblInsertLogin);

		passwordFieldUserPassword = new JPasswordField();
		passwordFieldUserPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordFieldUserPassword.setForeground(new Color(0, 0, 0));
		passwordFieldUserPassword.setBounds(328, 122, 171, 34);
		add(passwordFieldUserPassword);

		JLabel lblInsertPassword = new JLabel(Application.appNameResourceBundle.getString("lblInsertPassword"));
		lblInsertPassword.setBackground(new Color(204, 255, 255));
		lblInsertPassword.setForeground(new Color(0, 153, 255));
		lblInsertPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertPassword.setBounds(233, 126, 85, 30);
		add(lblInsertPassword);

		btnAddUser = new JButton(Application.appNameResourceBundle.getString("btnAddUser"));

		btnAddUser.setBackground(new Color(245, 255, 250));
		btnAddUser.setForeground(new Color(0, 0, 139));
		btnAddUser.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddUser.setBounds(365, 660, 171, 43);
		add(btnAddUser);

		lblWelcomeInRacing = new JLabel(Application.appNameResourceBundle.getString("lblWelcomeInRacing"));
		lblWelcomeInRacing.setForeground(Color.CYAN);
		lblWelcomeInRacing.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblWelcomeInRacing.setBounds(41, 22, 440, 52);
		add(lblWelcomeInRacing);

		JLabel label = new JLabel(Application.appNameResourceBundle.getString("label"));
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 37));
		label.setBounds(44, 23, 440, 52);
		add(label);

		btnLogin = new JButton(Application.appNameResourceBundle.getString("btnLogin"));

		btnLogin.setForeground(new Color(0, 0, 139));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnLogin.setBackground(new Color(245, 255, 250));
		btnLogin.setBounds(328, 167, 171, 43);
		add(btnLogin);

		try {
			image = ImageIO.read(getClass().getResource("/img/loginScreen.png"));
		} catch (IOException e) {
			 e.printStackTrace();
		}

	}

	public static LoginPanel getInstance() {
		if (instance == null) {
			instance = new LoginPanel();
		}
		return instance;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}

	public JTextField getTextFieldUserLogin() {
		return textFieldUserLogin;
	}

	public void setTextFieldUserLogin(JTextField textFieldUserLogin) {
		this.textFieldUserLogin = textFieldUserLogin;
	}

	public JPasswordField getPasswordFieldUserPassword() {
		return passwordFieldUserPassword;
	}

	public void setPasswordFieldUserPassword(JPasswordField passwordFieldUserPassword) {
		this.passwordFieldUserPassword = passwordFieldUserPassword;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnAddUser() {
		return btnAddUser;
	}

	public void setBtnAddUser(JButton btnAddUser) {
		this.btnAddUser = btnAddUser;
	}

	public JLabel getLblInsertLogin() {
		return lblInsertLogin;
	}

	public void setLblInsertLogin(JLabel lblInsertLogin) {
		this.lblInsertLogin = lblInsertLogin;
	}

	public JLabel getLblWelcomeInRacing() {
		return lblWelcomeInRacing;
	}

	public void setLblWelcomeInRacing(JLabel lblWelcomeInRacing) {
		this.lblWelcomeInRacing = lblWelcomeInRacing;
	}

	@Override
	public void initPanelView() {

		// LoginPanel.getInstance().getTextFieldUserLogin().setText("halina");
		// LoginPanel.getInstance().getPasswordFieldUserPassword().setText("halina");

		LoginController.getInstance();

	}

}
