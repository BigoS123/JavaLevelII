package controller;

import app.Application;
import gui.CarChoicePanel;
import gui.HomePanel;
import model.Car;

public class CarChoiceController implements Controller{

	private Car car;
	private CarChoicePanel carChoicePanel;
	
	
	public CarChoiceController(Car car, CarChoicePanel carChoicePanel) {
		super();
		this.car = car;
		this.carChoicePanel = carChoicePanel;
		initView();
		initController();
	}
	@Override
	public void initView() {
		Application.mainFrame.replacePanel(carChoicePanel);
		
	}
	@Override
	public void initController() {
		carChoicePanel.getBtnBackToHome().addActionListener(e -> backToHomeScreen());
		
	}
	private void backToHomeScreen() {
		new HomeController(new HomePanel());
	}
}
