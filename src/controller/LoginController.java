package controller;

import javax.swing.JPanel;

import gui.LoginPanel;
import model.User;

public class LoginController implements Controller {

	private User user;
	private LoginPanel loginPanel;
	
	public LoginController(User user, LoginPanel loginPanel) {
		super();
		this.user = user;
		this.loginPanel = loginPanel;
		initView();
	}

	@Override
	public void initView() {
		loginPanel.getTextFieldUserLogin().setText("halina");
		loginPanel.getPasswordFieldUserPassword().setText("halina");
	}

	@Override
	public void initController() {
		loginPanel.getBtnLogin().addActionListener(e -> loginUser());
		loginPanel.getBtnAddUser().addActionListener(e -> addUser());
	}
	
	private void loginUser(){
		
	}

	private void addUser(){
		
	}
	
}
