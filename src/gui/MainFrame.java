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

	private static final MainFrame INSTANCE = new MainFrame();
	
	public static JPanel contentPane;

	public MainFrame() {
		super(RacingGameConstants.GAME_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,	100, 1366, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setVisible(true);
	}
	
	public static MainFrame getInstance(){
		return MainFrame.INSTANCE;
	}
	
	public void init(){
		replacePanel(LoginPanel.getInstance());
		}
	
	public void replacePanel(PanelView newPanel){
		getContentPane().removeAll();
		getContentPane().add((JPanel)newPanel);
		revalidate();
		repaint();
		newPanel.initPanelView();
	}
	
}
