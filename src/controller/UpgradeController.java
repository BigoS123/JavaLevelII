package controller;

import app.Application;
import gui.CarChoicePanel;
import gui.HomePanel;
import gui.MainFrame;
import gui.UpgradePanel;
import model.Car;

public class UpgradeController implements Controller {

	private static UpgradeController instance;

	public UpgradeController() {
		super();

	}
	
	public static UpgradeController getInstance() {

		if (instance == null) {

			instance = new UpgradeController();

		}

		return instance;
	}
	@Override
	public void initController() {
		UpgradePanel.getInstance().getBtnBack().addActionListener(e -> backToHomePanel());
	}

	private void backToHomePanel() {
		MainFrame.getInstance().replacePanel(HomePanel.getInstance());
	}
	
}
