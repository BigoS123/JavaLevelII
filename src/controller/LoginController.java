package controller;

import javax.swing.JPanel;

import app.Application;
import dao.UserDao;
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

	//TODO zrobienie logowania usera z bazy danych jesli nie ma urzytkownika albo haslo jest niepoprwane to wyswietl w konsoli komunikat
	private void loginUser() {
		MainFrame.getInstance().replacePanel(HomePanel.getInstance());
	}

	//TODO dodanie przykladowych userow aut i czesci i zrobic powiazanie miedzy czesciami a samochodami
	private void addUser() {
		LoginPanel lp = LoginPanel.getInstance();
		UserDao.addUser(lp.getTextFieldUserLogin().getText(), (lp.getPasswordFieldUserPassword().getText()));
	}

}
