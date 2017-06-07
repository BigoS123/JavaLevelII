package controller;

import javax.swing.JPanel;

import app.Application;
import gui.HomePanel;
import gui.LoginPanel;
import gui.MainFrame;
import model.User;

public class LoginController implements Controller {

	private static LoginController instance;
	
	private User user;
	private LoginPanel loginPanel;

	public LoginController() {
		super();
	}
	
	public static LoginController getInstance(){

		if(instance == null){

			instance = new LoginController();

		}

		return instance;

	}

	@Override
	public void initController() {
		LoginPanel.getInstance().getBtnLogin().addActionListener(e -> loginUser());
		LoginPanel.getInstance().getBtnAddUser().addActionListener(e -> addUser());
	}

	private void loginUser() {
		MainFrame.getInstance().replacePanel(HomePanel.getInstance());
	}

	private void addUser() {
		System.out.println("Add user");
	}

}
