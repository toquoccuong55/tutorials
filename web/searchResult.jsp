<%-- 
    Document   : searchResult
    Created on : Dec 9, 2017, 11:56:19 AM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="cuongto.dtos.EventDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/guestStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <!--
        searchResult.jsp dùng để hiện thị kết quả của SearchController
        -->
        
        <%@include file="header.jsp" %>
        <center>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <font folor="red"><h3><a href="MainController?action=loadCategory" >Back to Search Page</a> </h3></font>
            <div id="content_block">
                <!--Right Block Starts -->
                <div id="right_block" style="width:100%"> 
                    <form action="MainController" method="POST" >
                        <h1>Search Result</h1>
                        <c:if test="${empty requestScope.SEARCHRESULT}">
                            <h2>No record is matched</h2>
                        </c:if>
                        <c:if test="${not empty requestScope.SEARCHRESULT}">
                            <fieldset >
                                <table style="width:100%">
                                    <thead>
                                        <tr>
                                            <th>Poster</th>
                                            <th>Event Name</th>
                                            <th>Start</th>
                                            <th>Finish</th>
                                            <th>Address</th>
                                            <th>Minimum Number</th>
                                            <th>Description</th>
                                            <th>Fee</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.SEARCHRESULT}" var="dto">
                                            <tr>
                                                <td>
                                                    <div>
                                                        <img src="${dto.poster}" width="150" height="150">
                                                    </div>
                                                </td>
                                                <td>${dto.eventname}</td>
                                                <td>${dto.start}</td>
                                                <td>${dto.finish}</td>
                                                <td>${dto.address}</td>
                                                <td>${dto.minNumber}</td>
                                                <td>${dto.description}</td>
                                                <td>${dto.fee}</td>
                                                <td>${dto.status}</td>
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
