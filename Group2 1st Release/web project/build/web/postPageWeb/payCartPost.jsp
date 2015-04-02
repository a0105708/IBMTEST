<%-- 
    Document   : payCartPost
    Created on : Mar 28, 2015, 9:38:45 PM
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
	java.lang.Long accountId = Long.parseLong(request.getParameter("accountId"));
	java.lang.String address = request.getParameter("address");
	java.lang.String creditCard = request.getParameter("cardNumber");
	java.lang.Double totalPrice = Double.parseDouble(request.getParameter("totalCost"));
	// TODO process result here
	java.lang.Long result = port.addPaymentInfo(accountId, address, creditCard, totalPrice);
        
        port.payShoppingCart(accountId, result);
        
        response.sendRedirect("../products.jsp?payResult=true");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        System.out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
</html>
