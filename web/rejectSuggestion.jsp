<%-- 
    Document   : addNewEvent
    Created on : Dec 10, 2017, 8:45:41 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="cuongto.dtos.SuggestionDTO"%>
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
            <font folor="red"><h3><a href="admin.jsp">Back to Admin Page</a></h3></font>
            <!--Content Block Starts -->
            <c:if test="${not empty requestScope.rejectSuggestion}">
                <div id="content_block">
                    <form action="MainController" method="POST">
                        <h1>Fill in the Reject Suggestion Form</h1>
                        <fieldset>
                            <legend><span class="number">1</span>Reject Suggestion Info</legend>
                            <label for="name">Poster:</label>
                            <input type="text" id="name" name="txtPoster" readonly="true" value="${requestScope.rejectSuggestion.poster}" >

                            <label for="name">Event Name:</label>
                            <input type="text" id="name" name="txtEventname" readonly="true" value="${requestScope.rejectSuggestion.eventname}">

                            <label for="name">Start:</label>
                            <input type="date" id="name" name="txtStart" readonly="true" value="${requestScope.rejectSuggestion.start}">
                            
                            <label for="name">Finish:</label>
                            <input type="date" id="name" name="txtFinish" readonly="true" value="${requestScope.rejectSuggestion.finish}">

                            <label for="name">Address:</label>
                            <input type="text" id="name" name="txtAddress" readonly="true" value="${requestScope.rejectSuggestion.address}">
                            
                            <label for="name">Minimum Participant Number:</label>
                            <input type="number" id="name" name="txtMinNumber" readonly="true" value="${requestScope.rejectSuggestion.minNumber}">
                            
                            <label for="name">Maximum Participant Number:</label>
                            <input type="number" id="name" name="txtMaxNumber" readonly="true" value="${requestScope.rejectSuggestion.maxNumber}">
                            
                            <label for="name">Fee:</label>
                            <input type="number" id="name" name="txtFee" readonly="true" value="${requestScope.rejectSuggestion.fee}">
                            
                            <label for="name">Category:</label>
                            <input type="text" id="name" name="txtCategory" readonly="true" value="${requestScope.rejectSuggestion.category}">
                            
                            <label for="name">Description:</label>
                            <input type="text" id="name" name="txtDescription" readonly="true" value="${requestScope.rejectSuggestion.description}">
                            
                            <label for="name">Suggestor:</label>
                            <input type="text" id="name" name="txtSuggestor" readonly="true" value="${requestScope.rejectSuggestion.suggestor}">
                            
                            <label for="name">Reason:</label>
                            <input type="text" id="name" name="txtReason">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.suggestor}</font>
                            </c:if>

                        </fieldset>

                        <input type="submit" id="Submit" value="Reject Suggestion" name="action">
                    </form>
                    <!--Left Block Starts -->
                    <!--<div id="left_block">-->
                </div>
            </c:if>

            <!--trong trường hợp addNewEvent không có kết quả thì lấy kết quả từ param-->
            <c:if test="${empty requestScope.rejectSuggestion}">
                <div id="content_block">
                    <form action="MainController" method="POST">
                        <h1>Please fill in the Reject Suggestion Form</h1>
                        <fieldset>
                            <legend><span class="number">1</span>Reject Suggestion Info</legend>
                            <label for="name">Poster:</label>
                            <input type="text" id="name" name="txtPoster" value="${param.txtPoster}" >

                            <label for="name">Event Name:</label>
                            <input type="text" id="name" name="txtEventname" value="${param.txtEventname}">
                            
                            <label for="name">Start:</label>
                            <input type="date" id="name" name="txtStart" value="${param.txtStart}">
                            
                            <label for="name">Finish:</label>
                            <input type="date" id="name" name="txtFinish" value="${param.txtFinish}">
                            
                            <label for="name">Address:</label>
                            <input type="text" id="name" name="txtAddress" value="${param.txtAddress}">
                            
                            <label for="name">Minimum Participant Number:</label>
                            <input type="number" id="name" name="txtMinNumber" value="${param.txtMinNumber}">
                            
                            <label for="name">Maximum Participant Number:</label>
                            <input type="number" id="name" name="txtMaxNumber" value="${param.txtMaxNumber}">
                            
                            <label for="name">Fee:</label>
                            <input type="number" id="name" name="txtFee" value="${param.txtFee}">
                            
                            <label for="name">Category:</label>
                            <input type="text" id="name" name="txtCategory" value="${param.txtCategory}">
                            
                            <label for="name">Description:</label>
                            <input type="text" id="name" name="txtDescription" value="${param.txtDescription}">
                            
                            <label for="name">Suggestor:</label>
                            <input type="text" id="name" name="txtSuggestor" value="${param.txtSuggestor}">
                            
                            <label for="name">Reason:</label>
                            <input type="text" id="name" name="txtReason" value="${param.txtReason}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.reason}</font>
                            </c:if>

                        </fieldset>

                        <input type="submit" id="Submit" value="Reject Suggestion" name="action">
                    </form>
                    <!--Left Block Starts -->
                    <!--<div id="left_block">-->
                </div>
            </c:if>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
