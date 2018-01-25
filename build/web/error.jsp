<%-- 
    Document   : error
    Created on : Dec 6, 2017, 11:25:48 PM
    Author     : toquo
--%>

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

            <div id="content_block">

                <div id="left_block" style="width:20%">
                    <h2><a href="newIndex.jsp">Back to Login Page</a></h2>
                </div>
                <div id="right_block">
                    <h1><font color="red">${requestScope.ERROR}</font></h1>
                </div>
            </div>
        </div>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
