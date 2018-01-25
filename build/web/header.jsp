<%-- 
    Document   : header
    Created on : Dec 8, 2017, 9:06:22 AM
    Author     : toquo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/loginStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <center>
            <div id="main_block">
                <!--Top Block Starts -->
                <div id="top_block">
                    <div class="navi"> 
                        <a href="newIndex.jsp" class="navi_hm">Home</a> 
                        <a href="MainController?action=loadCategory" class="navi_tx">Category</a> 
                        <a href="aboutus.jsp" class="navi_tx">About</a> 
                        <a href="contact.jsp" class="navi_tx">Contact</a> 
                        <a href="newIndex.jsp" class="navi_tx">Logout</a> 
                    </div>
                    <div class="tp_img1">
                        <div class="tp_img2"> 
                            <a href="newIndex.jsp">
                                <img src="images/logo.gif" alt="" width="211" height="131" class="logo" />
                            </a> <img src="images/tp_tx.gif" alt="" width="450" height="49" class="tp_tx" /> </div>
                    </div>
                </div> 
               <!--Top Block Ends -->
            </div>
        </center>
    </body>
</html>
