package model;

public class CarPart {

	private int id;
	private int engine;
	private int brakes;
	private int tyres;
	private int suspention;
	private int turbo;
	private CarPart carPart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getBrakes() {
		return brakes;
	}

	public void setBrakes(int brakes) {
		this.brakes = brakes;
	}

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public int getSuspention() {
		return suspention;
	}

	public void setSuspention(int suspention) {
		this.suspention = suspention;
	}

	public int getTurbo() {
		return turbo;
	}

	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}

	public CarPart getCarPart() {
		return carPart;
	}

	public void setCarPart(CarPart carPart) {
		this.carPart = carPart;
	}

}
