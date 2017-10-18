package controller;

import gui.CarChoicePanel;
import gui.HomePanel;
import gui.MainFrame;

public class CarChoiceController implements Controller {

	private static CarChoiceController instance;

	public CarChoiceController() {
		super();
		
	}
	
	@Override
	public void initController() {
		CarChoicePanel.getInstance().getBtnBack().addActionListener(e -> backToHomePanel());
	}

	private void backToHomePanel() {
		MainFrame.getInstance().replacePanel(HomePanel.getInstance());
	}

	public static CarChoiceController getInstance(){

		if(instance == null){

			instance = new CarChoiceController();

		}

		return instance;
	}
}
