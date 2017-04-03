package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.Application;
import constants.RacingGameConstants;
import controller.LoginController;
import model.User;

public class MainFrame extends JFrame {

	public static JPanel contentPane;

	public MainFrame() {
		super(RacingGameConstants.GAME_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
	}
	
	public void init(){
		//TODO do dokonczenia inicjacja pierwszego panelu poprzez controller
		LoginController loginController = new LoginController(new User(), new LoginPanel());

	}
	
	public void replacePanel(JPanel newPanel){
		getContentPane().removeAll();
		getContentPane().add(newPanel);
		revalidate();
		repaint();
	}
	
}
