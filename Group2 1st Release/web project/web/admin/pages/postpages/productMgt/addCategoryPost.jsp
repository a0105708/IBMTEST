<%-- 
    Document   : addItemPost
    Created on : Mar 16, 2015, 6:44:11 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String name = request.getParameter("categoryName");
    String spec = request.getParameter("categorySpec");
    
        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
        wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
         // TODO initialize WS operation arguments here
   
        // TODO process result here
        wss.CategoryEntity result = port.addCategory(name, spec);
        
        response.sendRedirect("../../category_add.jsp?addResult=true");
  %>

</html>
