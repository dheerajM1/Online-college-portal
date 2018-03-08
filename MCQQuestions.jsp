<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.sunyalbany.onlineexam.objectbeans.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                                <form action="MCQAction" method="post" id="queryform">
                                    <center>
                                  
                                        <h2>Create a MCQ Question</h2> 
                                        <br><br><br>
                                                    <table>
                                                     <tr>
                                                            <td align="left"><strong>Question:</strong> </td>
                                                        
                                                            <td> <textarea rows="8" cols="50" align="left" name="question"> </textarea></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>Choice A: </strong></td>

                                                            <td> <input type="text" align="left" placeholder="Type Your Choice"  name="choiceA"/></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>Choice B: </strong></td>

                                                            <td> <input type="text" align="left" placeholder="Type Your Choice"  name="choiceB"/></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>Choice C:</strong> </td>

                                                            <td> <input type="text" align="left" placeholder="Type Your Choice"  name="choiceC"/></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>Choice D:</strong> </td>

                                                            <td> <input type="text" align="left" placeholder="Type Your Choice"  name="choiceD"/></td>
                                                        </tr>
                                                         <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                        <td ><strong>Answer : </strong> </td>
                                        <td>
                                            <select name="answer">
                                                <option>A</option>
                                                <option>B</option>
                                                <option>C</option>
                                                <option>D</option>
                                            </select>
                                        </td>
                                    </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
<tr>
                                                            <td align="left"><strong>Hint 1: </strong></td>
                                                            <td> <textarea rows="3" cols="50" align="left" name="hint1"> </textarea></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                     <tr>
                                                            <td align="left"><strong>Hint 2: </strong></td>
                                                            <td> <textarea rows="3" cols="50" align="left" name="hint2"> </textarea></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                     <tr>
                                                            <td align="left"><strong>Hint 3:</strong> </td>
                                                            <td> <textarea rows="3" cols="50" align="left" name="hint3"> </textarea></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>
                                                        <tr>
                                                            <td align="left"><strong>FeedBack </strong></td>
                                                            <td> <textarea rows="3" cols="50" align="left" name="feedback"> </textarea></td>
                                                        </tr>
                                                        <tr></tr> <tr></tr> <tr></tr>

                                                        <tr>
                                                            <td>
                                                                
                                                                <input type="submit" value="Sava and Next Question"  style="height: 25px;width: 160px;"/>
                                                                <input type="submit" value="Iam done" style="height: 25px;width: 160px;"/>
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

