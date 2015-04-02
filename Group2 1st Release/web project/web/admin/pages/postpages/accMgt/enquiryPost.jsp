<%-- 
    Document   : enquiryPost
    Created on : Mar 13, 2015, 5:42:24 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <%
   String enquiryId = request.getParameter("enquiryId");
   String message = request.getParameter("message");
   System.out.println("EnquiryId: "+enquiryId);
	wss.EnquiryWebService_Service service = new wss.EnquiryWebService_Service();
	wss.EnquiryWebService port = service.getEnquiryWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.Long adminId = Long.valueOf(1);
	java.lang.Long enquiry = Long.parseLong(enquiryId);
	java.lang.String replyContent = message;
	port.processEnquiry(adminId, enquiry, replyContent);
        
        response.sendRedirect("../../enquiry.jsp?replyResult=success");

   %>
</html>
