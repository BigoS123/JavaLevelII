package model;

import java.util.ArrayList;
import java.util.List;

public class User {
//TODO stworzyc tabele na bazie danych odpowiadajace modela w javie (na nastepnej lekcji)
// TODO stworzyc plik sql z instertami czyli dodawanie recordu do bazy (na nastepnej lekcji)


	private int id;
	private String login;
	private String password;
	private int coins;
	private List<UserCar> userCars;
	
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
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public List<UserCar> getUserCars() {
		return userCars;
	}
	public void setUserCars(List<UserCar> userCars) {
		this.userCars = userCars;
	}
	
	
	
}
