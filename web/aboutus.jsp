<%-- 
    Document   : aboutus
    Created on : Dec 19, 2017, 5:37:33 AM
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
        <%@include file="header.jsp" %>
    <center>
        <div id="sub_block1">
            <!--Content Block Starts -->
            <div id="content_block">
                <!--Left Block Starts -->
                <div id="left_block" style="width:100%">
                    <span class="blk1_lp" style="width:100%"> 
                        <form action="MainController" method="POST">
                            <span class="our">About us</span> 
                            <br><br>
                            Tổ chức giáo dục FPT<br>
                            Văn phòng Hà Nội<br>
                            Khu Giáo dục và Đào tạo - Khu Công nghệ cao Hòa Lạc - Km29 Đại lộ Thăng Long, Thạch Thất, TP.Hà Nội<br>
                            <br>
                            Văn phòng Đà Nẵng<br>
                            137 Nguyễn Thị Thập, Quận Liên Chiểu, TP.Đà Nẵng<br>
                            <br>
                            Văn phòng Hồ Chí Minh<br>
                            Lầu 2, tòa nhà Innovation, lô 24 - CVPM Quang Trung - P.Tân Chánh Hiệp, Quận 12, TP.HCM<br>
                            <br>
                            Văn phòng Cần Thơ<br>
                            160 đường 30/4, Q.Ninh Kiều, TP.Cần Thơ<br>
                            <br>
                            Văn phòng Tây Nguyên<br>
                            Số 27, Tòa nhà VIB (Tầng 2), đường Nguyễn Tất Thành, Tân Lợi, TP.Buôn Ma Thuột, Đắk Lắk<br>

                        </form>
                    </span>
                </div>
                <!--Left Block Ends -->

                <!--Content Block Ends -->
            </div>
        </div>
    </center>
    <%@include file="footer.jsp" %>
</body>
</html>
