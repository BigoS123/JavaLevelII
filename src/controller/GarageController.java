package controller;

import app.Application;
import gui.GaragePanel;
import gui.HomePanel;
import model.Car;

public class GarageController implements Controller {

	private Car car;
	private GaragePanel garagePanel;
	public GarageController(Car car, GaragePanel garagePanel) {
		super();
		this.car = car;
		this.garagePanel = garagePanel;		
		initView();
		initController();
	}
	@Override
	public void initView() {
		Application.mainFrame.replacePanel(garagePanel);
		
	}
	@Override
	public void initController() {
	garagePanel.getBtnBackToHome().addActionListener(e -> backToHome());
		
	}
	
	private void backToHome(){
		new HomeController(new HomePanel());
	}
}
