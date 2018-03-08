package com.sunyalbany.online.authentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunyalbany.onlineexam.DAO.LoginDAO;
import com.sunyalbany.onlineexam.objectbeans.User;



/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		User userReg = User.getInstance();
		userReg.setUserName(request.getParameter("userName"));
		userReg.setPassword(request.getParameter("password"));
		userReg = LoginDAO.authanticateUser(userReg);
		if (userReg.getIsValid()) {
			HttpSession session = request.getSession(true);
			session.setAttribute("currentSessionUser", userReg);
			response.sendRedirect("main.jsp");
		}
		else{
			response.sendRedirect("index.jsp?message=fail");
		}

	}

}
