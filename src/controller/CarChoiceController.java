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
		initController();
	}

	@Override
	public void initController() {
		carChoicePanel.getBtnBackToHome().addActionListener(e -> backToHomeScreen());
		
	}
	private void backToHomeScreen() {
	
	}
}
