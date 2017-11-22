package controller;

import java.util.List;

import dao.CarDao;
import gui.CarChoicePanel;
import gui.HomePanel;
import gui.MainFrame;
import model.Car;

public class CarChoiceController implements Controller {

	private static CarChoiceController instance;

	public CarChoiceController() {
		super();
		
	}
	
	@Override
	public void initController() {
		CarChoicePanel.getInstance().getBtnBack().addActionListener(e -> backToHomePanel());
		List<Car> cars = CarDao.getAllCars();
		Car car = null;
		//Dodanie innych labelow tlumaczen i wartosci dla pol accleratrion branking itd. 
		for(int i =0; i< cars.size(); i++) {
			car = cars.get(i);
			CarChoicePanel.getInstance().getTxtFieldAcceleration().setText(Integer.toString(car.getAcceleration()));
			CarChoicePanel.getInstance().getTxtFieldHandling().setText(Integer.toString(car.getHandling()));
			CarChoicePanel.getInstance().getTxtFieldBraking().setText(Integer.toString(car.getBraking()));
			CarChoicePanel.getInstance().getTxtFieldTopSpeed().setText(Integer.toString(car.getTopSpeed()));
		}
		
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
