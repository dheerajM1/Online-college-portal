<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Event File Automation</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <script src="JS/mentor_validate.js"></script>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="logo">
        </div>
        <hr/>

        <div id="header">
            <div id="menu">
                <ul>
                    <li><a href="index.jsp" class="first">Home</a></li>
                </ul>
            </div>

        </div>

        <div id="page">
            <div id="content">
                <div class="post">
                    <h2 class="title"><a href="#">Online Exam </a></h2>
                    <!--				<p class="meta">Wednesday, May 4, 2011 7:27 AM </p>-->
                    <div class="entry"><br><br>
                                <form action="RegistrationAction" method="post" id="mreg" onSubmit="return regvalidate();" name="registration">
                            <center>
                                <h2>User Registration</h2>
                                <br><br><br>
                                <table>
                                    <tr>
                                        <td align="right">First Name:</td><td> <input type="text" align="left" name="firstName"/></td>
                                    </tr>
                                    <tr></tr> <tr></tr> <tr></tr>
                                    

                                    <tr>
                                        <td align="right">Last Name:</td><td> <input type="text" align="left" name="lastName"/></td>
                                    </tr>
                                    <tr></tr> <tr></tr> <tr></tr>

                                    <tr>
                                        <td align="right">User Name: </td><td> <input type="text" align="left" name="userName"/></td>
                                    </tr>
                                    <tr></tr> <tr></tr> <tr></tr>
                                     <tr>
                                        <td align="right">Password </td><td> <input type="password" align="left" name="password"/></td>
                                    </tr>

                                    <tr>
                                        <td align="right">Role : </td>
                                        <td>
                                            <select name="role">
                                                <option>--Choose ----</option>
                                                <option>I am a  student</option>
                                                <option>I am an instructor</option>
                                                <option>I am a TA</option>
                                            </select>
                                        </td>
                                    </tr>


                                   <tr>
                                        <td>
                                             <input type="submit" form="mreg" align="right" value='Submit' />
                                        </td>


                                        <td>
                                            <input type="reset" align="left"value='Reset'  />
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
