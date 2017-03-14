package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import dao.UserDao;
import model.User;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggingScreen {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggingScreen window = new LoggingScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoggingScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textLogin = new JTextField();
		textLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textLogin.setBackground(new Color(255, 255, 255));
		textLogin.setForeground(new Color(0, 0, 0));
		textLogin.setBounds(338, 97, 171, 34);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);

		JLabel lblInsertLogin = new JLabel("Insert login:");
		lblInsertLogin.setForeground(new Color(0, 153, 255));
		lblInsertLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertLogin.setBounds(338, 73, 171, 23);
		frame.getContentPane().add(lblInsertLogin);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBounds(338, 168, 171, 34);
		frame.getContentPane().add(passwordField);

		JLabel lblInsertPassword = new JLabel("Insert password:");
		lblInsertPassword.setBackground(new Color(204, 255, 255));
		lblInsertPassword.setForeground(new Color(0, 153, 255));
		lblInsertPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblInsertPassword.setBounds(338, 143, 171, 23);
		frame.getContentPane().add(lblInsertPassword);

		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addUser();
				HomeScreen.main(null);;
				
			}
		});
		btnNewButton.setBackground(new Color(245, 255, 250));
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.setBounds(338, 225, 171, 43);
		frame.getContentPane().add(btnNewButton);

		JLabel lblWelcomeInRacing = new JLabel("Welcome in RACING GAME");
		lblWelcomeInRacing.setForeground(Color.CYAN);
		lblWelcomeInRacing.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblWelcomeInRacing.setBounds(41, 22, 440, 52);
		frame.getContentPane().add(lblWelcomeInRacing);

		JLabel label = new JLabel("Welcome in RACING GAME");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 37));
		label.setBounds(44, 23, 440, 52);
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\dusk-drive_dynamic_feature.png"));
		lblNewLabel.setBounds(0, -11, 509, 301);
		frame.getContentPane().add(lblNewLabel);
	}

	public void addUser() {
		UserDao userDao = new UserDao();

		User user1 = new User();
		user1.setLogin(textLogin.getText());
		user1.setPassword(passwordField.getText());

		userDao.addUser(user1);
	}
}
