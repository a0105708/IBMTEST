<%-- 
    Document   : addItemPost
    Created on : Mar 16, 2015, 6:44:11 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String name = request.getParameter("wineryName");
    String address = request.getParameter("wineryAddress");
    String contact = request.getParameter("wineryContact");
    
        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
        wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
         // TODO initialize WS operation arguments here
   
        // TODO process result here
        wss.WineryEntity result = port.addWinery(name, address, contact);
        
        response.sendRedirect("../../winery_add.jsp?addResult=true");
  %>

</html>
