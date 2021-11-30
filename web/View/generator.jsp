<%-- 
    Document   : generator
    Created on : Nov 30, 2021, 11:47:43 AM
    Author     : Admin
--%>

<%@page import="model.MyRect"%>
<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% //implicit 
            ArrayList<MyRect> rects = (ArrayList<MyRect>)request.getAttribute("rects");
            MyRect rect = (MyRect)request.getAttribute("rect");
        %>
    </head>
    <body>
        <canvas id="myCanvas" width="500" height="500" style="border:1px solid #d3d3d3;">
        Your browser does not support the HTML5 canvas tag.</canvas>
        
        <%for (MyRect r : rects) {%>      
            <script>
                var c = document.getElementById("myCanvas");
                var ctx = c.getContext("2d");
                ctx.beginPath();
                ctx.rect(<%=r.getX()%>, <%=r.getY()%>, <%=r.getW()%>, <%=r.getH()%>);
                ctx.stroke();
            </script> 
            <%}%>
        

       
    </body>
</html>
