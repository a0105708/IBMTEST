<%-- 
    Document   : deleteItemPost
    Created on : Mar 28, 2015, 6:52:53 PM
    Author     : HanXiangyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.PurchaseMgtWS_Service service = new wss.PurchaseMgtWS_Service();
	wss.PurchaseMgtWS port = service.getPurchaseMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long accountId = Long.parseLong(request.getParameter("userId"));
	java.lang.Long itemId = Long.parseLong(request.getParameter("itemId"));
        
	port.removeItemFromCart(accountId, itemId);
        
        response.sendRedirect("../order.jsp?deleteResult=true");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        System.out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
