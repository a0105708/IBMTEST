<%-- 
    Document   : deleteCommentPost
    Created on : Mar 17, 2015, 4:03:53 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%-- start web service invocation --%><hr/>
    <%
	wss.ProductMgtWS_Service service = new wss.ProductMgtWS_Service();
	wss.ProductMgtWS port = service.getProductMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long arg0 = Long.valueOf(request.getParameter("commentId"));
        String itemId = request.getParameter("itemId"); 
	// TODO process result here
	boolean result = port.removeComment(arg0);
        
        response.sendRedirect("../../viewSingleComment.jsp?itemId="+itemId+"&deleteCommentResult=true");
    %>
    <%-- end web service invocation --%><hr/>

</html>
