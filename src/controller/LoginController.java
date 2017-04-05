package controller;

import javax.swing.JPanel;

import app.Application;
import gui.HomePanel;
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
		initController();
	}

	@Override
	public void initView() {
		Application.mainFrame.replacePanel(loginPanel);
		loginPanel.getTextFieldUserLogin().setText("halina");
		loginPanel.getPasswordFieldUserPassword().setText("halina");
	}

	@Override
	public void initController() {
		loginPanel.getBtnLogin().addActionListener(e -> loginUser());
		loginPanel.getBtnAddUser().addActionListener(e -> addUser());
	}

	private void loginUser() {
		new HomeController(new HomePanel());
	}

	private void addUser() {
		System.out.println("Add user");
	}

}
