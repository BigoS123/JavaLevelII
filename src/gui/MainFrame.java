package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.Application;
import constants.RacingGameConstants;

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
		
		
		//TODO do dokonczenia inicjacja pierwszego panelu poprzez controller
//		FirstPanel firstPanel = new FirstPanel();
//		Controller
//		contentPane.add(firstPanel);
		
		
		

	}
	
	public void replacePanel(JPanel newPanel){
		getContentPane().removeAll();
		getContentPane().add(newPanel);
		validate();
		repaint();
	}
	
}
