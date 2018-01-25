<%-- 
    Document   : admin
    Created on : Dec 6, 2017, 11:26:11 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/employeeStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
        <center>
        <>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <div id="content_block">
                <!--Left Block Starts -->
                <div id="left_block" style="width:25%">
                    
                    <!--Account management-->
                    <form action="MainController" method="POST">
                        <h1>Hi, ${sessionScope.txtUsername}</h1>
                        <fieldset>
                            <h3 for="job">Account Management:</h3>
                            <span class="usr">No Account Yet? <a href="insert.jsp">Register</a></span>
                            <span class="usr">View all accounts <a href="MainController?action=viewAccounts">Click here</a></span>
                        </fieldset>
                    </form>

                    <!--check suggested event-->
                    <form action="MainController" method="POST">
                        <fieldset>
                            <h3>Check Suggested Event</h3>
                        </fieldset>
                        <input type="submit" id="Submit" value="Check Suggested Event" name="action">
                    </form>

                    <!--create new event-->
                    <form action="MainController" method="POST">
                        <fieldset>
                            <h3>Event Management:</h3>
                        </fieldset>
                        <h2><a href="addNewEvent.jsp">Create New Event</a></h2>
                        <input type="submit" id="Submit" name="action" value="View event">
                    </form>


                    <form action="MainController" method="POST">
                        <fieldset>
                            <h3>Category Management:</h3>
                        </fieldset>
                        <h2><a href="createCategory.jsp">Create New Category</a></h2>
                        <input type="submit" id="Submit" name="action" value="View Category">
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
