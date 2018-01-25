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
            <c:if test="${not empty requestScope.approveSuggestion}">
                <div id="content_block">
                    <form action="MainController" method="POST">
                        <h1>Please fill in the Add Event Form</h1>
                        <fieldset>
                            <legend><span class="number">1</span>Add new event Info</legend>
                            <label for="name">Poster:</label>
                            <input type="file" id="name" name="txtPoster" value="${requestScope.approveSuggestion.poster}" >
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.poster}</font>
                            </c:if>
                                
                            <label for="name">Event ID:</label>
                            <input type="text" id="name" name="txtEventID" >
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventid}</font>
                            </c:if>

                            <label for="name">Event Name:</label>
                            <input type="text" id="name" name="txtEventname" value="${requestScope.approveSuggestion.eventname}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventname}</font>
                            </c:if>

                            <label for="name">Start:</label>
                            <input type="date" id="name" name="txtStart" value="${requestScope.approveSuggestion.start}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.start}</font>
                            </c:if>

                            <label for="name">Finish:</label>
                            <input type="date" id="name" name="txtFinish" value="${requestScope.approveSuggestion.finish}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.finish}</font>
                            </c:if>

                            <label for="name">Address:</label>
                            <input type="text" id="name" name="txtAddress" value="${requestScope.approveSuggestion.address}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.address}</font>
                            </c:if>

                            <label for="name">Minimum Partipant Number:</label>
                            <input type="number" id="name" name="txtMinNumber" value="${requestScope.approveSuggestion.minNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.minNumber}</font>
                            </c:if>

                            <label for="name">Maximum Partipant Number:</label>
                            <input type="number" id="name" name="txtMaxNumber" value="${requestScope.approveSuggestion.maxNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.maxNumber}</font>
                            </c:if>

                            <label for="name">Fee:</label>
                            <input type="number" id="name" name="txtFee" value="${requestScope.approveSuggestion.fee}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.fee}</font>
                            </c:if>

                            <label for="name">Category:</label>
                            <input type="text" id="name" name="txtCategory" value="${requestScope.approveSuggestion.category}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.category}</font>
                            </c:if>

                            <label for="name">Description:</label>
                            <input type="text" id="name" name="txtDescription" value="${requestScope.approveSuggestion.description}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.description}</font>
                            </c:if>

                            <label for="name">Status</label>
                            <input type="text" id="name" name="txtStatus">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.status}</font>
                            </c:if>
                                
                        </fieldset>

                        <input type="submit" id="Submit" value="Create New Event" name="action">
                    </form>
                    <!--Left Block Starts -->
                    <!--<div id="left_block">-->
                </div>
            </c:if>

            <!--trong trường hợp addNewEvent không có kết quả thì lấy kết quả từ param-->
            <c:if test="${empty requestScope.approveSuggestion}">
                <div id="content_block">
                    <form action="MainController" method="POST">
                        <h1>Please fill in the Add Event Form</h1>
                        <fieldset>
                            <legend><span class="number">1</span>Add new event Info</legend>
                            <label for="name">Poster:</label>
                            <input type="file" id="name" name="txtPoster" value="${param.txtPoster}" >
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.poster}</font>
                            </c:if>

                            <label for="name">Event ID:</label>
                            <input type="text" id="name" name="txtEventID" value="${param.txtEventID}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventid}</font>
                            </c:if>

                            <label for="name">Event Name:</label>
                            <input type="text" id="name" name="txtEventname" value="${param.txtEventname}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventname}</font>
                            </c:if>

                            <label for="name">Start:</label>
                            <input type="date" id="name" name="txtStart" value="${param.txtStart}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.start}</font>
                            </c:if>

                            <label for="name">Finish:</label>
                            <input type="date" id="name" name="txtFinish" value="${param.txtFinish}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.finish}</font>
                            </c:if>

                            <label for="name">Address:</label>
                            <input type="text" id="name" name="txtAddress" value="${param.txtAddress}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.address}</font>
                            </c:if>

                            <label for="name">Minimum Partipant Number:</label>
                            <input type="number" id="name" name="txtMinNumber" value="${param.txtMinNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.minNumber}</font>
                            </c:if>

                            <label for="name">Maximum Partipant Number:</label>
                            <input type="number" id="name" name="txtMaxNumber" value="${param.txtMaxNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.maxNumber}</font>
                            </c:if>

                            <label for="name">Fee:</label>
                            <input type="number" id="name" name="txtFee" value="${param.txtFee}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.fee}</font>
                            </c:if>

                            <label for="name">Category:</label>
                            <input type="text" id="name" name="txtCategory" value="${param.txtCategory}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.category}</font>
                            </c:if>

                            <label for="name">Description:</label>
                            <input type="text" id="name" name="txtDescription" value="${param.txtDescription}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.description}</font>
                            </c:if>

                            <label for="name">Status</label>
                            <input type="text" id="name" name="txtStatus" value="${param.txtStatus}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.status}</font>
                            </c:if>

                        </fieldset>

                        <input type="submit" id="Submit" value="Create New Event" name="action">
                    </form>
                    <!--Left Block Starts -->
                    <!--<div id="left_block">-->
                </div>
            </c:if>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
