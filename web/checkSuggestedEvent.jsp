<%-- 
    Document   : checkSuggestedEvent
    Created on : Dec 9, 2017, 11:26:54 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="cuongto.dtos.SuggestionDTO"%>
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
            <font folor="red"><h3><a href="admin.jsp">Back to Administrator Page</a></h3></font>
            <div id="content_block">
                <!--Right Block Starts -->
                <div id="right_block" style="width:100%"> 
                    <form action="MainController" method="POST" >
                        <h1>Check Result</h1>
                        <c:if test="${empty requestScope.checkSuggestedEvent}">
                            <h2>No record is matched</h2>
                        </c:if>
                        <c:if test="${not empty requestScope.checkSuggestedEvent}">
                            <fieldset >
                                <table style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>Poster</th>
                                            <th>Event Name</th>
                                            <th>Start</th>
                                            <th>Finish</th>
                                            <th>Address</th>
                                            <th>Min Number</th>
                                            <th>Max Number</th>
                                            <th>Fee</th>
                                            <th>Category</th>
                                            <th>Description</th>
                                            <th>Suggestor</th>
                                            <th>Approve</th>
                                            <th>Reject</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.checkSuggestedEvent}" var="dto">
                                            <tr>
                                                <td>
                                                    <img src="${dto.poster}" width="50" height="50">
                                                </td>
                                                <td>${dto.eventname}</td>
                                                <td>${dto.start}</td>
                                                <td>${dto.finish}</td>
                                                <td>${dto.address}</td>
                                                <td>${dto.minNumber}</td>
                                                <td>${dto.maxNumber}</td>
                                                <td>${dto.fee}</td>
                                                <td>${dto.category}</td>
                                                <td>${dto.description}</td>
                                                <td>${dto.suggestor}</td>
                                                <td>
                                                    <c:url var="approveSuggestion" value="MainController">
                                                        <c:param name="action" value="Approve"></c:param>
                                                        <c:param name="txtEventname" value="${dto.eventname}"></c:param>
                                                    </c:url>
                                                    <a href="${approveSuggestion}">Approve</a>
                                                </td>
                                                <td>
                                                    <c:url var="rejecting" value="MainController">
                                                        <c:param name="action" value="Reject"/>
                                                        <c:param name="txtEventname" value="${dto.eventname}"/>
                                                    </c:url>
                                                    <a href="${rejecting}">Reject</a>
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
