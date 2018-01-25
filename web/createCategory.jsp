<%-- 
    Document   : createCategory
    Created on : Dec 13, 2017, 11:13:11 PM
    Author     : toquo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Category</title>
        <link href="css/insertStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
    <center>
        <div id="sub_block1">
            <font folor="red"><h3><a href="admin.jsp">Back to Admin Page</a></h3></font>
            <!--Content Block Starts -->

            <div id="content_block">
                <form action="MainController" method="POST">
                    <h1>Fill in the name of category</h1>
                    <fieldset>
                        <label for="name">Category:</label>
                        <input type="text" id="name" name="txtCategory">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.category}</font>
                        </c:if>
                    </fieldset>
                    <input type="submit" id="Submit" value="Create New Category" name="action">
                </form>
                <!--Left Block Starts -->
                <!--<div id="left_block">-->
            </div>

    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
