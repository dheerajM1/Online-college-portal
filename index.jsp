<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Online Exam</title>
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
				<li><a href="index.html" class="first">Home</a></li>

			</ul>
		</div>

		<div id="search">
			<form method="get" action="">

			</form>
		</div>

	</div>
<%
		String message = request.getParameter("message");
		if (message != null && message.equalsIgnoreCase("SUCESS")) {

			out.println("<h3><font color='Green'>Registration Sucessful .Please Login </font></h3>");

		} 
	%>
	<div id="page">
		<div id="content">
			<div class="post">
				<h2 class="title">
					<a href="#">Online Exam</a>
				</h2>
				<!--				<p class="meta">Wednesday, May 4, 2011 7:27 AM </p>-->
				<div class="entry">
					<p>Online Exam</p>

				</div>
			</div>


		</div>
		<div id="sidebar">
			<ul>

				<li>
					<h2>Categories</h2>
					<ul>
						<li><a href="signup.jsp">Sign Up </a></li>
						<li><a href="signIn.jsp">Sign In</a></li>


					</ul>
				</li>

			</ul>
		</div>
		<div style="clear: both;">&nbsp;</div>
	</div>

	<div id="footer">
		<p>Design by
	</div>

</body>
</html>
