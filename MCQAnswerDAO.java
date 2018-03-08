package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.MCQ;
import com.sunyalbany.onlineexam.objectbeans.User;

public class MCQAnswerDAO {

	public static MCQ displayQuestion(User currentUser, String string) {
		MCQ mcq = MCQ.getInstance();
		int number = 0;
		Connection con, con1, con2 = null;
		PreparedStatement preparedStatement, preparedStatement1, pr2, pr3 = null;

		try {
			con = DBConnection.getconnection();
			String query = "select numberOfMCQID from user where username=?";
			preparedStatement1 = con.prepareStatement(query);
			preparedStatement1.setString(1, currentUser.getUserName());

			ResultSet rs = preparedStatement1.executeQuery();
			if (rs.next()) {
				number = rs.getInt(1);

			}
			String query1 = "select * from mcq where mcqId =" + number;

			preparedStatement = con.prepareStatement(query1);
			ResultSet res = preparedStatement.executeQuery();

			preparedStatement = con.prepareStatement(query);

			if (res.next()) {
				mcq.setMcqID(res.getInt(1));
				mcq.setQuestion(res.getString(2));
				mcq.setChoiceA(res.getString(3));
				mcq.setChoiceB(res.getString(4));
				mcq.setChoiceC(res.getString(5));
				mcq.setChoiceD(res.getString(6));
				if (currentUser.getAttempt() == 1||currentUser.getAttempt() == 2||currentUser.getAttempt() == 3) {
					mcq.setHint1(res.getString(7));
				}
				if (currentUser.getAttempt() == 2||currentUser.getAttempt() == 3) {
					mcq.setHint2(res.getString(8));
				}
				if (currentUser.getAttempt() == 3) {
					mcq.setHint3(res.getString(9));
				}
				mcq.setFeedback(res.getString(10));
				mcq.setAnswer(res.getString(11));
			}

			String quer3 = "select max(mcqId) from mcq";
			con2 = DBConnection.getconnection();
			pr3 = con2.prepareStatement(quer3);

			ResultSet rr = pr3.executeQuery();
			if (rr.next()) {
				int i = rr.getInt(1);
				if (i == number) {
					mcq.setMessage("This is the last question");
				}
			}
			if (string.equals("correct")) {

				mcq.setMessage("Correct");
				String quer1 = "update user set numberOfMCQID=? where username=?";
				con1 = DBConnection.getconnection();
				pr2 = con1.prepareStatement(quer1);
				pr2.setInt(1, mcq.getMcqID() + 1);
				pr2.setString(2, currentUser.getUserName());
				pr2.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mcq;
	}

	public static MCQ checkAnswer(MCQ mcq, User currentUser) {
		MCQ mc = null;
		String a;
		Connection con, con1 = null;
		PreparedStatement preparedStatement, preparedStatement1, pst2 = null;

		try {
			con = DBConnection.getconnection();
			String query1 = "select * from mcq where mcqId =" + mcq.getMcqID();

			preparedStatement = con.prepareStatement(query1);
			ResultSet res = preparedStatement.executeQuery();

			if (res.next()) {

				a = res.getString("answer");
				con1 = DBConnection.getconnection();

				if (a.equals(mcq.getAnswer())) {
					mc = displayQuestion(currentUser, "correct");

				} else {
					currentUser.setAttempt(currentUser.getAttempt() + 1);
					mc = displayQuestion(currentUser, "wrong");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mc;

	}

}
