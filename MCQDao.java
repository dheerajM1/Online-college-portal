package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.MCQ;

public class MCQDao {

	public static boolean createQuestion(MCQ mcq) {
		Connection con = null;
		PreparedStatement preparedStatement, preparedStatement1 = null;

		try {
			con = DBConnection.getconnection();

			String query = "insert into mcq(mcqId,question,choiceA,choiceB,choiceC,choiceD,answer,hint1,hint2,hint3,feedback) values (?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, null);
			preparedStatement.setString(2, mcq.getQuestion());
			preparedStatement.setString(3, mcq.getChoiceA());
			preparedStatement.setString(4, mcq.getChoiceB());
			preparedStatement.setString(5, mcq.getChoiceC());
			preparedStatement.setString(6, mcq.getChoiceD());
			preparedStatement.setString(7, mcq.getAnswer());
			preparedStatement.setString(8, mcq.getHint1());
			preparedStatement.setString(9, mcq.getHint2());
			preparedStatement.setString(10, mcq.getHint3());
			preparedStatement.setString(11, mcq.getFeedback());
			
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
