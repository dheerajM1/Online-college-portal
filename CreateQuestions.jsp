
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.sunyalbany.onlineexam.objectbeans.User"%>
<%
	User currentUser = (User) session
			.getAttribute("currentSessionUser");

	String message = request.getParameter("message");
	if (message != null && message.equalsIgnoreCase("WRONG")) {
		out.println("<h3><font color='Green'>Something went wrong please try again</font></h3>");
	}
	if (message != null && message.equalsIgnoreCase("sucess")) {
		out.println("<h3><font color='Green'>SucessFully submitted your leave request</font></h3>");
	}
	if (message != null && message.equalsIgnoreCase("fail")) {
		out.println("<h3><font color='Green'>Something went wrong please try again</font></h3>");
	}
%>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>PLACE</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>

	<div id="logo"></div>
	<hr />

	<div id="header">
		<div id="menu">
			<ul>
				<li><a href="main.jsp" class="first">Home</a></li>
<li><a href="${pageContext.request.contextPath}/Logout">Logout</a></li>

			</ul>
		</div>



	</div>

	<div id="page">
		<div id="content">
			<div class="post">
				<h2 class="title">
					<a href="#">Online Exam </a>
				</h2>
				<!--				<p class="meta">Wednesday, May 4, 2011 7:27 AM </p>-->
				<div class="entry">
					<br> <br>
										
						<center>
							
							<div style="display: flex">
								<a href="MCQQuestions.jsp">
									<div style="flex: 1; padding-right: 5px;">
										<img src="images/MCQ.jpg"  width="80%"  height="40%">
									</div><strong>Multiple Choices Questions</strong></a> <a href="NumaricQuestions.jsp"> <div style="flex: 1; padding-left: 5px;">
										<img src="images/numaric.jpg" width="80%"  height="40%">
									</div>
								<strong>Numeric Questions</strong></a>
							</div>
						</center>

					
				</div>
			</div>


		</div>

		<div style="clear: both;">&nbsp;</div>
	</div>

	<div id="footer">
		<p>
	</div>

</body>
</html>

					
