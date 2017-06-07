package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.MySQLAccess;

public class UserDao {

	private Connection connection;
	
	public UserDao() {
		connection = MySQLAccess.getConnection();
	}

	public void addUser(String login, String password) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection
					.prepareStatement("insert into user (login, password) values (?, ?)");

			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySQLAccess.close(connection, null, preparedStatement);
		}
	}
	

	public User logInUser(String login, String password) {
		
		User user  = null;
		
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		try {
			preparedStatement = connection
					.prepareStatement("select * from user where login = ? and password = ?;");

			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			rs = preparedStatement.executeQuery();
			
			if(rs.next()){
				user = new User();
				user.setId(rs.getInt(1));
				user.setLogin(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySQLAccess.close(connection, null, preparedStatement);
		}
		return user;
	}
	
}
