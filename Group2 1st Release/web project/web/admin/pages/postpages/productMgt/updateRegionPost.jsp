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
        java.lang.String wineryId = request.getParameter("regionId");
	java.lang.Long id = Long.parseLong(wineryId);
	java.lang.String name = request.getParameter("regionName");
	java.lang.String country = request.getParameter("country");
	java.lang.String spec = request.getParameter("regionSpec");
	// TODO process result here
	boolean result = port.updateRegion(id, name, country, spec);
	response.sendRedirect("../../region_view.jsp?updateResult=true");
    } catch (Exception ex) {
	out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
