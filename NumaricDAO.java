package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.MCQ;
import com.sunyalbany.onlineexam.objectbeans.NumaricQ;

public class NumaricDAO {


	public static boolean createQuestion(NumaricQ mcq) {
		Connection con = null;
		PreparedStatement preparedStatement, preparedStatement1 = null;

		try {
			con = DBConnection.getconnection();

			String query = "insert into numaric(nuq_id,question,answer,hint1,hint2,hint3,feedback) values (?,?,?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, null);
			preparedStatement.setString(2, mcq.getQuestion());
			preparedStatement.setString(3, mcq.getAnswer());
			preparedStatement.setString(4, mcq.getHint1());
			preparedStatement.setString(5, mcq.getHint2());
			preparedStatement.setString(6, mcq.getHint3());
			preparedStatement.setString(7, mcq.getFeedback());
			
			int i = preparedStatement.executeUpdate();
			if (i != 0) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}



}
