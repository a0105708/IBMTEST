<%-- 
    Document   : createProductReportPost
    Created on : Apr 7, 2015, 6:52:29 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String itemId=session.getAttribute("itemId").toString();
    String startYear = request.getParameter("startYear");
    String startMonth = request.getParameter("startMonth");
    String endYear = request.getParameter("endYear");
    String endMonth = request.getParameter("endMonth");
    System.out.println(itemId+"hahahahah");
   
        wss.ReportMgtWS_Service service = new wss.ReportMgtWS_Service();
        wss.ReportMgtWS port = service.getReportMgtWSPort();
         // TODO initialize WS operation arguments here
        java.lang.Integer StartYear = Integer.valueOf(startYear);
        java.lang.Integer StartMonth = Integer.valueOf(startMonth);
        java.lang.Integer EndYear = Integer.valueOf(endYear);
        java.lang.Integer EndMonth=Integer.valueOf(endMonth);
        java.lang.Long itemID=Long.valueOf(itemId);
        // TODO process result here
        port.createProductReport(itemID,StartYear,StartMonth,EndYear,EndMonth);
        
        response.sendRedirect("../../report_productReportList.jsp?addReportResult=true");
  %>

</html>