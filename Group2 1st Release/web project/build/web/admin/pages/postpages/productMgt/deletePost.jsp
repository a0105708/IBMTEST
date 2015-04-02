<%-- 
    Document   : deletePost
    Created on : Mar 16, 2015, 10:35:04 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
	wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
	wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
	 // TODO initialize WS operation arguments here
        String itemID = request.getParameter("itemId");
	// TODO process result here
	boolean result = port.removeItem(itemID);
        
        response.sendRedirect("../../item_view.jsp?deleteResult=true");
    %>

</html>
