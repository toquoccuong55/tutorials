<%-- 
    Document   : insert
    Created on : Dec 8, 2017, 10:45:35 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/insertStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
        <center>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <div id="content_block">
                <form action="MainController" method="POST">

                    <h1>Sign Up</h1>

                    <fieldset>
                        <legend><span class="number">1</span>Your basic info</legend>
                        <label for="name">Username:</label>
                        <input type="text" id="name" name="txtUsername" value="${param.txtUsername}">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.username}</font>
                        </c:if>
                        
                        <label for="name">Password:</label>
                        <input type="password" id="name" name="txtPassword">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.password}</font>
                        </c:if>
                        
                        <label for="name">Confirm:</label>
                        <input type="password" id="name" name="txtConfirm">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.confirm}</font>
                        </c:if>
                        
                        <label for="name">Fullname:</label>
                        <input type="text" id="name" name="txtFullname" value="${param.txtFullname}">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.fullname}</font>
                        </c:if>

                        <label for="mail">Email:</label>
                        <input type="email" id="mail" name="txtEmail" value="${param.txtEmail}">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.email}</font>
                        </c:if>

                        <label for="name">Phone:</label>
                        <input type="number" id="name" name="txtPhone" value="${param.txtPhone}">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.phone}</font>
                        </c:if>

                    </fieldset>
                    <fieldset>
                        <label for="job">Job Role:</label>
                        <select id="job" name="user_job">
                            <option value="admin">Administrator</option>
                            <option value="employee">Employee</option>
                        </select>
                    </fieldset>
                    <input type="submit" id="Submit" value="Sign Up" name="action">
                </form>
                <!--Content Block Ends -->
            </div>
        </div>
    </center>
        <%@include file="footer.jsp" %>
    </body>
</html>
