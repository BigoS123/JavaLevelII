package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import model.Car;
import model.User;

public class CarDao {

	public static List<Car> getAllCars ( ){
		List<Car> cars = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Connection connection = null;
		Car car = null;
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("select * from car;");

			rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				cars = new ArrayList<Car>();
				do {
					car = new Car();
					car.setId(rs.getInt(1));
					car.setName(rs.getString(2));
					car.setAcceleration(rs.getInt(3));
					car.setHandling(rs.getInt(4));
					car.setBraking(rs.getInt(5));
					car.setTopSpeed(rs.getInt(6));
					cars.add(car);
				} while(rs.next());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement, rs);
		}
		return cars;
	}
}
