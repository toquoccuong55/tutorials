<%-- 
    Document   : viewAccount
    Created on : Dec 19, 2017, 4:24:08 AM
    Author     : toquo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Accounts</title>
        <link href="css/guestStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
    <center>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <font folor="red"><h3><a href="admin.jsp">Back to Admin Page</a></h3></font>
            <div id="content_block">
                <!--Right Block Starts -->
                <div id="right_block" style="width:100%"> 
                    <form action="MainController" method="POST" >
                        <h1>View Employee Accounts</h1>
                        <c:if test="${not empty requestScope.accountList}">
                            <fieldset>
                                <table style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>Username</th>
                                            <th>Full name</th>
                                            <th>Email</th>
                                            <th>Phone</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.accountList}" var="dto">
                                            <tr>
                                                <td>${dto.username}</td>
                                                <td>${dto.fullname}</td>
                                                <td>${dto.email}</td>
                                                <td>${dto.phone}</td>
                                                <td>
                                                    <c:url var="delete" value="MainController">
                                                        <c:param name="action" value="deleteAccount"/>
                                                        <c:param name="txtUsername" value="${dto.username}"/>
                                                    </c:url>
                                                    <a href="${delete}">Delete</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                            </fieldset>
                        </c:if>
                    </form>
                </div>
                <!--Right Block Ends -->
                <!--Content Block Ends -->
            </div>
        </div>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
