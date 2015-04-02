<%-- 
    Document   : deleteAccountPost
    Created on : Mar 8, 2015, 10:56:56 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
        String account = request.getParameter("accountId");
	java.lang.String accountId = account;
	// TODO process result here
	boolean result = port.deleteAccount(accountId);
    
        response.sendRedirect("../../AccountTables.jsp?deleteResult=true");
    %>

</html>
