package gui;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class LoggingPanel extends JPanel {

	private JTextField textLogin;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public LoggingPanel() {
		setLayout(null);

		textLogin = new JTextField();
		textLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textLogin.setBackground(new Color(255, 255, 255));
		textLogin.setForeground(new Color(0, 0, 0));
		textLogin.setBounds(328, 77, 171, 34);
		this.add(textLogin);
		textLogin.setColumns(10);

		JLabel lblInsertLogin = new JLabel("Login:");
		lblInsertLogin.setForeground(new Color(0, 153, 255));
		lblInsertLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertLogin.setBounds(245, 77, 52, 30);
		add(lblInsertLogin);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBounds(328, 122, 171, 34);
		add(passwordField);

		JLabel lblInsertPassword = new JLabel("Password:");
		lblInsertPassword.setBackground(new Color(204, 255, 255));
		lblInsertPassword.setForeground(new Color(0, 153, 255));
		lblInsertPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertPassword.setBounds(233, 126, 85, 30);
		add(lblInsertPassword);

		JButton btnAddUser = new JButton("Add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnAddUser.setBackground(new Color(245, 255, 250));
		btnAddUser.setForeground(new Color(0, 0, 139));
		btnAddUser.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddUser.setBounds(1175, 684, 171, 43);
		add(btnAddUser);

		JLabel lblWelcomeInRacing = new JLabel("Welcome in RACING GAME");
		lblWelcomeInRacing.setForeground(Color.CYAN);
		lblWelcomeInRacing.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblWelcomeInRacing.setBounds(41, 22, 440, 52);
		add(lblWelcomeInRacing);

		JLabel label = new JLabel("Welcome in RACING GAME");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 37));
		label.setBounds(44, 23, 440, 52);
		add(label);

		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logInUser();

			}
		});
		btnLogin.setForeground(new Color(0, 0, 139));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnLogin.setBackground(new Color(245, 255, 250));
		btnLogin.setBounds(1175, 594, 171, 43);
		add(btnLogin);

	}

	public void logInUser() {

		
	}

}
