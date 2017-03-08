package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;
import util.MySQLAccess;

public class UserDao {

	private Connection connection;
	
	public UserDao() {
		connection = MySQLAccess.getConnection();
	}

	public void addUser(User user) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection
					.prepareStatement("insert into user (login, password) values (?, ?)");

			preparedStatement.setString(1, user.getLogin());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySQLAccess.close(connection, null, preparedStatement);
		}
	}
	
	
}
