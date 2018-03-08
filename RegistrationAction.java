package com.sunyalbany.online.authentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunyalbany.onlineexam.DAO.RegistrationDao;
import com.sunyalbany.onlineexam.objectbeans.User;


/**
 * Servlet implementation class RegistrationAction
 */
@WebServlet("/RegistrationAction")
public class RegistrationAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		User userReg = User.getInstance();
		userReg.setUserName(request.getParameter("userName"));
		userReg.setPassword(request.getParameter("password"));
		userReg.setFirstName(request.getParameter("firstName"));
		userReg.setLastName(request.getParameter("lastName"));
		userReg.setRole(request.getParameter("role"));
		

		String flag = RegistrationDao.registerUser(userReg);

		if (flag.equals("EXITS")) {

			response.sendRedirect("index.jsp?message=Exits");

		} else if (flag.equals("SUCESS")) {
			
			response.sendRedirect("index.jsp?message=sucess");

		} else if (flag.equals("FAIL")) {
			response.sendRedirect("index.jsp?message=fail");

		}

	}

}
