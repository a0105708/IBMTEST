<%-- 
    Document   : deleteWineryPost
    Created on : Mar 17, 2015, 10:36:11 AM
    Author     : HanXiangyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
	wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String wineryId = request.getParameter("wineryId");
	// TODO process result here
	boolean result = port.removeWinery(wineryId);
        
	response.sendRedirect("../../ViewWinery.jsp?deleteResult=true");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
