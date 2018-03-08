package com.sunyalbany.online.authentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunyalbany.onlineexam.DAO.MCQAnswerDAO;
import com.sunyalbany.onlineexam.DAO.NumaricAnswerDAO;
import com.sunyalbany.onlineexam.objectbeans.MCQ;
import com.sunyalbany.onlineexam.objectbeans.NumaricQ;
import com.sunyalbany.onlineexam.objectbeans.User;

/**
 * Servlet implementation class NumaricQuestionAnswerAction
 */
@WebServlet("/NumaricQuestionAnswerAction")
public class NumaricQuestionAnswerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumaricQuestionAnswerAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User currentUser = (User) request.getSession(false).getAttribute(
				"currentSessionUser");

		if (request.getParameter("s1") != null) {
			NumaricQ mcq = NumaricQ.getInstance();
			int a = Integer.valueOf(request.getParameter("nqid"));
			mcq.setNqid(a);
			mcq.setAnswer(request.getParameter("answer"));
			NumaricQ ss = NumaricAnswerDAO.checkAnswer(mcq, currentUser);
			if (ss.getNqid() > 0) {
				HttpSession session = request.getSession(true);
				session.setAttribute("questions", ss);
				response.sendRedirect("NumaricAnswers.jsp");
			} else {
				response.sendRedirect("main.jsp");
			}

		} else {

			NumaricQ questions = NumaricAnswerDAO.displayQuestion(currentUser, "check");

			if (questions.getNqid() > 0) {
				HttpSession session1 = request.getSession(true);
				session1.setAttribute("questions", questions);
				response.sendRedirect("NumaricAnswers.jsp");
			} else {
				response.sendRedirect("main.jsp");
			}
		}

		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
