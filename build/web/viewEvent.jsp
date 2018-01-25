<%-- 
    Document   : editEvent
    Created on : Dec 11, 2017, 9:23:10 AM
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
                <div id="right_block" style="width:100%"> 
                    <form action="MainController" method="POST" >
                        <h1>View Events</h1>
                        <c:if test="${empty requestScope.viewEvent}">
                            <h2>No record is matched</h2>
                        </c:if>
                        <c:if test="${not empty requestScope.viewEvent}">
                            <fieldset>
                                <table style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>Poster</th>
                                            <th>Event ID</th>
                                            <th>Event Name</th>
                                            <th>Start</th>
                                            <th>Finish</th>
                                            <th>Address</th>
                                            <th>Minimum</th>
                                            <th>Maximum</th>
                                            <th>Fee</th>
                                            <th>Category</th>
                                            <th>Description</th>
                                            <th>Status</th>
                                            <th>Delete</th>
                                            <th>Update</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.viewEvent}" var="dto">
                                            <tr>
                                                <td>
                                                    <div>
                                                        <img src="${dto.poster}" width="50" height="50">
                                                    </div>
                                                </td>
                                                <td>${dto.eventid}</td>
                                                <td>${dto.eventname}</td>
                                                <td>${dto.start}</td>
                                                <td>${dto.finish}</td>
                                                <td>${dto.address}</td>
                                                <td>${dto.minNumber}</td>
                                                <td>${dto.maxNumber}</td>
                                                <td>${dto.fee}</td>
                                                <td>${dto.category}</td>
                                                <td>${dto.description}</td>
                                                <td>${dto.status}</td>
                                                <td>
                                                    <c:url var="deleteEvent" value="MainController">
                                                        <c:param name="action" value="Remove Event"/>                                                        
                                                        <c:param name="txtEventID" value="${dto.eventid}"/>
                                                    </c:url>
                                                    <a href="${deleteEvent}">Delete</a>
                                                </td>
                                                <td>
                                                    <c:url var="editEvent" value="MainController">
                                                        <c:param name="action" value="Edit Event"></c:param>
                                                        <c:param name="txtEventID" value="${dto.eventid}"></c:param>
                                                    </c:url>
                                                    <a href="${editEvent}">Update</a>
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
