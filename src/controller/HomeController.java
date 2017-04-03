package controller;

import app.Application;
import gui.HomePanel;
import gui.LoginPanel;
import model.User;

public class HomeController implements Controller {

	private HomePanel homePanel;

	public HomeController(HomePanel homePanel) {
		super();
		this.homePanel = homePanel;
		initView();
		initController();
	}

	@Override
	public void initView() {
		Application.mainFrame.replacePanel(homePanel);
		
	}

	@Override
	public void initController() {
		homePanel.getBtnBackToLoginPanel().addActionListener(e -> backToLoginPanel());
		
	}
	
	private void backToLoginPanel(){
		new LoginController(new User(), new LoginPanel());
	}
	
}
