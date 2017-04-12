package controller;

import app.Application;
import gui.CarChoicePanel;
import gui.HomePanel;
import gui.LoginPanel;
import model.Car;
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
		homePanel.getBtnBack().addActionListener(e -> backToLoginPanel());
		homePanel.getBtnGoToNextScreen().addActionListener(e -> goToCarChoicePanel());
		
	}
	
	private void backToLoginPanel(){
		new LoginController(new User(), new LoginPanel());
	}
	private void goToCarChoicePanel(){
		new CarChoiceController(new Car(),new CarChoicePanel());
	}
	
}
