<%-- 
    Document   : addItemPost
    Created on : Mar 16, 2015, 6:44:11 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String name = request.getParameter("regionName");
    String spec = request.getParameter("regionSpec");
    String country = request.getParameter("country");
    
        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
        wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
         // TODO initialize WS operation arguments here
   
        // TODO process result here
        wss.RegionEntity result = port.addRegion(name, country, spec);
        
        response.sendRedirect("../../region_add.jsp?addResult=true");
  %>

</html>
