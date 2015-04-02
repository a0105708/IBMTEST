<%-- 
    Document   : editItemPost
    Created on : Mar 17, 2015, 2:37:41 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%-- start web service invocation --%><hr/>
    <%
	wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
	wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long id = Long.valueOf(request.getParameter("itemId"));
	java.lang.String cateName = request.getParameter("category");
	java.lang.String regionName = request.getParameter("country");
	java.lang.String wineryName = request.getParameter("winery");
	java.lang.String itemName = request.getParameter("name");
	java.lang.String vitage = request.getParameter("vintage");
	javax.xml.datatype.XMLGregorianCalendar expiringDate = null;
	java.lang.String tastingNote = request.getParameter("tastingNote");
	// TODO process result here
	boolean result = port.updateItem(id, cateName, regionName, wineryName, itemName, vitage, expiringDate, tastingNote);
  
        response.sendRedirect("../../item_view.jsp?editResult=true");
    %>
    <%-- end web service invocation --%><hr/>

</html>
