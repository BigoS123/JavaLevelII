package controller;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import app.Application;
import dao.UserDao;
import gui.HomePanel;
import gui.LoginPanel;
import gui.MainFrame;
import model.User;
import util.RacingGameUtil;

public class LoginController implements Controller {

	private static LoginController instance;

	public LoginController() {
		super();
	}
	
	public static LoginController getInstance(){

		if(instance == null){

			instance = new LoginController();
			instance.initController();

		}

		return instance;

	}

	@Override
	public void initController() {
		LoginPanel.getInstance().getBtnLogin().addActionListener(e -> loginUser());
		LoginPanel.getInstance().getBtnAddUser().addActionListener(e -> addUser());
	}


	private void loginUser() {
		
		LoginPanel lp = LoginPanel.getInstance();
		User user = UserDao.logInUser(lp.getTextFieldUserLogin().getText(), (lp.getPasswordFieldUserPassword().getText()));
		if(user==null){
			RacingGameUtil.showErrorMessage(MainFrame.getInstance(), Application.appNameResourceBundle.getString("errorWrongLoginOrPassword"), null);

		}else{
			MainFrame.getInstance().replacePanel(HomePanel.getInstance());
		}
	}

	
	private void addUser() {
		LoginPanel lp = LoginPanel.getInstance();
		UserDao.addUser(lp.getTextFieldUserLogin().getText(), (lp.getPasswordFieldUserPassword().getText()));
	}
	
	

}
