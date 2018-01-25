<%-- 
    Document   : guest
    Created on : Dec 6, 2017, 11:26:51 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="cuongto.dtos.EventDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guest Page</title>
        <link href="css/guestStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%@include file="header.jsp" %>
    <center>
        <!--
        Guest.jsp cho phép người dùng tìm kiếm event theo category.
        Trước khi trang này được hiện ra, MainController gọi SearchController để
        load các category lên trước.
        -->
        
        <div id="sub_block1">
            <!--Content Block Starts -->
            <div id="content_block">
                <!--Left Block Starts -->
                <div id="left_block" style="width:30%">
                    <form action="MainController" method="POST">

                        <h1>Search by Category:</h1>
                        <fieldset>
                            <select id="job" name="user_job">
                                <c:forEach items="${sessionScope.category}" var="category">
                                    <option value="${category}">${category}</option>
                                </c:forEach>
                            </select>
                        </fieldset>
                        <input type="submit" id="Submit" value="Search" name="action">
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
