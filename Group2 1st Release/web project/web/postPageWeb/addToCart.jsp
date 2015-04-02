<%-- 
    Document   : addToCart
    Created on : Mar 28, 2015, 5:20:58 PM
    Author     : HanXiangyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    in page
        <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.PurchaseMgtWS_Service service = new wss.PurchaseMgtWS_Service();
	wss.PurchaseMgtWS port = service.getPurchaseMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long accountId = Long.parseLong(request.getParameter("userId"));
	java.lang.Long itemId = Long.parseLong(request.getParameter("itemId"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	port.addItems(accountId, itemId, quantity);
        response.sendRedirect("../products.jsp?addResult=true");
    } catch (Exception ex) {
        System.out.println(ex);
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
