package controller;

import app.Application;
import gui.UpgradePanel;
import model.Car;

public class UpgradeController implements Controller {

	private Car car;
	private UpgradePanel upgradePanel;

	public UpgradeController(Car car, UpgradePanel upgradePanel) {
		super();
		this.car = car;
		this.upgradePanel = upgradePanel;
		initController();
	}

	@Override
	public void initController() {
		
		
	}

	
}
