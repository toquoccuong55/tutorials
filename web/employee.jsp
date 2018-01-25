<%-- 
    Document   : employee
    Created on : Dec 6, 2017, 11:26:26 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
        <link href="css/employeeStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
    <center>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <div id="content_block">
                <!--Left Block Starts -->
                <div id="left_block" style="width:25%">
                    <!--tạo 1 suggestion-->
                    <form action="MainController" method="POST">
                        <h1>Hi, ${sessionScope.txtUsername}</h1>
                        <fieldset>
                            <h3>Suggest New Event:</h3>
                        </fieldset>
                        <a href="suggest.jsp" id="Submit">Make a Suggestion</a>
                    </form>
                    <!--xem lại suggestion đã tạo-->
                    <form action="MainController" method="POST">
                        <fieldset>
                            <h3>View Suggested Event:</h3>
                        </fieldset>
                        <input type="submit" id="Submit" value="View Suggested Event" name="action">
                    </form>

                </div>
                <!--Left Block Ends 
                
                <!--Content Block Ends -->
            </div>
        </div>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
