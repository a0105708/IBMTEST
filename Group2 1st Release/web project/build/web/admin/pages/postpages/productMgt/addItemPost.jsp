<%-- 
    Document   : addItemPost
    Created on : Mar 16, 2015, 6:44:11 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String name = request.getParameter("name");
    String price = request.getParameter("tastingNote");
    String vintage = request.getParameter("vintage");
    String category = request.getParameter("category");
    String winery = request.getParameter("winery");
    String region = request.getParameter("country");
   
        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
        wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
         // TODO initialize WS operation arguments here
        java.lang.String cateName = category;
        java.lang.String regionName = region;
        java.lang.String wineryName = winery;
        java.lang.String itemName = name;
        java.lang.String vitage = vintage;
        javax.xml.datatype.XMLGregorianCalendar expiringDate = null;
        java.lang.String tastingNote = price;
        // TODO process result here
        wss.ItemEntity result = port.addItem(cateName, regionName, wineryName, itemName, vitage, expiringDate, tastingNote);
        
        response.sendRedirect("../../item.jsp?addItemResult=success");
  %>

</html>
