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
		initView();
		initController();
	}

	@Override
	public void initView() {
		Application.mainFrame.replacePanel(upgradePanel);
		
	}

	@Override
	public void initController() {
		
		
	}

	
}
