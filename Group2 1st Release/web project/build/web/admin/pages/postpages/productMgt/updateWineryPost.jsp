<%-- 
    Document   : updateWineryPost
    Created on : Mar 17, 2015, 11:26:52 AM
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
	java.lang.Long id = Long.valueOf(wineryId);
	java.lang.String name = request.getParameter("wineryName");
	java.lang.String address = request.getParameter("wineryAddress");
	java.lang.String contact = request.getParameter("wineryContact");
	// TODO process result here
	boolean result = port.updateWinery(id, name, address, contact);
	response.sendRedirect("../../ViewWinery.jsp?updateResult=true");
    } catch (Exception ex) {
	out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
