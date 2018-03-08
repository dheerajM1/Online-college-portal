package com.sunyalbany.onlineexam.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunyalbany.onlineexam.DBConnection.DBConnection;
import com.sunyalbany.onlineexam.objectbeans.MCQ;
import com.sunyalbany.onlineexam.objectbeans.NumaricQ;
import com.sunyalbany.onlineexam.objectbeans.User;

public class NumaricAnswerDAO {


	public static NumaricQ displayQuestion(User currentUser, String string) {
		NumaricQ mcq = NumaricQ.getInstance();
		int number = 0;
		Connection con, con1, con2 = null;
		PreparedStatement preparedStatement, preparedStatement1, pr2, pr3 = null;

		try {
			con = DBConnection.getconnection();
			String query = "select numberOfNumaricID from user where username=?";
			preparedStatement1 = con.prepareStatement(query);
			preparedStatement1.setString(1, currentUser.getUserName());

			ResultSet rs = preparedStatement1.executeQuery();
			if (rs.next()) {
				number = rs.getInt(1);

			}
			String query1 = "select * from numaric where nuq_id =" + number;

			preparedStatement = con.prepareStatement(query1);
			ResultSet res = preparedStatement.executeQuery();

			preparedStatement = con.prepareStatement(query);

			if (res.next()) {
				mcq.setNqid(res.getInt(1));
				mcq.setQuestion(res.getString(2));
				if (currentUser.getAttempt() == 1||currentUser.getAttempt() == 2||currentUser.getAttempt() == 3) {
					mcq.setHint1(res.getString(4));
				}
				if (currentUser.getAttempt() == 2||currentUser.getAttempt() == 3) {
					mcq.setHint2(res.getString(5));
				}
				if (currentUser.getAttempt() == 3) {
					mcq.setHint3(res.getString(6));
				}
				mcq.setFeedback(res.getString(7));
				mcq.setAnswer(res.getString(3));
			}

			String quer3 = "select max(nuq_id) from numaric";
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
				pr2.setInt(1, mcq.getNqid() + 1);
				pr2.setString(2, currentUser.getUserName());
				pr2.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mcq;
	}

	public static NumaricQ checkAnswer(NumaricQ mcq, User currentUser) {
		NumaricQ mc = null;
		String a;
		Connection con, con1 = null;
		PreparedStatement preparedStatement, preparedStatement1, pst2 = null;

		try {
			con = DBConnection.getconnection();
			String query1 = "select * from numaric where nuq_id =" + mcq.getNqid();

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
