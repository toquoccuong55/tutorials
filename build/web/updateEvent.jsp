<%-- 
    Document   : updateEvent
    Created on : Dec 13, 2017, 10:01:25 PM
    Author     : toquo
--%>

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

            <div id="content_block">
                <form action="MainController" method="POST">
                    <c:if test="${not empty requestScope.DTO}">
                        <h1>Update Event Page</h1>
                        <fieldset>
                            <legend><span class="number">1</span>Update Event Info</legend>
                            <label for="name">Poster:</label>
                            <input type="file" id="name" name="txtPoster" value="${requestScope.DTO.poster}" >
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.poster}</font>
                            </c:if>

                            <label for="name">Event ID:</label>
                            <input type="text" id="name" name="txtEventID" readonly="true" value="${requestScope.DTO.eventid}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventid}</font>
                            </c:if>

                            <label for="name">Event Name:</label>
                            <input type="text" id="name" name="txtEventname" value="${requestScope.DTO.eventname}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.eventname}</font>
                            </c:if>

                            <label for="name">Start:</label>
                            <input type="date" id="name" name="txtStart" value="${requestScope.DTO.start}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.start}</font>
                            </c:if>

                            <label for="name">Finish:</label>
                            <input type="date" id="name" name="txtFinish" value="${requestScope.DTO.finish}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.finish}</font>
                            </c:if>

                            <label for="name">Address:</label>
                            <input type="text" id="name" name="txtAddress" value="${requestScope.DTO.address}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.address}</font>
                            </c:if>

                            <label for="name">Minimum Partipant Number:</label>
                            <input type="number" id="name" name="txtMinNumber" value="${requestScope.DTO.minNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.minNumber}</font>
                            </c:if>

                            <label for="name">Maximum Partipant Number:</label>
                            <input type="number" id="name" name="txtMaxNumber" value="${requestScope.DTO.maxNumber}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.maxNumber}</font>
                            </c:if>

                            <label for="name">Fee:</label>
                            <input type="number" id="name" name="txtFee" value="${requestScope.DTO.fee}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.fee}</font>
                            </c:if>

                            <label for="name">Category:</label>
                            <input type="text" id="name" name="txtCategory" value="${requestScope.DTO.category}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.category}</font>
                            </c:if>

                            <label for="name">Description:</label>
                            <input type="text" id="name" name="txtDescription" value="${requestScope.DTO.description}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.description}</font>
                            </c:if>

                            <label for="name">Status</label>
                            <input type="text" id="name" name="txtStatus" value="${requestScope.DTO.status}">
                            <c:if test="${requestScope.invalidInput != null}">
                                <font color="red">${requestScope.invalidInput.status}</font>
                            </c:if>

                        </fieldset>

                        <input type="submit" id="Submit" value="Update Event" name="action">
                    </c:if>
                </form>
                <!--Left Block Starts -->
                <!--<div id="left_block">-->
            </div>
            
        </div>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
