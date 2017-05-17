package model;

import java.util.ArrayList;
import java.util.List;

public class User {
//TODO stworzyc tabele na bazie danych odpowiadajace modela w javie
// TODO stworzyc plik sql z instertami czyli dodawanie recordu do bazy
	int id;
	String login;
	String password;
	List<Car> cars = new ArrayList<Car>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
}
