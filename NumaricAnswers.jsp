<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.sunyalbany.onlineexam.objectbeans.User"
    import="com.sunyalbany.onlineexam.objectbeans.NumaricQ"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	User currentUser = (User) session
			.getAttribute("currentSessionUser");
NumaricQ questions = (NumaricQ) session.getAttribute("questions");

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
        <meta http-equiv="coantent-type" content="text/html; charset=utf-8" />
        <title>PLACE</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="logo">
        </div>
        <hr/>

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
                    <h2 class="title"><a href="#">Online Exam </a></h2>
                    <!--				<p class="meta">Wednesday, May 4, 2011 7:27 AM </p>-->
                    <div class="entry"><br><br>
                                <form action="NumaricQuestionAnswerAction" method="get" >
                                    <center>
                                  
                                        <h2>MCQ Question and Answers</h2> 
                                        <br><br><br>
                                                    <table>
                                                    
                                                     <input type="hidden"  name="checkAnswer" value="check"/>
                                                       <input type="hidden"  name="nqid" value="<%=questions.getNqid() %>"/>
                                                     <tr>
                                                            <td align="left"><strong>Question:</strong> </td>
                                                        
                                                            <td><%=questions.getQuestion()%></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                       <tr>
                                                            <td align="left"><strong>Answer</strong></td>

                                                            <td> <input type="text" align="left" placeholder="Type Your Choice"  name="answer"/></td>
                                                        </tr>
					                                    <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>FeedBack </strong></td>
                                                            <td> <%=questions.getFeedback()%></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
<tr>
                                                            <td align="left"><strong>Hint 1: </strong></td>
                                                            
                                                            <% if(questions.getHint1()!=null){%>
                                                            <td><%=questions.getHint1() %></td>
                                                            <%}%>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                     <tr>
                                                            <td align="left"><strong>Hint 2: </strong></td>
                                                             <% if(questions.getHint2()!=null){%>
                                                            <td><%=questions.getHint2() %></td>
                                                        <%}%>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                     <tr>
                                                            <td align="left"><strong>Hint 3:</strong> </td>
                                                             <% if(questions.getHint3()!=null){%>
                                                            <td> <%=questions.getHint3() %>"</td>
                                                       <%}%>
                                                       
                                                        <tr>
                                                            <td align="left"><strong>Message </strong></td>
                                                             <% if(questions.getMessage()!=null){%>
                                                            <td> <%=questions.getMessage()%></td>
                                                            <td>Right answer <%=questions.getAnswer()%></td>
                                                             <%}%>
                                                        </tr>
                                                       
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>

                                                        <tr>
                                                            <td>
                                                                
                                                                <input type="submit" value="submit" name="s1" style="height: 25px;width: 160px;"/>
                                                                <input type="submit" value="NextQuestion" name="s2"style="height: 25px;width: 160px;"/>
                                                            </td>
                                                        </tr>



                                                    </table>

                                                    </center>

                                                    </form>
                                                    </div>
                                                    </div>


                                                    </div>
                                                    <div style="clear: both;">&nbsp;</div>
                                                    </div>

                                                    <div id="footer">


                                                    </div>

                                                    </body>
                                                    </html>

