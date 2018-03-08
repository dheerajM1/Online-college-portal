package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.User;


public class RegistrationDao {

	public static String registerUser(User userReg) {
		Connection con = null;
		PreparedStatement preparedStatement, preparedStatement1 = null;

		try {
			con = DBConnection.getconnection();
			String query1 = "select * from user where userName=?";
			preparedStatement1 = con.prepareStatement(query1);
			preparedStatement1.setString(1, userReg.getUserName());
			ResultSet rs = preparedStatement1.executeQuery();
			if (rs.next()) {
				return "EXITS";
			}

			String query = "insert into user(user_id,firstName,lastName,userName,password,role) values (?,?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, null);
			preparedStatement.setString(2, userReg.getFirstName());
			preparedStatement.setString(3, userReg.getLastName());
			preparedStatement.setString(4, userReg.getUserName());
			preparedStatement.setString(5, userReg.getPassword());
			preparedStatement.setString(6, userReg.getRole());
			int i = preparedStatement.executeUpdate();
			if (i != 0) {
				return "SUCESS";
			}
			return "FAIL";

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "WRONG";

	}

}
