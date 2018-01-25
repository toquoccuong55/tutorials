<%-- 
    Document   : newIndex
    Created on : Dec 8, 2017, 9:11:02 AM
    Author     : toquo
     sdfs
     df
     sd
     fs
     df
     sd
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/loginStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
        <center>
            <div id="sub_block1" style="color: red">
                <!--Content Block Starts -->
                <div id="content_block">
                    <!--Left Block Starts -->
                    <div id="left_block">
                        <span class="blk1_lp"> 
                            <form action="MainController" method="POST">
                                <span class="our">Member Login</span> 
                                <span class="usr" style="margin-top:12px;">User Login</span>
                                <input name="txtUsername" type="text" class="txbx" />
                                <br>
                                <c:if test="${requestScope.invalidInput != null}">
                                    <font color="red">${requestScope.invalidInput.username}</font>
                                </c:if>
                                
                                <span class="usr">Password</span>
                                <input name="txtPassword" type="password" class="txbx" />
                                <br>
                                <c:if test="${requestScope.invalidInput != null}">
                                    <font color="red">${requestScope.invalidInput.password}</font>
                                </c:if>
                                <input name="action" type="submit" class="smt" value="Login" />
                            </form>
                        </span>
                    </div>
                    <div id="left_block">
                        <span class="blk1_lp"> 
                            <form action="MainController" method="POST">
                                <span class="our">Member Login</span> 
                                <span class="usr" style="margin-top:12px;">User Login</span>
                                <input name="txtUsername" type="text" class="txbx" />
                                <br>
                                <c:if test="${requestScope.invalidInput != null}">
                                    <font color="red">${requestScope.invalidInput.username}</font>
                                </c:if>
                                
                                <span class="usr">Password</span>
                                <input name="txtPassword" type="password" class="txbx" />
                                <br>
                                <c:if test="${requestScope.invalidInput != null}">
                                    <font color="red">${requestScope.invalidInput.password}</font>
                                </c:if>
                                <input name="action" type="submit" class="smt" value="Login" />
                            </form>
                        </span>
                    </div>
                    <!--Left Block Ends -->
                    
                    <!--Content Block Ends -->
                </div>
            </div>
        </center>
        <%@include file="footer.jsp" %>
    </body>
</html>
