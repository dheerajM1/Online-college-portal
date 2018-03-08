package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.User;




public class LoginDAO {

	public static User authanticateUser(User userReg) {
		Connection con = null;
		PreparedStatement preparedStatement1 = null;
		try {
			con = DBConnection.getconnection();
			String query1 = "select * from user where username=? and password=? ";
			preparedStatement1 = con.prepareStatement(query1);
			preparedStatement1.setString(1, userReg.getUserName());
			preparedStatement1.setString(2, userReg.getPassword());
			ResultSet rs = preparedStatement1.executeQuery();
			if (rs.next()) {
				userReg.setUser_id(rs.getString(1));
				userReg.setIsValid(true);
				return userReg;
			} else {
				userReg.setIsValid(false);
			}

		} catch (SQLException e) {
		}

		return userReg;
	}

}
