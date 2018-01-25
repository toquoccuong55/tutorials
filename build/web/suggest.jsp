<%-- 
    Document   : suggest
    Created on : Dec 9, 2017, 1:27:04 PM
    Author     : toquo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <font folor="red"><h3><a href="employee.jsp">Back to Employee Page</a></h3></font>
            <!--Content Block Starts -->
            <div id="content_block">
                <form action="MainController" method="POST">
                    <h1>Please fill in the Suggestion Form</h1>
                    <fieldset>
                        <legend><span class="number">1</span>Suggestion Info</legend>
                        <label for="name">Poster:</label>
                        <input type="file" id="name" name="txtPoster" value="${param.txtPoster}">
                        <c:if test="${requestScope.invalidInput != null}">
                            <font color="red">${requestScope.invalidInput.poster}</font>
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
                            
                        <label for="name">Maximum Partipant Number:</label value="${param.txtMaxNumber}">
                        <input type="number" id="name" name="txtMaxNumber">
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
                            
                    </fieldset>

                    <input type="submit" id="Submit" value="Make a Suggestion" name="action">
                </form>
                <!--Left Block Starts -->
                <!--<div id="left_block">-->
            </div>            
        </div>
    </center>
        <%@include file="footer.jsp" %>
    </body>
</html>
