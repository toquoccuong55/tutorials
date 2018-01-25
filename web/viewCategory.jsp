<%-- 
    Document   : viewCategory
    Created on : Dec 15, 2017, 7:59:56 PM
    Author     : toquo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <div id="left_block" style="width:50%"> 
                    <form action="MainController" method="POST" >
                        <h1>View Category</h1>
                        <c:if test="${empty requestScope.viewCategory}">
                            <h2>No record is matched</h2>
                        </c:if>
                        <c:if test="${not empty requestScope.viewCategory}">
                            <fieldset>
                                <table style="width:100%">
                                    <thead>
                                        <tr t>
                                            <th>Category Name</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.viewCategory}" var="dto">
                                        <tr>
                                            <td>
                                                <input type="text" name="txtCategory" value="${dto}">
                                            </td>
                                            <td>
                                                <c:url var="deleteCategory" value="MainController">
                                                    <c:param name="action" value="deleteCategory"/>
                                                    <c:param name="category" value="${dto}"/>
                                                </c:url>
                                                <a href="${deleteCategory}">Delete</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                                <input type="submit" name="action" value="Update Category">
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
