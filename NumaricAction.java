package com.sunyalbany.online.authentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunyalbany.onlineexam.DAO.MCQDao;
import com.sunyalbany.onlineexam.DAO.NumaricDAO;
import com.sunyalbany.onlineexam.objectbeans.MCQ;
import com.sunyalbany.onlineexam.objectbeans.NumaricQ;

/**
 * Servlet implementation class NumaricAction
 */
@WebServlet("/NumaricAction")
public class NumaricAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumaricAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		NumaricQ mcq = NumaricQ.getInstance();
		mcq.setQuestion(request.getParameter("question"));
		mcq.setAnswer(request.getParameter("answer"));
		mcq.setHint1(request.getParameter("hint1"));
		mcq.setHint2(request.getParameter("hint2"));
		mcq.setHint3(request.getParameter("hint3"));
		mcq.setFeedback(request.getParameter("feedback"));
		boolean flag  = NumaricDAO.createQuestion(mcq);
		if (flag) {
			HttpSession session = request.getSession(true);
			if(request.getParameter("Iamdone")!=null){
				response.sendRedirect("main.jsp");
			}else{
			response.sendRedirect("NumaricQuestions.jsp");
			}
		}
		else{
			response.sendRedirect("NumaricQuestions.jsp?message=fail");
		}

	}

}
