package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBConnection;
import model.User;

public class UserDao {

	public static void addUser(String login, String password) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection
					.prepareStatement("insert into user (login, password) values (?, ?)");

			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(connection, preparedStatement);
		}
	}
	

	public static User logInUser(String login, String password) {
		
		User user  = null;
		
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Connection connection = null;
		try {
			connection = DBConnection.getConnection();
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
			DBConnection.close(connection, preparedStatement, rs);
		}
		return user;
	}
	
}
